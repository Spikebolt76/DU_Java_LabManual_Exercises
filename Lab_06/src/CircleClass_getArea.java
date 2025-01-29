import java.util.Scanner;

public class CircleClass_getArea
{
    static class Circle
    {
        double radius = 1.0;

        Circle(){
            // default constructor, does not return anything, not even void
            System.out.println("Default Constructor called...\n");
        }

        Circle(double newRadius)
        {
            System.out.println("Parameterized Constructor called...");
            radius = newRadius;
        }

//        Circle(double radius)           //with "this" keyword
//        {
//            System.out.println("Parameterized Constructor called...");
//            this.radius = radius;
//        }

        double getArea()
        {
            return radius * radius * Math.PI;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Circle defaultCircle = new Circle();

        double defaultArea = defaultCircle.getArea();
        System.out.println("The area of the defaultCircle Object = "+ defaultArea + "\n");

        System.out.println("Enter the new radius of the circle : ");
        Circle circle1 = new Circle(sc.nextInt());

        double area1 = circle1.getArea();

        System.out.println("The area of the defaultCircle Object = "+ area1 + "\n");

        sc.close();
    }
}
