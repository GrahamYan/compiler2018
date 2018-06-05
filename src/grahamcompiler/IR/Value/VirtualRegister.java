package grahamcompiler.IR.Value;

import grahamcompiler.utility.Name;

public class VirtualRegister extends Register {
    private int value;
    private boolean isAddress;

    public VirtualRegister(Name name, boolean isAddress) {
        super(name);
        this.isAddress = isAddress;
    }

    public VirtualRegister(Name name) {
        super(name);
    }

    public int getValue() {
        return value;
    }

    @Override
    public Name getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
