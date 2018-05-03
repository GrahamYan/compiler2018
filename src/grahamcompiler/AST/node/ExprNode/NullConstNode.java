package grahamcompiler.AST.node.ExprNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.Type.BuiltInType;
import grahamcompiler.utility.location;

public class NullConstNode extends ConstExprNode{
    public NullConstNode(location pos) {
        super(pos);
        setExprType(new BuiltInType("null",0));
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
