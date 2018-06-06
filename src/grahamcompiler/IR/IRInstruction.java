package grahamcompiler.IR;

import grahamcompiler.IR.Value.PhysicalRegister;
import grahamcompiler.IR.Value.Register;
import grahamcompiler.IR.Value.VirtualRegister;
import grahamcompiler.IR.IRBase.IRInstTraversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class IRInstruction {
    private Label label;
    private IRInstruction next;
    private IRInstruction prev;
    public Set<VirtualRegister> liveIn = null;
    public Set<VirtualRegister> liveOut = null;
    public List<Register> usedRegister = new LinkedList<>();

    public IRInstruction(Label lab, IRInstruction nxt, IRInstruction pre) {
        label = lab;
        next = nxt;
        prev = pre;
    }

    public IRInstruction(){}

    public IRInstruction(Label lab) {label = lab;}

    public Label getLabel() {return label;}

    public IRInstruction getNext() {return next;}

    public IRInstruction getPrev() {return prev;}

    public void setNext(IRInstruction next) {this.next = next;}

    public void setPrev(IRInstruction prev) {this.prev = prev;}

    public abstract String toString();

    public abstract Register getDefRegister();

    public abstract void setUsedRegister();

    public List<Register> getUsedRegister(){
        return usedRegister;
    }

    public abstract void accept(IRInstTraversal visitor);
}
