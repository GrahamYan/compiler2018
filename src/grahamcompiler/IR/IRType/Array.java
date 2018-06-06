package grahamcompiler.IR.IRType;

import grahamcompiler.IR.Value.*;

public class Array extends IRType {
    private IRType type;
    private IntegerValue size;

    public Array(IRType type, IntegerValue size) {
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
