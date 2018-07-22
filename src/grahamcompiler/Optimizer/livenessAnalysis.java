package grahamcompiler.Optimizer;

import grahamcompiler.IR.*;
import grahamcompiler.IR.Value.IntegerValue;
import grahamcompiler.IR.Value.Register;
import grahamcompiler.IR.IRBase.BasicBlock;
import grahamcompiler.IR.Value.VirtualRegister;

import java.util.*;

public class livenessAnalysis {
    public Map<VirtualRegister, Integer> map = new HashMap<>();
    private IRInstruction entry;
    private IRInstruction curEntry;
    private IRInstruction initializeEntry;
    private IRInstruction lastEntry;

    public static class graphNode{
        public List<graphNode> neighbours = new LinkedList<>();
        public Integer color = -1;
        public String name;
        public Register register;
        public int degree = 0;
        public graphNode(Register register) {
            this.register = register;
            this.name = register.toString();
        }
        void add(graphNode n) {
            neighbours.add(n);
            ++degree;
        }
        void dec() {
            for (int i = 0; i < neighbours.size(); ++i)
                --neighbours.get(i).degree;
        }
        public String toString() {
            return name;
        }
    }

    private void liveness (List<BasicBlock> function){
        List<BasicBlock> reversePreOrder = function;
        for(BasicBlock tmp : reversePreOrder){
            for(IRInstruction instr = tmp.getHead(); instr != null; instr = instr.getNext()){
                if(instr.liveIn != null){
                    instr.liveIn.clear();
                    instr.liveOut.clear();
                }
                else{
                    instr.liveIn = new HashSet<>();
                    instr.liveOut = new HashSet<>();
                }
            }
        }

        Set<VirtualRegister> in = new HashSet<>();
        Set<VirtualRegister> out = new HashSet<>();

        boolean changed = true;
        while(changed){
            changed = false;
            for(BasicBlock tmp :reversePreOrder){
                for(IRInstruction instr = tmp.getTail(); instr != null; instr = instr.getPrev()) {
                    in.clear();
                    out.clear();
                    in.addAll(instr.liveIn);
                    out.addAll(instr.liveOut);
                    instr.liveIn.clear();
                    instr.liveOut.clear();
                    for(Register usedReg : instr.usedRegister) {
                        if(usedReg instanceof VirtualRegister)
                            instr.liveIn.add((VirtualRegister) usedReg);
                    }
                    instr.liveIn.addAll(instr.liveOut);
                    Register defRegister = instr.getDefRegister();
                    if(defRegister instanceof VirtualRegister && !instr.usedRegister.contains(defRegister)){
                        instr.liveIn.remove(defRegister);
                    }

                    if(!instr.liveIn.equals(in) || !instr.liveOut.equals(out)){
                        changed = true;
                    }
                }
            }
        }
    }
}
