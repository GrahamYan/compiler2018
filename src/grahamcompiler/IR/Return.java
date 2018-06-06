package grahamcompiler.IR;

import grahamcompiler.IR.IRBase.IRInstTraversal;
import grahamcompiler.IR.Value.Address;
import grahamcompiler.IR.Value.IntegerValue;
import grahamcompiler.IR.Value.PhysicalRegister;
import grahamcompiler.IR.Value.Register;

import java.util.List;

public class Return extends Terminator{
    private IntegerValue value;
    private PhysicalRegister valueReg;

    public Return(Label label, IntegerValue value) {
        super(label);
        this.value = value;
    }

    public IntegerValue getValue() {
        return value;
    }

    public PhysicalRegister getValueReg() {
        return valueReg;
    }

    public void setValue(IntegerValue value) {
        this.value = value;
    }

    public void setValueReg(PhysicalRegister valueReg) {
        this.valueReg = valueReg;
    }

    @Override
    public String toString()
    {
        if (value == null)
            return "Return";
        else
            return "Return: " + value.toString();
    }

    @Override
    public Register getDefRegister() {
        return null;
    }

    @Override
    public void setUsedRegister() {
        usedRegister.clear();
        Address tmp;
        if (value instanceof Address) {
            tmp = (Address) value;
            while (tmp.getBase() != null) {
                if (tmp.getOffset() instanceof Register) usedRegister.add((Register) tmp.getOffset());
                tmp = tmp.getBase();
            }
            usedRegister.add(tmp);
        }
        else if (value instanceof Register) usedRegister.add((Register) value);
    }

    @Override
    public void accept(IRInstTraversal visitor)
    {
        visitor.visit(this);
    }
}
