package grahamcompiler.AST.node.ExprNode;

import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.Type.BuiltInType;
import grahamcompiler.utility.location;
import grahamcompiler.IR.IRBase.IRTraversal;
import grahamcompiler.IR.Value.IntegerValue;

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
    public void setStr(String str) {this.str = str;}
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public IntegerValue accept(IRTraversal visitor) {
        return visitor.visit(this);
    }
}
