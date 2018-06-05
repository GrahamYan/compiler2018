package grahamcompiler.IR.IRBase;

import grahamcompiler.AST.node.StmtNode.BlockNode;
import grahamcompiler.IR.IRInstruction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class BasicBlock {
    public enum BlockType {
        IF, WHILE, FOR, ELSE
    }

    private IRInstruction head;
    private IRInstruction tail;
    private BlockType blocktype;
    private List<IRInstruction> instructions;
    private Set<BasicBlock> succ = new HashSet<>();
    private Set<BasicBlock> prev = new HashSet<>();

    public BasicBlock() {
        instructions = new ArrayList<>();
    }

    public BasicBlock(IRInstruction head, IRInstruction tail, BlockType blocktype) {
        this.head = head;
        this.tail = tail;
        this.blocktype = blocktype;
        this.instructions = new ArrayList<>();
    }

    public BasicBlock(List<IRInstruction> inst) {
        this.instructions = inst;
        this.head = inst.get(0);
        this.tail = inst.get(inst.size() - 1);
    }

    public BlockType getBlocktype() {
        return blocktype;
    }

    public IRInstruction getHead() {
        return head;
    }

    public IRInstruction getTail() {
        return tail;
    }

    public List<IRInstruction> getInstructions() {
        return instructions;
    }

    public void setBlocktype(BlockType blocktype) {
        this.blocktype = blocktype;
    }

    public void setHead(IRInstruction head) {
        this.head = head;
    }

    public void setTail(IRInstruction tail) {
        this.tail = tail;
    }

    public void addInstruction(IRInstruction inst) {
        this.instructions.add(inst);
    }

    public void addSucc(BasicBlock succ) {this.succ.add(succ);}

    public void addPrec(BasicBlock prev) {this.prev.add(prev);}
}
