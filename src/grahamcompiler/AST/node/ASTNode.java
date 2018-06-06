package grahamcompiler.AST.node;

import grahamcompiler.AST.tool.*;
import grahamcompiler.utility.location;
import grahamcompiler.IR.IRBase.IRTraversal;

public abstract class ASTNode {
    private location pos;
    public ASTNode() {
        pos = new location(0,0);
    }
    public ASTNode(location loc) {
        pos = loc;
    }
    public location getLocation() {
        return pos;
    }
    public abstract void accept(ASTVisitor visitor);
    public abstract Object accept(IRTraversal visitor);
}
