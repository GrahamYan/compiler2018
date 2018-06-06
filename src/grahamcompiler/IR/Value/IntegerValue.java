package grahamcompiler.IR.Value;

import grahamcompiler.IR.IRInstruction;
import grahamcompiler.IR.IRBase.IRInstTraversal;

public class IntegerValue extends IRInstruction {
    public String toString() {return "Integer:";}

    @Override
    public Register getDefRegister() {
        return null;
    }

    @Override
    public void setUsedRegister(){}

    @Override
    public void accept(IRInstTraversal visitor) {visitor.visit(this);}
}
