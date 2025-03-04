// Define class for Complex number with real and imaginary as data members.
// Create its constructor, overload the constructors. Also define addition method to add two complex objects.

class ComplexNumbers
{
    int real;
    int imaginary;

    public ComplexNumbers(int r, int i)
    {
        real = r;
        imaginary = i;
    }

    public void displayNum()
    {
        System.out.println("Complex number = " + real + "i + " + imaginary);
    }

    public static ComplexNumbers add(ComplexNumbers num1, ComplexNumbers num2)
    {
        ComplexNumbers num3 = new ComplexNumbers(num1.real, num1.imaginary);

        num3.real = num2.real + num1.real;
        num3.imaginary = num2.imaginary + num1.imaginary;

        return num3;
    }
}

public class ComplexNumbers_class
{
    public static void main(String[] args)
    {
        ComplexNumbers num1 = new ComplexNumbers(2, 3);
        ComplexNumbers num2 = new ComplexNumbers(4, 5);

        System.out.println("First Complex Number :");
        num1.displayNum();

        System.out.println("Second Complex Number :");
        num2.displayNum();

        ComplexNumbers result = ComplexNumbers.add(num1, num2);

        System.out.println("Resulting Complex Number :");
        result.displayNum();

    }
}
