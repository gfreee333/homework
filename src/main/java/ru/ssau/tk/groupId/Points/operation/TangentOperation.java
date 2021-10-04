package ru.ssau.tk.groupId.Points.operation;

public class TangentOperation extends Operation {
    @Override
    public double apply(double value) {
        return Math.tan(value);
    }
}
