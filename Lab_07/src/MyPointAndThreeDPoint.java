/*
Design a class named MyPoint to represent a point with x- and y-coordinates.
The class contains: The data fields x and y that represent the coordinates with getter methods.

1. a no-arg constructor that creates a point (0, 0).
2. a constructor that constructs a point with specified coordinates.
3. a method named distance that returns the distance from this point to a specified point of the MyPoint type.
4. a method named distance that returns the distance from this point to another point with specified x- and y-coordinates.

Create a class named ThreeDPoint to model a point in a three-dimensional space.
Let ThreeDPoint be derived from MyPoint with following additional features:
    1. A data fields named z that represents the z-coordinate.
    2. A no-arg constructor that creates a point (0, 0, 0).
    3. A constructor that constructs a point with three specified coordinates.
    4. A get method that returns the z value.
    5. Override the distance method to return the distance between two points in the three-dimensional space.

Write a program that creates two points (0, 0, 0) and (10, 30, 25.5) and display the distance between the two points.
 */

class MyPoint {

    private double x, y;

    public MyPoint () {
        this (0.0, 0.0);
    }

    public MyPoint (double x, double y) {
        this.x = x;
        this.y = y;
    }

//    // Distance to another MyPoint
//    public double distance(MyPoint p) {
//        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
//    }



    // Distance to specified x, y coordinates
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double getX() { return x; }

    public double getY() { return y; }
}

class ThreeDPoint extends MyPoint {

    private double z;

    public ThreeDPoint () {
        super(0.0, 0.0);
        this.z = 0.0;
    }

    public ThreeDPoint (double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    // Distance to another ThreeDPoint
    public double distance(ThreeDPoint p3d) {
        return Math.sqrt(Math.pow(getX() - p3d.getX(), 2) + Math.pow(getY() - p3d.getY(), 2) + Math.pow(getZ() - p3d.getZ(), 2));
    }

    // Distance to specified x, y, z coordinates
    public double distance(double x, double y, double z) {
        return Math.sqrt(Math.pow(getX() - x, 2) + Math.pow(getY() - y, 2) + Math.pow(getZ() - z, 2));
    }

    public double getZ() { return z; }
}
public class MyPointAndThreeDPoint {

    public static void main(String[] args) {

        ThreeDPoint p1 = new ThreeDPoint();
        ThreeDPoint p2 = new ThreeDPoint(10, 30, 25.5);

        System.out.println("The distance between two given points = "+ p1.distance(p2) + " units");

    }
}
