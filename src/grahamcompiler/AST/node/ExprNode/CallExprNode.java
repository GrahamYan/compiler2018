package grahamcompiler.AST.node.ExprNode;

import jdk.nashorn.internal.codegen.CompilerConstants;
import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.Name;
import grahamcompiler.utility.location;

public class CallExprNode extends ExprNode {
    private Name funcName;
    private ExprListNode parameter;
    public CallExprNode(location pos, String name, ExprListNode param) {
        super(pos);
        funcName = Name.getName(name);
        parameter = param;
    }
    public Name getFuncName() {
        return funcName;
    }
    public ExprListNode getParameter() {
        return parameter;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
