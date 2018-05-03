package grahamcompiler.AST.node.ExprNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.Type.BuiltInType;
import grahamcompiler.utility.location;

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
}
