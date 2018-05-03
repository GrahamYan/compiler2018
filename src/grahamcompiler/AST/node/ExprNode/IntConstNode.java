package grahamcompiler.AST.node.ExprNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.Type.BuiltInType;
import grahamcompiler.utility.location;

public class IntConstNode extends ConstExprNode {
    private int integer;
    public IntConstNode(location pos, int ans) {
        super(pos);
        integer = ans;
        setExprType(new BuiltInType("int", 1));
    }
    public int getInteger() {
        return integer;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
