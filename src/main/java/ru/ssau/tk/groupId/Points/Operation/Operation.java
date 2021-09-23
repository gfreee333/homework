package ru.ssau.tk.groupId.Points.Operation;

public abstract class Operation {
    public abstract double apply(double value);
    public double applyTriple(double value)
    {
        apply(value);
        apply(value);
        apply(value);
        return  value;
    }
}

