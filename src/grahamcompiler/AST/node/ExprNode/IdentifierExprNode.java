package grahamcompiler.AST.node.ExprNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.Name;
import grahamcompiler.utility.location;

public class IdentifierExprNode extends  ExprNode{
    private Name name;
    public IdentifierExprNode(location pos, String na) {
        super(pos);
        name = Name.getName(na);
        setIsLeftvalue(true);
    }
    public Name getName() {
        return name;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
