package grahamcompiler.AST.node.DeclNode;

import grahamcompiler.AST.node.StmtNode.StmtNode;
import grahamcompiler.utility.location;

public abstract class DeclNode extends StmtNode {
    protected boolean is_func;
    public DeclNode(location pos) {
        super(pos);
        is_func = false;
    }

    public void setIsFunction(boolean is_func) {
        this.is_func = is_func;
    }

    public boolean isFunction() {
        return is_func;
    }
}
