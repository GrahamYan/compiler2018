package grahamcompiler.IR.IRBase;

import grahamcompiler.IR.Function;
import grahamcompiler.IR.IRInstruction;
import grahamcompiler.IR.IRType.Class;
import grahamcompiler.IR.Label;
import grahamcompiler.utility.Name;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;

public class IRPrinter {
    private IRInstruction entry;
    private IRInstruction initializeEntry;
    private FileOutputStream outputStream;
    private List<Class> type;
    private DataSection dataSection;

    public IRPrinter(IRInstruction entry,IRInstruction initializeEntry, FileOutputStream outputStream, List<Class> type, DataSection dataSection) {
        this.entry = entry;
        this.initializeEntry = initializeEntry;
        this.outputStream = outputStream;
        this.type = type;
        this.dataSection = dataSection;
    }

    public void printIR() {
        IRInstruction cur = entry;
        PrintStream printStream = new PrintStream(outputStream);
        printStream.println("********************************");
        printStream.println("****************IR**************");
        printStream.println("");
        while(cur != null) {
            if (cur instanceof Label) {
                printStream.println("");
                printStream.println("--" + cur.toString());
            }
            else if (cur instanceof Function) {
                printStream.println("");
                printStream.println(cur.toString());
                if (((Function) cur).getName() == Name.getName("main")) {
                    IRInstruction tmp = initializeEntry;
                    while (tmp != null) {
                        printStream.println(" " + tmp.toString());
                        tmp = tmp.getNext();
                    }
                }
            }
            else {
                printStream.println("   " + cur.toString());
            }
            cur = cur.getNext();
        }
        printStream.println("\n");
        printStream.println("***************TYPE*************");
        for (Class item : type) {
            printStream.println(item.toFullInfoString());
        }
        printStream.println("\n");
        printStream.println("***************DATA*************");
        for (DataSection.DataPiece item : dataSection.getDataPieces()) {
            printStream.println(item.toString());
        }
    }
}
