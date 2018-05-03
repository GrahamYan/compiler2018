package grahamcompiler.AST.node.ExprNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.UnaryOp;
import grahamcompiler.utility.location;

public class SuffixExprNode extends UnaryExprNode {
    public SuffixExprNode(location pos, UnaryOp op, ExprNode expr) {
        super(pos, op, expr);
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
