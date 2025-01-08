//Write a program to calculate the area of Rectangle :

import java.util.Scanner;

public class area_of_Rectangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle : ");
        int length = input.nextInt();
        System.out.println("Enter the width of the rectangle : ");
        int width = input.nextInt();

        int areaRectangle = length * width;
        System.out.println("The area of the rectangle = "+ areaRectangle +" unit^2");

        input.close();
    }
}
