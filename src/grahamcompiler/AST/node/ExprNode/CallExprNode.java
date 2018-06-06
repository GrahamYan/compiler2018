package grahamcompiler.AST.node.ExprNode;

import jdk.nashorn.internal.codegen.CompilerConstants;
import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.Name;
import grahamcompiler.utility.location;
import grahamcompiler.AST.node.DeclNode.FuncDeclNode;
import grahamcompiler.AST.object.FuncDeclObject;
import grahamcompiler.IR.IRBase.IRTraversal;
import grahamcompiler.IR.Value.IntegerValue;

public class CallExprNode extends ExprNode {
    private Name funcName;
    private ExprListNode parameter;
    private FuncDeclNode function;
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
    public void setFuncName(Name funcName) {
        this.funcName = funcName;
    }
    public void setFunction(FuncDeclNode function) {
        this.function = function;
    }
    public FuncDeclNode getFunction() {
        return function;
    }
    public void addParam(ExprNode node, int pos) {
        this.parameter.addExpr(node, pos);
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
