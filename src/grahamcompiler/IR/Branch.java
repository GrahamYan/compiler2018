package grahamcompiler.IR;

import grahamcompiler.IR.Value.*;
import grahamcompiler.IR.IRBase.IRInstTraversal;

public class Branch extends Terminator {
    private Label ifTrue;
    private Label ifFalse;
    private IntegerValue condition;
    private PhysicalRegister conditionReg;
    private Compare.Condition op;

    public Branch(Label label, Label ifTrue, Label ifFalse, IntegerValue condition) {
        super(label);
        this.condition = condition;
        this.ifFalse = ifFalse;
        this.ifTrue = ifTrue;
    }

    public Branch(Label label, Label ifTrue, Label ifFalse, IntegerValue condition, Compare.Condition op) {
        super(label);
        this.condition = condition;
        this.ifFalse = ifFalse;
        this.ifTrue = ifTrue;
        this.op = op;
    }

    public Compare.Condition getOp() {
        return op;
    }

    public PhysicalRegister getConditionReg() {
        return conditionReg;
    }

    public void setConditionReg(PhysicalRegister conditionReg) {
        this.conditionReg = conditionReg;
    }

    public Label getIfFalse() {
        return ifFalse;
    }

    public Label getIfTure() {
        return ifTrue;
    }

    public IntegerValue getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "Branch" + condition.toString() + "true: " + ifTrue.toString() + "false: " + ifFalse.toString();
    }

    @Override
    public void accept(IRInstTraversal visitor) {
        visitor.visit(this);
    }
}
