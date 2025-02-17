// super() must be the first statement in a constructor.
// super.methodName() is used to invoke a parent class method when a subclass overrides it.
// super.variableName is used to access the parent class's instance variable if the child class has the same variable name.

class Person {

    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void displayDetails () {
        System.out.println();
        System.out.println("Name : "+ this.name);
        System.out.println("Age : "+ this.age);
        System.out.println("Gender : "+ this.gender);
    }
}

class Student_ extends Person {

    long std_id;
    String course;
    int semester;

    public Student_ (String name, int age, String gender, long std_id, String course, int semester) {
        super(name, age, gender);

        this.std_id = std_id;
        this.course = course;
        this.semester = semester;
    }

    void displayDetails () {
        super.displayDetails();

        System.out.println();
        System.out.println("Student ID : "+ std_id);
        System.out.println("Course : "+ course);
        System.out.println("Semester : "+ semester);
    }
}


public class SuperKeywordDemo {

    public static void main(String[] args) {
        Person per1 = new Person("Arthur Morgan", 32, "Male");
        per1.displayDetails();

        Student_ std1 = new Student_("Jinesh", 18, "Male", 24019411132L, "BTech CSE", 2);
        std1.displayDetails();
    }
}
