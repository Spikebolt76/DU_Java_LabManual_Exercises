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
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of subjects : ");
        int subjects = input.nextInt();
        System.out.println("Enter maximum marks per test : ");
        int totalMarks = input.nextInt() * subjects;

        int obtainedMarks = 0;
        for (int i = 1; i <= subjects; i++)
        {
            System.out.println("Enter marks of subject" + i + " : ");
            obtainedMarks += input.nextInt();
        }

        double percentage = (double) obtainedMarks / totalMarks * 100.0;

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
