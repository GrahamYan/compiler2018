package grahamcompiler.Translator;

import grahamcompiler.utility.Name;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class NasmPrinter {
    private List<NasmInst> nasmInsts;
    private List<NasmInst> dataInsts;
    private List<NasmInst> dataZone;
    private List<NasmInst> bssZone;
    private List<Name> globalNames;
    private OutputStream outputStream;

    private String[] builtInFunctionNames = {"extern scanf", "extern printf", "extern puts", "extern strlen",
            "extern memcpy", "extern sscanf", "extern sprintf", "extern malloc", "extern strcmp"};


    public NasmPrinter(List<NasmInst> nasmInsts, List<NasmInst> dataInsts, List<NasmInst> dataZone,
                       List<NasmInst> bssZone,   List<Name> globalNames, OutputStream outputStream) {
        this.nasmInsts = nasmInsts;
        this.dataInsts = dataInsts;
        this.globalNames = globalNames;
        this.outputStream = outputStream;
        this.dataZone = dataZone;
        this.bssZone = bssZone;
    }

    public void printNasm()
    {
        PrintStream printStream = new PrintStream(outputStream);
        String indent = "       ";
        for(Name name : globalNames) {
            printStream.println("global    " + name.toString());
        }
        printStream.println("\n\nsection .data");
        for(String item : builtInFunctionNames)
            printStream.println(item);
        printStream.println("\nsection .text\n");
        for(NasmInst item : nasmInsts) {
            boolean lohi = false;
            if (item.toString().indexOf("call") != -1 && item.toString().indexOf("lohi") != -1) {
                printStream.println("       push  rbp\n" +
                           "       mov  rbp,  rsp\n" +
                           "       sub  rsp,  48\n" +
                           "       mov  qword [rbp-8],  rdi\n" +
                           "       mov  qword [rbp-16],  rsi\n" +
                           "       mov  rax,  qword [rbp-16]\n" +
                           "       mov  rcx,  16\n" +
                           "       sal  rax,  cl\n" +
                           "       mov  qword [rbp-24],  rax\n" +
                           "       mov  rax,  qword [rbp-8]\n" +
                           "       mov  rbx,  qword [rbp-24]\n" +
                           "       or  rax,  rbx\n" +
                           "       mov  qword [rbp-32],  rax\n" +
                           "       mov  rax,  qword [rbp-32]\n" +
                           "       add  rsp,  48\n" +
                           "       pop  rbp\n" +
                           "       ret  \n" +
                           "       add  rsp,  48\n" +
                           "       pop  rbp\n" +
                           "       ret  ");
            }
            else if(item.getInst() == NasmInst.Instruction.NULL) //means inst is a label
                printStream.println(item.toString() + ":");
            else
                printStream.println(indent + item.toString());
        }
        printStream.println("\nsection .data");
        for(NasmInst nasmInst : dataInsts) {
            if(nasmInst.getInst() == NasmInst.Instruction.NULL)
                printStream.println(nasmInst.toString() + ':');
            else
                printStream.println(indent + nasmInst.toString());
        }
        for(NasmInst nasmInst : dataZone) {
            if(nasmInst.getInst() == NasmInst.Instruction.NULL)
                printStream.println(nasmInst.toString() + ':');
            else
                printStream.println(indent + nasmInst.toString());
        }
        printStream.println("\n");
        try {
            List<String> clibCode = getClibCode();
            for(String item : clibCode)
                printStream.println(item);
        }
        catch (Exception e) {
            throw new RuntimeException("cannot open file");
        }
        printStream.println("\nsection .bss\n");
        for(NasmInst nasmInst : bssZone) {
            if(nasmInst.getInst() == NasmInst.Instruction.NULL)
                printStream.print(nasmInst.toString() + ":");
            else
                printStream.println(indent + nasmInst.toString());
        }

    }

    public List<String> getClibCode() throws Exception {
        List<String> clibCode = new ArrayList<>();
        FileReader fileReader = new FileReader("Test/clib.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str;
        while((str = bufferedReader.readLine()) != null) {
            clibCode.add(str);
        }
        return clibCode;

    }
}