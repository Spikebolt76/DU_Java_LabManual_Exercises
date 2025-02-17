// Create a class named 'Member' having the following members:
// 1-Name, 2-Age, 3-Phone number, 4-Address, 5-Salary
//  It also has a method named 'printSalary' which prints the salary of the members.
//  Two classes 'Employee' and Manager' inherits the 'Member' class.
//  The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
//      => Now assign name, age, phone number address and salary to an employee and
//         a manager by making an object of both of these classes and print the same along with specialization and department respectively.

class Member {
    String name;
    int age;
    long phoneNumber;
    String address;
    double salary;

    public Member (String name, int age, long phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    void printSalary () {
        System.out.println("The Salary of the Member is = "+ this.salary);
    }

}

class Employee extends Member {

    String specialization;

    public Employee (String name, int age, long phoneNumber, String address, double salary, String specialization) {
        super (name, age, phoneNumber, address, salary);

        this.specialization = specialization;
    }
}

class Manager extends Member {

    String department;

    public Manager (String name, int age, long phoneNumber, String address, double salary, String department) {
        super (name, age, phoneNumber, address, salary);

        this.department = department;
    }
}
public class MemberClass_Inherit {

    public static void main (String[] args) {

        Employee emp1 = new Employee("Jinesh Savaliya", 18, 9235422001L, "23, Downtown, street unknown, Rajkot", 45_000, "BTech CSE");


    }

}
