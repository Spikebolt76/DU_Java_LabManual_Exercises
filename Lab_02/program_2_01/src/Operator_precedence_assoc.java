public class Operator_precedence_assoc
{
    public static void main(String[] args)
    {
        int a = 10 + 20 * 30;

        int b = 100 / 10 * 100;

        int c = 5 * 4 / 4 % 3;

        int d = 100 + 200 / 10 - 3 * 10;

        System.out.println("Answer of a = "+ a);
        System.out.println("Answer of b = "+ b);
        System.out.println("Answer of c = "+ c);
        System.out.println("Answer of d = "+ d);
    }

}
