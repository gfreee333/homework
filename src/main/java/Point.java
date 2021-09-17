package main.java;

public final class Point {
    private double X;
    private double Y;
    private double Z;
    public Point(double x, double y, double z) {
        X = x;
        Y = y;
        Z = z;
    }
    public void print()
    {
        System.out.print(X);
        System.out.print(Y);
        System.out.println(Z);

    }
    public static void main (String [] args)
    {
        Point point = new Point(1,2,3);
        Point point2 = new Point(2,2,8);
        Point point3 = new Point(5,3,2);
        point.print();
        point2.print();
    }
}
