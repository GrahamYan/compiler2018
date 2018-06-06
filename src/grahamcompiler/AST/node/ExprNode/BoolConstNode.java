package grahamcompiler.AST.node.ExprNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.Type.BuiltInType;
import grahamcompiler.utility.location;
import grahamcompiler.IR.IRBase.IRTraversal;
import grahamcompiler.IR.Value.IntegerValue;

public class BoolConstNode extends ConstExprNode {
    private boolean bool;
    public BoolConstNode(location pos, boolean ans) {
        super(pos);
        bool = ans;
        setExprType(new BuiltInType("bool",1));
    }
    public boolean getBool() {
        return bool;
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
