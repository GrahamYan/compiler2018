package grahamcompiler.IR.IRBase;

import grahamcompiler.AST.node.DeclNode.FuncDeclNode;
import grahamcompiler.IR.Value.VirtualRegister;
import grahamcompiler.utility.Name;

import java.util.Vector;

public class FunctionScope {
    private Vector<VirtualRegister> registerMap = new Vector<VirtualRegister>(1);
    private int curNum = 0;
    private Name name;
    private FuncDeclNode funcDeclNode;
    private int usedSlotNum = 0;

    public FunctionScope(Name name) {this.name = name;}

    public VirtualRegister getRegister() {
        VirtualRegister reg = new VirtualRegister(Name.getName("%r" + String.valueOf(curNum++)));
        registerMap.addElement(reg);
        return reg;
    }

    public VirtualRegister getRegister(int number) {return registerMap.elementAt(number);}

    public int getCurNum() {return curNum;}

    public FuncDeclNode getFuncDeclNode() {
        return funcDeclNode;
    }

    public int getUsedSlotNum() {
        return usedSlotNum;
    }

    public void setFuncDeclNode(FuncDeclNode funcDeclNode) {
        this.funcDeclNode = funcDeclNode;
    }

    public Name getName() {
        return name;
    }

    public void incSlotNum() {
        ++usedSlotNum;
    }
}
