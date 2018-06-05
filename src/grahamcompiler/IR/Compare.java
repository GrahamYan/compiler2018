package grahamcompiler.IR;

import grahamcompiler.IR.Value.*;
import grahamcompiler.IR.IRBase.IRInstTraversal;

public class Compare extends IRInstruction{
    public enum Condition {
        SLT, SGT, SEQ, BEQ, EQU, NEQ;
    }

    private Condition condition;
    private IntegerValue lhs;
    private IntegerValue rhs;
    private Address dest;
    private PhysicalRegister destReg;
    private PhysicalRegister lhsReg, rhsReg;

    public Compare(Label label, Condition condition, Address dest, IntegerValue lhs, IntegerValue rhs) {
        super(label);
        this.condition = condition;
        this.dest = dest;
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public Address getDest() {
        return dest;
    }

    public IntegerValue getRhs() {
        return rhs;
    }

    public IntegerValue getLhs() {
        return lhs;
    }

    public PhysicalRegister getDestReg() {
        return destReg;
    }

    public void setDestReg(PhysicalRegister destReg) {
        this.destReg = destReg;
    }

    public PhysicalRegister getLhsReg() {
        return lhsReg;
    }

    public PhysicalRegister getRhsReg() {
        return rhsReg;
    }

    public void setLhsReg(PhysicalRegister lhsReg) {
        this.lhsReg = lhsReg;
    }

    public void setRhsReg(PhysicalRegister rhsReg) {
        this.rhsReg = rhsReg;
    }

    public Condition getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return dest.toString() + "=" + lhs.toString() + " " + condition.toString() + " " + rhs.toString();
    }

    @Override
    public void accept(IRInstTraversal visitor) {
        visitor.visit(this);
    }
}
