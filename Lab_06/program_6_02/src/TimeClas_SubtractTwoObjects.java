class Time_
{
    int hour;
    int minute;


    public Time_(int hour, int minute)
    {
        this.hour = hour + hour / 60;
        this.minute = minute % 60;
    }

    public void displayTime()
    {
        System.out.printf("Resulting time = %02d : %02d", this.hour, this.minute);
    }
}

public class TimeClas_SubtractTwoObjects
{
    public static void main(String[] args)
    {

    }
}
