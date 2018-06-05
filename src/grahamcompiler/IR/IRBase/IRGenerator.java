package grahamcompiler.IR.IRBase;

import grahamcompiler.AST.node.DeclNode.*;
import grahamcompiler.AST.node.ProgNode;
import grahamcompiler.AST.node.ExprNode.*;
import grahamcompiler.AST.node.StmtNode.*;
import grahamcompiler.IR.Value.Address;
import grahamcompiler.IR.Value.Immediate;
import grahamcompiler.IR.IRInstruction;
import grahamcompiler.IR.Value.IntegerValue;
import grahamcompiler.IR.Value.VirtualRegister;
import grahamcompiler.utility.Name;
import grahamcompiler.utility.BinaryOp;
import grahamcompiler.Type.*;
import grahamcompiler.IR.*;
import grahamcompiler.IR.IRType.Class;
import grahamcompiler.IR.IRType.IRType;
import grahamcompiler.IR.IRType.BuiltIn;
import grahamcompiler.IR.IRType.Array;
import grahamcompiler.IR.Label;
import grahamcompiler.utility.UnaryOp;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IRGenerator implements IRTraversal {
    private IRInstruction curInst;
    private Label curLab;
    private IRScope curIRScope;

}
