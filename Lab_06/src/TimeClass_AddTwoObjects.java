// Define Time class with constructor to initialize hour and minute.
// Also define addition method to add two time objects.

import java.util.Scanner;

class Time
{
    int hour;
    int minute;


    public Time(int hour, int minute)
    {
        this.hour = hour + hour / 60;
        this.minute = minute % 60;
    }

    public void displayTime()
    {
        System.out.printf("Resulting time = %02d : %02d", this.hour, this.minute);
    }
}

public class TimeClass_AddTwoObjects
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Hour and Minutes respectively  for time1 : ");
        Time time1 = new Time(sc.nextInt(), sc.nextInt());

        System.out.println("Enter Hour and Minute  respectively  for time2 : ");
        Time time2 = new Time(sc.nextInt(), sc.nextInt());

        Time time3 = new Time(time1.hour + time2.hour, time1.minute + time2.minute);

        time3.displayTime();
    }
}
