package grahamcompiler.AST.node.DeclNode;

import grahamcompiler.utility.Name;
import grahamcompiler.utility.location;
import grahamcompiler.Type.ClassType;
import grahamcompiler.AST.tool.ASTVisitor;
import grahamcompiler.utility.Scope;

import java.util.List;

public class ClassDeclNode extends DeclNode{
    ClassType type;
    private List<FuncDeclNode> memFunction;
    private List<VarDeclNode> memVarible;
    private Scope internalScope, externalScope;
    private int size;

    public ClassDeclNode (location pos, ClassType ty, List<FuncDeclNode> func, List<VarDeclNode> var) {
        super(pos);
        type = ty;
        memFunction = func;
        memVarible = var;
    }

    public ClassType getType()
    {
        return type;
    }
    public void setType(ClassType t)
    {
        type = t;
    }
    public List<FuncDeclNode> getMemberFunction()
    {
        return memFunction;
    }
    public List<VarDeclNode> getMemberVarible()
    {
        return memVarible;
    }

    public Scope getExternalScope() {
        return externalScope;
    }

    public Scope getInternalScope() {
        return internalScope;
    }

    public void setExternalScope(Scope externalScope) {
        this.externalScope = externalScope;
    }

    public void setInternalScope(Scope internalScope) {
        this.internalScope = internalScope;
    }

    @Override
    public Name getName() {
        return type.getTypeName();
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
