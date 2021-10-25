package ru.mirea.inbo0220.markaryants.pr11.Task3;

public class Divide extends Operator {
    public Divide(Operand left, Variable vRight) {
        super(left, vRight);
    }

    public Divide(Variable vLeft, Variable vRight) {
        super(vLeft, vRight);
    }

    public Divide(Variable vLeft, Operand right) {
        super(vLeft, right);
    }

    public Divide(Operand left, Operand right) {
        super(left, right);
    }

    @Override
    public double getValue() {
        return left.getValue() / right.getValue();
    }
}
