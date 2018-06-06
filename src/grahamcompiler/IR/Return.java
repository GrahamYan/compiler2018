package grahamcompiler.IR;

import grahamcompiler.IR.IRBase.IRInstTraversal;
import grahamcompiler.IR.Value.IntegerValue;
import grahamcompiler.IR.Value.PhysicalRegister;

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
    public void accept(IRInstTraversal visitor)
    {
        visitor.visit(this);
    }
}
