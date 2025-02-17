// Declare a class called Student having the following data members:
// id_no, no_of_subjects_registered, subject_code, subject_credits, grade_obtained and spi.
// Define constructor and calculate_spi methods.
// Define main to instantiate an array for objects of class student to process data of n students to be given as command line arguments.


import java.util.Scanner;

class Student {

    int id_no;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    char[] grade_obtained;
    double spi;

    public Student(int id_no, int no_of_subjects_registered, String[] subject_code, int[] subject_credits, char[] grade_obtained) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
        this.spi = calculate_spi();
    }


    private double calculate_spi() {
        int total_credits = 0;
        int weighted_sum = 0;

        for (int i = 0; i < no_of_subjects_registered; i ++) {

            int gradePoints = getGradePoints(grade_obtained[i]);
            weighted_sum += gradePoints * subject_credits[i];
            total_credits += subject_credits[i];
        }

        return (total_credits == 0) ? 0.0 : (double) weighted_sum / total_credits;
    }

    private int getGradePoints(char grade) {
        return switch (grade) {
            case 'A' -> 10;
            case 'B' -> 8;
            case 'C' -> 6;
            case 'D' -> 4;
            case 'E' -> 2;
            case 'F' -> 0;
            default -> 0;
        };
    }

    public void display() {
        System.out.println("ID No: " + id_no);
        System.out.println("Subjects Registered: " + no_of_subjects_registered);
        System.out.println("SPI: " + spi);
    }
}


public class StudentInfo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int noOfStudents = Integer.parseInt(args[0]);
        Student[] students = new Student[noOfStudents];

        for (int i = 0; i < noOfStudents; i ++) {

            System.out.println("Enter details for student " + (i + 1) + " : ");

            System.out.print("ID No: ");
            int id_no = sc.nextInt();

            System.out.print("Number of subjects registered: ");
            int num_subjects = sc.nextInt();

            String[] subject_code = new String[num_subjects];
            int[] subject_credits = new int[num_subjects];
            char[] grade_obtained = new char[num_subjects];

            for (int j = 0; j < num_subjects; j++) {

                System.out.println("------------------");
                System.out.println("Enter details for Subject [" + (j + 1) +"] : ");
                System.out.println("Enter Subject Code : ");
                sc.nextLine();
                subject_code[j] = sc.nextLine();

                System.out.println("Enter Subject Credits : ");
                subject_credits[j] = sc.nextInt();

                System.out.println("Enter Grade Obtained : ");
                grade_obtained[j] = sc.next().charAt(0);
            }
            System.out.println("///////////////////////////////////////");

            students[i] = new Student(id_no, num_subjects, subject_code, subject_credits, grade_obtained);
        }

        System.out.println("\nStudent SPI Details:");
        for (Student student : students) {
            student.display();
            System.out.println("-------------------");
        }

        sc.close();
    }
}
