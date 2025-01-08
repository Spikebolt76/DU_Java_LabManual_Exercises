/*
The marks obtained by a student in 5 different subjects are input through the keyboard.
The student gets a division as per the following rules:
  I. Percentage above or equals to 60-first division
  II. Percentage between 50 to 59-second division
  III. Percentage between 40 and 49-Third division
  IV. Percentage less than 40-fail Write a program to calculate the division obtained by the student.
*/
import java.util.Scanner;

public class Grade_obtained
{
    public static final int TOTAL_MARKS = 500;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks of all 5 subjects : ");
        int sub1 = input.nextInt();
        int sub2 = input.nextInt();
        int sub3 = input.nextInt();
        int sub4 = input.nextInt();
        int sub5 = input.nextInt();

        int obtainedMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = (double) obtainedMarks / TOTAL_MARKS * 100.0;

        if (percentage >= 60)
        {
            System.out.println("Student [__] gets : FIRST DIVISION");
        } else if (percentage >= 50) {
            System.out.println("Student [__] gets : SECOND DIVISION");
        } else if (percentage >= 40) {
            System.out.println("Student [__] gets : THIRD DIVISION");
        } else if (percentage < 40) {
            System.out.println("Student [__] is FAILED ...");
        }

        input.close();
    }
}
