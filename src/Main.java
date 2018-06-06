import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import grahamcompiler.AST.ASTBuilder;
import grahamcompiler.AST.ASTPrinter;
import grahamcompiler.AST.node.ProgNode;
import grahamcompiler.IR.IRBase.DataSection;
import grahamcompiler.IR.IRBase.IRGenerator;
import grahamcompiler.IR.IRBase.IRPrinter;
import grahamcompiler.IR.IRInstruction;
import grahamcompiler.IR.IRType.Class;
import grahamcompiler.Translator.NasmPrinter;
import grahamcompiler.Translator.Translator;
import grahamcompiler.utility.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import Parser.*;

public class Main {
    public static void checkSemantic(ProgNode progNode) {
        Scope topLevelScope = new Scope(true);
        ERROR handle = new ERROR();
        topLevelScope.Initialize();
        ScopeCollector scopeCollector = new ScopeCollector(topLevelScope, handle);
        scopeCollector.process(progNode);
        FunctionCollector functionCollector = new FunctionCollector(topLevelScope, handle);
        functionCollector.process(progNode);
        Semantic semanticChecker = new Semantic(topLevelScope, handle);
        semanticChecker.process(progNode);
    }

    public static ProgNode buildAST(InputStream is) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(is);
        MxsLexer lexer = new MxsLexer(input);
//        lexer.addErrorListener(MxsErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MxsParser parser = new MxsParser(tokens);
//        parser.addErrorListener(MxsErrorListener.INSTANCE);
        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();
        ASTBuilder builder = new ASTBuilder();
        walker.walk(builder, tree);

        return builder.getProgram();
    }
    
    public static void printAST(ProgNode program) throws Exception {
        FileOutputStream outputStream = new FileOutputStream("Test/TestSemantic/test_result.txt");
        ASTPrinter printer = new ASTPrinter();
        printer.PrintAST(program, outputStream);
    }

    public static IRGenerator generateIR(ProgNode program) {
        IRGenerator irGenerator = new IRGenerator(program);
        irGenerator.BuildIR();
        return irGenerator;
    }

    public static void translate(IRGenerator irGenerator, OutputStream outputStream) {
        Translator translator = new Translator(irGenerator.getEntry(), irGenerator.getInitializeEntry(),
                irGenerator.getDataSection(), irGenerator.getDataZone(), irGenerator.getBssZone());
        translator.process();
        NasmPrinter nasmPrinter = new NasmPrinter(translator.getNasmInsts(), translator.getDataInsts(),
                translator.getDataZoneInsts(), translator.getBssZoneInsts(),
                irGenerator.getGlobalName(), outputStream);
        nasmPrinter.printNasm();
    }
    
    public static void printIR(IRGenerator irGenerator) throws Exception {
        FileOutputStream outputStream = new FileOutputStream("Test/IRtest_result.txt");
        IRInstruction entry = irGenerator.getEntry();
        List<Class> typeList = irGenerator.getTypes();
        DataSection dataSection = irGenerator.getDataSection();
        IRPrinter irPrinter = new IRPrinter(entry, irGenerator.getInitializeEntry(), outputStream, typeList, dataSection);
        irPrinter.printIR();
    }

    public static void main(String[] args) throws Exception {
        //     InputStream is = System.in;
        //InputStream is = new FileInputStream("Test/TestSemantic/text.txt");
        InputStream is = new FileInputStream("program.txt");
        OutputStream out = System.out;
        ProgNode program = buildAST(is);
  //      printAST(program);
        checkSemantic(program);
        IRGenerator irGenerator = generateIR(program);
  //      printIR(irGenerator);
        translate(irGenerator,out);
    }

}

