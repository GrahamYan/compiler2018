package grahamcompiler.IR;

public abstract class Terminator extends IRInstruction {
    public Terminator(Label label) {
        super(label);
    }
}
