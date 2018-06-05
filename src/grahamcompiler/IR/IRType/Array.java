package grahamcompiler.IR.IRType;

import grahamcompiler.IR.Value.*;

public class Array {
    private IRType type;
    private IntergerValue size;

    public Array(IRType type, IntergerValue size) {
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString() {
        if (size != null) {
            return "[" + type.toString() + "* " + size.toString() + "]";
        }
        else return "[ArrayType:" + type.toString() + "[] ]";
    }
}
