package grahamcompiler.AST.node.ExprNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.location;

import java.util.List;

public class ExprListNode extends ExprNode{
    private List<ExprNode> expresses;
    public ExprListNode(location pos, List<ExprNode> exprs) {
        super(pos);
        expresses = exprs;
    }
    public void addExpr(ExprNode node) {
        expresses.add(node);
    }
    public List<ExprNode> getExpresses() {
        return expresses;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
