package grahamcompiler.AST.node.ExprNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.Type.BuiltInType;
import grahamcompiler.utility.location;
import grahamcompiler.IR.IRBase.IRTraversal;
import grahamcompiler.IR.Value.IntegerValue;

public abstract class ConditionExprNode extends ExprNode{
    private ExprNode left, right;
    public ConditionExprNode(location pos, ExprNode l, ExprNode r) {
        super(pos);
        left = l;
        right = r;
        setExprType(new BuiltInType("bool", 1));
    }
    public ExprNode getLeft() {
        return left;
    }
    public ExprNode getRight() {
        return right;
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
