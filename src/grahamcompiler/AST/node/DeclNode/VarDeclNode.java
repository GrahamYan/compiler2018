package grahamcompiler.AST.node.DeclNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.Type.Type;
import grahamcompiler.utility.location;
import grahamcompiler.AST.node.ExprNode.ExprNode;
import grahamcompiler.AST.object.VarObject;
import grahamcompiler.utility.Name;
import grahamcompiler.utility.Scope;

public class VarDeclNode extends DeclNode{
    private VarObject var;
    ExprNode value;

    public VarDeclNode(location pos, VarObject va, ExprNode val) {
        super(pos);
        var = va;
        value = val;
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

    @Override
    public Name getName()
    {
        return var.getName();
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
