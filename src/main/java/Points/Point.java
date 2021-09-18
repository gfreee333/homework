package main.java.Points;
public final class Point {
    private  double X;
    private  double Y;
    private double Z;
    public Point(double x, double y, double z) {
        X = x;
        Y = y;
        Z = z;
    }
    public  Point() {
    }
    public void print()
    {
        System.out.print(X);
        System.out.print(Y);
        System.out.println(Z);
    }
    public static void sum(Point point, Point point2, Point point3) {
        point3.X = point2.X + point.X;
        point3.Y = point2.Y + point.Y;
        point3.Z = point2.Z + point.Z;
    }
    public static void  subtract(Point point, Point point2, Point point3) {
        point3.X = point.X - point2.X;
        point3.Y = point.Y - point2.Y;
        point3.Z = point.Z - point2.Z;
    }

    public static void  multiply(Point point, Point point2, Point point3) {
        point3.X = point2.X * point.X;
        point3.Y = point2.Y * point.Y;
        point3.Z = point2.Z * point.Z;
    }
    public static void divide(Point point, Point point2, Point point3) {
        point3.X = point.X / point2.X;
        point3.Y = point.Y / point2.Y;
        point3.Z = point.Z / point2.Z;
    }
    public static void enlarge(Point point, double x)
    {
        point.X = point.X * x;
        point.Y = point.Y*x;
        point.Z = point.Z*x;
    }
    public static void main (String [] args)
    {
        Point point = new Point(1.0 ,2.0 ,3.0 );
        Point point2 = new Point(2.0 ,2.0 ,8.0 );
        Point point3 = new Point();
        point.print();
        point2.print();
        point3.sum(point,point2,point3);
        point3.print();
        point3.multiply(point,point2,point3);
        point3.print();
        point3.divide(point,point2,point3);
        point3.print();
        point3.subtract(point,point2,point3);
        point3.print();
        point.enlarge(point,100);
        point.print();
    }
}
