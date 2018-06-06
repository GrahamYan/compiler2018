package grahamcompiler.IR;

import grahamcompiler.IR.IRBase.IRInstTraversal;
import grahamcompiler.IR.IRType.IRType;
import grahamcompiler.IR.Value.Address;
import grahamcompiler.IR.Value.IntegerValue;
import grahamcompiler.IR.Value.Register;
import grahamcompiler.IR.Value.VirtualRegister;

import java.util.List;

public class GetElementPtr extends IRInstruction
{
    private VirtualRegister dest;
    private IRType type;
    private Address baseAddress;
    private IntegerValue pos1;
    private IntegerValue pos2;

    public GetElementPtr(Label label, VirtualRegister dest, IRType type, Address baseAddress, IntegerValue pos1, IntegerValue pos2)
    {
        super(label);
        this.dest = dest;
        this.type = type;
        this.baseAddress = baseAddress;
        this.pos1 = pos1;
        this.pos2 = pos2;
    }

    @Override
    public String toString()
    {
        return dest.toString() + " = " + "getElementPtr %" +
                type.toString() + " % " + baseAddress.toString() + " " +
                String.valueOf(pos1) + " " + String.valueOf(pos2);
    }

    @Override
    public Register getDefRegister() {
        return null;
    }

    @Override
    public void setUsedRegister() { }

    @Override
    public void accept(IRInstTraversal visitor)
    {
        throw new RuntimeException("can't reach here");
    }
}
