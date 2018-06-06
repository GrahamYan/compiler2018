package grahamcompiler.AST.node.ExprNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.location;
import grahamcompiler.IR.IRBase.IRTraversal;
import grahamcompiler.IR.Value.IntegerValue;

import java.util.List;

public class ExprListNode extends ExprNode{
    private List<ExprNode> expresses;
    public ExprListNode(location pos, List<ExprNode> exprs) {
        super(pos);
        expresses = exprs;
    }
    public void addExpr(ExprNode node, int pos) {
        expresses.add(pos, node);
    }
    public List<ExprNode> getExpresses() {
        return expresses;
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
