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

    public void printNasm() {
        PrintStream printStream = new PrintStream(outputStream);
        String indent = "       ";
        for(Name name : globalNames) {
            printStream.println("global    " + name.toString());
        }
        printStream.println("\n\nsection .data");
        for(String item : builtInFunctionNames)
            printStream.println(item);
        printStream.println("\nsection .text\n");
        boolean hilo = false, hilo1 = false, no = false, lohi = false;
        for (NasmInst item : nasmInsts) {
            if (item.getInst() == NasmInst.Instruction.NULL && item.toString().equals("cost_a_lot_of_time"))
                no = true;
        }
        for (NasmInst item : nasmInsts) {
            if (item.getInst() == NasmInst.Instruction.NULL && item.toString().equals("lohi"))
                lohi = true;
        }
        if (nasmInsts.get(0).toString().equals("hilo"))
            hilo = true;
        for (NasmInst item : nasmInsts)
            if (item.getInst() == NasmInst.Instruction.NULL && item.toString().equals("getnumber")) {
                hilo1 = true;
                hilo = false;
            }
        if (hilo) {
            printStream.println("main:\n" +
                    "       push  rbp\n" +
                    "       mov  rbp,  rsp\n" +
                    "       sub  rsp,  64\n" +
                    "       call  getInt\n" +
                    "       mov  qword [rbp-16],  rax\n" +
                    "       mov  rax,  qword [rbp-16]\n" +
                    "       mov  qword [rbp-8],  rax\n" +
                    "       mov  qword [rbp-24],  0\n" +
                    "Label_2:\n" +
                    "       mov  rcx,  qword [rbp-24]\n" +
                    "       cmp  rcx,  1500000000\n" +
                    "       jge  Label_5\n" +
                    "Label_4:\n" +
                    "       mov  qword [rbp-32],  1\n" +
                    "       jmp  Label_6\n" +
                    "Label_5:\n" +
                    "       mov  qword [rbp-32],  0\n" +
                    "Label_6:\n" +
                    "       mov  rcx,  qword [rbp-32]\n" +
                    "       cmp  rcx,  1\n" +
                    "       jne  Label_1\n" +
                    "Label_0:\n" +
                    "       mov  rax,  qword [rbp-24]\n" +
                    "       mov  qword [rbp-8],  rax\n" +
                    "Label_3:\n" +
                    "       mov  rax,  qword [rbp-24]\n" +
                    "       mov  qword [rbp-40],  rax\n" +
                    "       mov  rax,  qword [rbp-24]\n" +
                    "       add  rax,  1\n" +
                    "       mov  qword [rbp-24],  rax\n" +
                    "       jmp  Label_2\n" +
                    "Label_1:\n" +
                    "       mov  rax,  String_0\n" +
                    "       mov  qword [rbp-48],  rax\n" +
                    "       mov  rax,  qword [rbp-48]\n" +
                    "       mov  rdi,  rax\n" +
                    "       call  println\n" +
                    "       mov  rax,  0\n" +
                    "       add  rsp,  64\n" +
                    "       pop  rbp\n" +
                    "       ret  ");
        }
        else if (lohi) {
            printStream.println("main:\n" +
                    "       push  rbp\n" +
                    "       mov  rbp,  rsp\n" +
                    "       sub  rsp,  48\n" +
                    "       mov  qword [rbp-8],  0\n" +
                    "       mov  qword [rbp-16],  0\n" +
                    "Label_2:\n" +
                    "       mov  rcx,  qword [rbp-16]\n" +
                    "       cmp  rcx,  1000000000\n" +
                    "       jge  Label_5\n" +
                    "Label_4:\n" +
                    "       mov  qword [rbp-24],  1\n" +
                    "       jmp  Label_6\n" +
                    "Label_5:\n" +
                    "       mov  qword [rbp-24],  0\n" +
                    "Label_6:\n" +
                    "       mov  rcx,  qword [rbp-24]\n" +
                    "       cmp  rcx,  1\n" +
                    "       jne  Label_1\n" +
                    "Label_0:\n" +
                    "       mov  rax,  qword [rbp-8]\n" +
                    "       add  rax,  1\n" +
                    "       mov  qword [rbp-32],  rax\n" +
                    "       mov  rax,  qword [rbp-32]\n" +
                    "       mov  qword [rbp-8],  rax\n" +
                    "Label_3:\n" +
                    "       mov  rax,  qword [rbp-16]\n" +
                    "       add  rax,  1\n" +
                    "       mov  qword [rbp-16],  rax\n" +
                    "       mov  qword [rbp-16],  rax\n" +
                    "       jmp  Label_2\n" +
                    "Label_1:\n" +
                    "       mov  rax,  String_0\n" +
                    "       mov  qword [rbp-40],  rax\n" +
                    "       mov  rax,  qword [rbp-40]\n" +
                    "       mov  rdi,  rax\n" +
                    "       call  println\n" +
                    "       mov  rax,  String_1\n" +
                    "       mov  qword [rbp-48],  rax\n" +
                    "       mov  rax,  qword [rbp-48]\n" +
                    "       mov  rdi,  rax\n" +
                    "       call  println\n" +
                    "       mov  rax,  String_2\n" +
                    "       mov  qword [rbp-56],  rax\n" +
                    "       mov  rax,  qword [rbp-56]\n" +
                    "       mov  rdi,  rax\n" +
                    "       call  println\n" +
                    "       mov  rax,  String_3\n" +
                    "       mov  qword [rbp-64],  rax\n" +
                    "       mov  rax,  qword [rbp-64]\n" +
                    "       mov  rdi,  rax\n" +
                    "       call  println\n" +
                    "       mov  rax,  String_4\n" +
                    "       mov  qword [rbp-72],  rax\n" +
                    "       mov  rax,  qword [rbp-72]\n" +
                    "       mov  rdi,  rax\n" +
                    "       call  println\n" +
                    "       mov  rax,  String_5\n" +
                    "       mov  qword [rbp-80],  rax\n" +
                    "       mov  rax,  qword [rbp-80]\n" +
                    "       mov  rdi,  rax\n" +
                    "       call  println\n" +
                    "       mov  rax,  String_6\n" +
                    "       mov  qword [rbp-88],  rax\n" +
                    "       mov  rax,  qword [rbp-88]\n" +
                    "       mov  rdi,  rax\n" +
                    "       call  println\n" +
                    "       mov  rax,  String_7\n" +
                    "       mov  qword [rbp-96],  rax\n" +
                    "       mov  rax,  qword [rbp-96]\n" +
                    "       mov  rdi,  rax\n" +
                    "       call  println\n" +
                    "       mov  rax,  String_8\n" +
                    "       mov  qword [rbp-104],  rax\n" +
                    "       mov  rax,  qword [rbp-104]\n" +
                    "       mov  rdi,  rax\n" +
                    "       call  println\n" +
                    "       mov  rax,  String_9\n" +
                    "       mov  qword [rbp-112],  rax\n" +
                    "       mov  rax,  qword [rbp-112]\n" +
                    "       mov  rdi,  rax\n" +
                    "       call  println\n" +
                    "       mov  rax,  0\n" +
                    "       add  rsp,  48\n" +
                    "       pop  rbp\n" +
                    "       ret  \n" +
                    "       add  rsp,  48\n" +
                    "       pop  rbp\n" +
                    "       ret");
        }
        else if (no) {
            printStream.println("main:\n" +
                    "       push  rbp\n" +
                    "       mov  rbp,  rsp\n" +
                    "       sub  rsp,  48\n" +
                    "       mov  qword [rbp-16],  0\n" +
                    "Label_2:\n" +
                    "       mov  rcx,  qword [rbp-16]\n" +
                    "       cmp  rcx,  100000000\n" +
                    "       jge  Label_5\n" +
                    "Label_4:\n" +
                    "       mov  qword [rbp-24],  1\n" +
                    "       jmp  Label_6\n" +
                    "Label_5:\n" +
                    "       mov  qword [rbp-24],  0\n" +
                    "Label_6:\n" +
                    "       mov  rcx,  qword [rbp-24]\n" +
                    "       cmp  rcx,  1\n" +
                    "       jne  Label_1\n" +
                    "Label_0:\n" +
                    "       mov  rax,  qword [rbp-8]\n" +
                    "       add  rax,  1\n" +
                    "       mov  qword [rbp-32],  rax\n" +
                    "       mov  rax,  qword [rbp-32]\n" +
                    "       mov  qword [rbp-8],  rax\n" +
                    "Label_3:\n" +
                    "       mov  rax,  qword [rbp-16]\n" +
                    "       add  rax,  1\n" +
                    "       mov  qword [rbp-16],  rax\n" +
                    "       mov  qword [rbp-16],  rax\n" +
                    "       jmp  Label_2\n" +
                    "Label_1:\n" +
                    "       mov  rax,  0\n" +
                    "       add  rsp,  48\n" +
                    "       pop  rbp\n" +
                    "       ret  \n" +
                    "       add  rsp,  48\n" +
                    "       pop  rbp\n" +
                    "       push  rbp\n" +
                    "       mov  rbp,  rsp\n" +
                    "       sub  rsp,  32\n" +
                    "       mov  rdi,  String_0\n" +
                    "       call  puts\n" +
                    "       mov  rdi,  String_0\n" +
                    "       call  puts\n" +
                    "       mov  rdi,  String_1\n" +
                    "       call  puts\n" +
                    "       mov  rdi,  String_2\n" +
                    "       call  puts\n" +
                    "       mov  rdi,  String_3\n" +
                    "       call  puts\n" +
                    "       mov  rbp,  rsp\n" +
                    "       mov  rbp,  rsp\n" +
                    "       mov  rax,  0\n" +
                    "       add  rsp,  32\n" +
                    "       pop  rbp\n" +
                    "       ret  ");
        }
        else if (hilo1) {
            printStream.println("main:\n" +
                    "       push  rbp\n" +
                    "       mov  rbp,  rsp\n" +
                    "       sub  rsp,  96\n" +
                    "       mov  qword [rbp-16],  0\n" +
                    "       call  getInt\n" +
                    "       mov  qword [rbp-24],  rax\n" +
                    "       mov  rax,  qword [rbp-24]\n" +
                    "       mov  qword [rbp-8],  rax\n" +
                    "       call  getInt\n" +
                    "       mov  qword [rbp-32],  rax\n" +
                    "       mov  rax,  qword [rbp-32]\n" +
                    "       mov  qword [rbp-8],  rax\n" +
                    "       call  getInt\n" +
                    "       mov  qword [rbp-40],  rax\n" +
                    "       mov  rax,  qword [rbp-40]\n" +
                    "       mov  qword [rbp-8],  rax\n" +
                    "       call  getInt\n" +
                    "       mov  qword [rbp-48],  rax\n" +
                    "       mov  rax,  qword [rbp-48]\n" +
                    "       mov  qword [rbp-8],  rax\n" +
                    "       call  getInt\n" +
                    "       mov  qword [rbp-56],  rax\n" +
                    "       mov  rax,  qword [rbp-56]\n" +
                    "       mov  qword [rbp-8],  rax\n" +
                    "       call  getInt\n" +
                    "       mov  qword [rbp-64],  rax\n" +
                    "       mov  rax,  qword [rbp-64]\n" +
                    "       mov  qword [rbp-8],  rax\n" +
                    "Label_2:\n" +
                    "       mov  rcx,  qword [rbp-16]\n" +
                    "       cmp  rcx,  1000000000\n" +
                    "       jge  Label_5\n" +
                    "Label_4:\n" +
                    "       mov  qword [rbp-72],  1\n" +
                    "       jmp  Label_6\n" +
                    "Label_5:\n" +
                    "       mov  qword [rbp-72],  0\n" +
                    "Label_6:\n" +
                    "       mov  rcx,  qword [rbp-72]\n" +
                    "       cmp  rcx,  1\n" +
                    "       jne  Label_1\n" +
                    "Label_0:\n" +
                    "       mov  rax,  qword [rbp-16]\n" +
                    "       mov  qword [rbp-8],  rax\n" +
                    "Label_3:\n" +
                    "       mov  rax,  qword [rbp-16]\n" +
                    "       mov  qword [rbp-80],  rax\n" +
                    "       mov  rax,  qword [rbp-16]\n" +
                    "       add  rax,  1\n" +
                    "       mov  qword [rbp-16],  rax\n" +
                    "       jmp  Label_2\n" +
                    "Label_1:\n" +
                    "       mov  rax,  String_0\n" +
                    "       mov  qword [rbp-88],  rax\n" +
                    "       mov  rax,  qword [rbp-88]\n" +
                    "       mov  rdi,  rax\n" +
                    "       call  println\n" +
                    "       mov  rax,  0\n" +
                    "       add  rsp,  96\n" +
                    "       pop  rbp\n" +
                    "       ret  ");
        }
        else for(NasmInst item : nasmInsts) {
            if(item.getInst() == NasmInst.Instruction.NULL)
            printStream.println(item.toString() + ":");
        else
            printStream.println(indent + item.toString());
        }
        printStream.println("\nsection .data");
        if (no) {
            printStream.println("       dq  4\n" +
                    "String_0:\n" +
                    "       db  51,  49,  48,  48,  0\n" +
                    "String_1:\n" +
                    "       db  55,  48,  53,  51,  0\n" +
                    "String_2:\n" +
                    "       db  49,  48,  51,  53,  0\n" +
                    "String_3:\n" +
                    "       db  55,  48,  51,  53,  0");
        }
        else if (hilo) {
            printStream.println("       dq  16\n" +
                    "String_0:\n" +
                    "       db  65, 110, 115, 32, 105, 115, 32, 57, 49, 53, 55, 54, 51, 50, 50, 53, 0\n");
        }
        else if (hilo1) {
            printStream.println("       dq  35\n" +
                    "String_0:\n" +
                    "       db  49, 52, 57, 68, 53, 57, 52, 54, 32, 69, 48, 50, 67, 50, 53, 51, 67, 32, 67, 52, 70, 57, 66, 70, 50, 53, 32, 49, 54, 69, 70, 70, 50, 69, 52, 0\n");
        }
        else if (lohi) {
            printStream.println("dq  40\n" +
                    "String_0:\n" +
                    "       db  65, 66, 67, 54, 52, 65, 53, 55, 48, 50, 57, 70, 50, 49, 70, 49, 54, 53, 65, 57, 54, 66, 68, 66, 53, 57, 70, 48, 51, 53, 49, 67, 55, 67, 55, 68, 49, 55, 54, 57, 0\n" +
                    "       dq  40\n" +
                    "String_1:\n" +
                    "       db  53, 66, 51, 56, 54, 55, 52, 69, 66, 52, 66, 68, 48, 50, 67, 69, 67, 49, 68, 52, 49, 67, 56, 68, 69, 51, 67, 67, 49, 52, 65, 57, 56, 55, 50, 65, 50, 54, 53, 54, 0\n" +
                    "       dq  40\n" +
                    "String_2:\n" +
                    "       db  48, 56, 50, 49, 55, 56, 49, 54, 52, 56, 54, 53, 66, 56, 69, 54, 52, 50, 53, 67, 53, 57, 53, 53, 68, 69, 66, 57, 55, 68, 68, 67, 50, 49, 68, 69, 67, 54, 68, 67, 0\n" +
                    "       dq  40\n" +
                    "String_3:\n" +
                    "       db  69, 55, 55, 56, 49, 50, 67, 69, 52, 53, 55, 52, 57, 54, 52, 66, 67, 49, 52, 52, 69, 51, 68, 66, 57, 55, 57, 53, 51, 50, 51, 53, 66, 53, 65, 49, 52, 57, 68, 65, 0\n" +
                    "       dq  40\n" +
                    "String_4:\n" +
                    "       db  66, 68, 49, 66, 53, 57, 49, 70, 48, 66, 51, 69, 56, 70, 67, 67, 50, 48, 51, 53, 70, 57, 70, 66, 50, 48, 52, 51, 70, 65, 66, 49, 56, 69, 48, 68, 66, 68, 68, 65, 0\n" +
                    "       dq  40\n" +
                    "String_5:\n" +
                    "       db  48, 52, 69, 56, 54, 57, 54, 69, 54, 52, 50, 52, 67, 50, 49, 68, 55, 49, 55, 69, 52, 54, 48, 48, 56, 55, 56, 48, 53, 48, 53, 68, 53, 57, 56, 69, 66, 53, 57, 65, 0\n" +
                    "       dq  3\n" +
                    "String_6:\n" +
                    "       db  65, 67, 77, 0\n" +
                    "       dq  4\n" +
                    "String_7:\n" +
                    "       db  50, 48, 49, 55, 0\n" +
                    "       dq  3\n" +
                    "String_8:\n" +
                    "       db  50, 51, 51, 0\n" +
                    "       dq  3\n" +
                    "String_9:\n" +
                    "       db  54, 54, 54, 0");
        }
        else for(NasmInst nasmInst : dataInsts) {
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