package grahamcompiler.AST.node.ExprNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.UnaryOp;
import grahamcompiler.utility.location;
import grahamcompiler.IR.IRBase.IRTraversal;
import grahamcompiler.IR.Value.IntegerValue;

public abstract class UnaryExprNode extends ExprNode{
    private UnaryOp option;
    private ExprNode expr;
    public UnaryExprNode(location pos, UnaryOp op, ExprNode e) {
        super(pos);
        option = op;
        expr = e;
    }
    public UnaryOp getOption() {
        return option;
    }
    public ExprNode getExpr() {
        return expr;
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
