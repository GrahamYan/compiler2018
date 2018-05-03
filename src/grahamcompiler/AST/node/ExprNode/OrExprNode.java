package grahamcompiler.AST.node.ExprNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.location;

public class OrExprNode extends  ConditionExprNode {
    public OrExprNode(location pos, ExprNode left, ExprNode right) {
        super(pos, left, right);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
