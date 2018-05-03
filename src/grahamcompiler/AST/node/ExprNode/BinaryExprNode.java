package grahamcompiler.AST.node.ExprNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.BinaryOp;
import grahamcompiler.utility.location;

public class BinaryExprNode extends ExprNode {
    private ExprNode l, r;
    private BinaryOp op;
    public BinaryExprNode(location pos, ExprNode lhs, ExprNode rhs, BinaryOp option) {
        super(pos);
        l = lhs;
        r = rhs;
        op = option;
    }
    public BinaryOp getOp() {
        return op;
    }
    public ExprNode getL() {
        return l;
    }
    public ExprNode getR() {
        return r;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
