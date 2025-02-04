//WAP that counts the number of objects created using static.

class Objects
{
    static int countObjs;

    Objects() {
        countObjs++;
    }

    static void printObjects(){
        System.out.println("Number of objects created : " + countObjs);
    }
}

public class Count_
{
    public static void main(String[] args)
    {
        Objects obj1 = new Objects();
        Objects obj2 = new Objects();
        Objects obj3 = new Objects();
        Objects obj4 = new Objects();
        Objects obj5 = new Objects();

        Objects.printObjects();
    }
}
