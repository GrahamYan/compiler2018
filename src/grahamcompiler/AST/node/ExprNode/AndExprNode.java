package grahamcompiler.AST.node.ExprNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.location;
import grahamcompiler.IR.IRBase.IRTraversal;
import grahamcompiler.IR.Value.Immediate;
import grahamcompiler.IR.Value.IntegerValue;

public class AndExprNode extends  ConditionExprNode {
    public AndExprNode(location pos, ExprNode left, ExprNode right) {
        super(pos, left, right);
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
