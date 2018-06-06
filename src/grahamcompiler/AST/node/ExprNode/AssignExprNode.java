package grahamcompiler.AST.node.ExprNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.location;
import grahamcompiler.IR.IRBase.IRTraversal;
import grahamcompiler.IR.Value.IntegerValue;

public class AssignExprNode extends ExprNode{
    private ExprNode left, right;
    public AssignExprNode(location pos, ExprNode lhs, ExprNode rhs) {
        super(pos);
        left = lhs;
        right = rhs;
    }
    public final ExprNode getRight() {
        return right;
    }
    public final ExprNode getLeft() {
        return left;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public IntegerValue accept(IRTraversal visitor) {
        return visitor.visit(this);
    }
}
