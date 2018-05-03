package grahamcompiler.AST.node.ExprNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.Type.BuiltInType;
import grahamcompiler.utility.location;

public class StringConstNode extends ConstExprNode{
    private String str;
    public StringConstNode(location pos, String s) {
        super(pos);
        str = s;
        setExprType(new BuiltInType("string", 1));
    }
    public String getStr() {
        return str;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
