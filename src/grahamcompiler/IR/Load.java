package grahamcompiler.IR;

import grahamcompiler.IR.IRBase.IRInstTraversal;
import grahamcompiler.IR.Value.Address;
import grahamcompiler.IR.Value.Immediate;
import grahamcompiler.IR.Value.PhysicalRegister;
import grahamcompiler.IR.Value.VirtualRegister;

public class Load extends IRInstruction {
    private VirtualRegister dest;
    private Address address;
    private Immediate value;
    private PhysicalRegister destReg;
    private PhysicalRegister sourReg;

    public Load(Label label, VirtualRegister dest, Address address) {
        super(label);
        this.dest = dest;
        this.address = address;
    }

    public Load(Label label, VirtualRegister dest, Immediate value) {
        super(label);
        this.dest = dest;
        this.value = value;
    }

    public PhysicalRegister getSourReg() {
        return sourReg;
    }

    public PhysicalRegister getDestReg() {
        return destReg;
    }

    public void setSourReg(PhysicalRegister sourReg) {
        this.sourReg = sourReg;
    }

    public void setDestReg(PhysicalRegister destReg) {
        this.destReg = destReg;
    }

    public VirtualRegister getDest() {
        return dest;
    }

    public Address getAddress() {
        return address;
    }

    public Immediate getValue() {
        return value;
    }

    @Override
    public String toString() {
        if(this.address != null)
            return dest.toString() + " = Load " + address.toString();
        else return dest.toString() + " = Load " + value.toString();
    }

    @Override
    public void accept(IRInstTraversal visitor) {
        visitor.visit(this);
    }
}

