import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import grahamcompiler.AST.ASTBuilder;
import grahamcompiler.AST.ASTPrinter;
import grahamcompiler.AST.node.ProgNode;
import grahamcompiler.utility.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.tree.*;
import Parser.*;

public class main {
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

    public static void printAST(ProgNode program) throws Exception {
        //FileOutputStream outputStream = new FileOutputStream("Test/TestSemantic/test_result.txt");
        ASTPrinter printer = new ASTPrinter();
        printer.PrintAST(program, outputStream);
    }

    public static void main(String[] args) throws Exception {
        //     InputStream is = System.in;
        //InputStream is = new FileInputStream("Test/TestSemantic/text.txt");
               InputStream is = new FileInputStream("program.txt");
        ANTLRInputStream input = new ANTLRInputStream(is);
        MxsLexer lexer = new MxsLexer(input);
//        lexer.addErrorListener(MxsErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MxsParser parser = new MxsParser(tokens);
//        parser.addErrorListener(MxsErrorListener.INSTANCE);
        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();
        ASTBuilder constructor = new ASTBuilder();
        walker.walk(constructor, tree);

        printAST(constructor.getProgram());

        checkSemantic(constructor.getProgram());
    }

}
