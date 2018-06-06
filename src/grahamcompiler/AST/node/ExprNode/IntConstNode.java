package grahamcompiler.AST.node.ExprNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.Type.BuiltInType;
import grahamcompiler.utility.location;
import grahamcompiler.IR.IRBase.IRTraversal;
import grahamcompiler.IR.Value.Immediate;

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
    @Override
    public Immediate accept(IRTraversal visitor) {
        return visitor.visit(this);
    }
}
