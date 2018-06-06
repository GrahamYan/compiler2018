package grahamcompiler.IR;

import grahamcompiler.AST.node.DeclNode.FuncParamNode;
import grahamcompiler.utility.Name;
import grahamcompiler.IR.IRBase.BasicBlock;
import grahamcompiler.IR.IRType.*;
import grahamcompiler.IR.IRBase.IRInstTraversal;
import grahamcompiler.IR.Value.Register;

import java.util.List;

public class Function extends IRInstruction {
    private Name name;
    private IRType retType;
    private List<Parameter> parameters;
    private BasicBlock block;
    private int usedSlotNum;

    public Function(Label label, Name name, IRType retType, List<Parameter> parameters, int usedSlotNum) {
        super(label);
        this.name = name;
        this.retType = retType;
        this.parameters = parameters;
        this.usedSlotNum = usedSlotNum;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public Name getName() {
        return name;
    }

    public int getUsedSlotNum() {
        return usedSlotNum;
    }

    public void setUsedSlotNum(int usedSlotNum) {
        this.usedSlotNum = usedSlotNum;
    }

    public void addUsedSlotNumber(int value) {this.usedSlotNum += value;}

    public String paramToString() {
        String tmp = "(";
        int i = 0;
        for(Parameter item : parameters) {
            if(i != parameters.size() - 1)
                tmp += item.getIrType().toString() + ", ";
            else tmp += item.getIrType().toString();
            ++i;
        }
        tmp += ")";
        return tmp;
    }

    @Override
    public String toString() {
        return "define " + retType.toString() + " @" + name.toString() + paramToString();
    }

    @Override
    public Register getDefRegister() {
        return null;
    }

    @Override
    public void setUsedRegister() { }


    @Override
    public void accept(IRInstTraversal visitor) {
        visitor.visit(this);
    }
}
