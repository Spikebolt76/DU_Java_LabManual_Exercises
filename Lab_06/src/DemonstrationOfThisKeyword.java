// Write a program in Java to demonstrate use of this keyword.
// Check whether this can access the Static variables of the class or not.

class Example {

    int instanceVar;
    static int staticVar = 30;

    public Example (int instanceVar, int staticVar) {

        this.instanceVar = instanceVar;
        this.staticVar = staticVar;
    }

    void display() {
        System.out.println("Instance Variable of the object = "+ this.instanceVar);
        System.out.println("Static Variable of the class = "+ this.staticVar);
    }
}

public class DemonstrationOfThisKeyword {

    public static void main(String[] args) {

        Example ex1 = new Example(50, 30);

        Example ex2 = new Example(100, 300);

        ex2.display();
    }
}
