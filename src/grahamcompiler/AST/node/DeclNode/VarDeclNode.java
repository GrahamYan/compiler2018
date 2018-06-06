package grahamcompiler.AST.node.DeclNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.Type.Type;
import grahamcompiler.utility.location;
import grahamcompiler.AST.node.ExprNode.ExprNode;
import grahamcompiler.AST.object.VarObject;
import grahamcompiler.utility.Name;
import grahamcompiler.utility.Scope;
import grahamcompiler.IR.IRBase.IRTraversal;
import grahamcompiler.IR.Value.Address;

public class VarDeclNode extends DeclNode{
    private VarObject var;
    private ExprNode value;
    private boolean isMember;
    private int memberNum;


    public VarDeclNode(location pos, VarObject va, ExprNode val) {
        super(pos);
        var = va;
        value = val;
        this.isMember = false;
        this.memberNum = 0;
    }

    public final VarObject getVar() {
        return var;
    }

    public final ExprNode getValue() {
        return value;
    }

    public void setScope(Scope scope)
    {
        var.setScope(scope);
    }
    public Scope getScope()
    {
        return var.getScope();
    }

    public void setType(Type type) {
        var.setType(type);
    }

    public Type getType() {
        return var.getType();
    }

    public boolean isMember() {
        return isMember;
    }

    public int getMemberNum() {
        return memberNum;
    }

    public void setMember(boolean member) {
        isMember = member;
    }

    public void setMemberNum(int memberNum) {
        this.memberNum = memberNum;
    }

    @Override
    public Name getName()
    {
        return var.getName();
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Address accept(IRTraversal visitor) {
        return visitor.visit(this);
    }
}