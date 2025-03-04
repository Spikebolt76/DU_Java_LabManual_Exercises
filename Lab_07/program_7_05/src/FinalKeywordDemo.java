class Vehicle {

    final int maxSpeed = 120;

    // Final method that cannot be overridden
    public final void engineType() {
        System.out.println("Internal Combustion Engine");
    }
}

class Car extends Vehicle {

    // Attempting to override the final method will result in a compile-time ERROR
    // public void engineType() {
    //     System.out.println("Electric Engine");  // Compilation error
    // }

    // Attempting to modify the final variable maxSpeed will result in a compile-time ERROR
    public void changeMaxSpeed() {
        // maxSpeed = 150; // Compilation error
        System.out.println("maxSpeed cannot be modified. It is final and fixed at: " + maxSpeed);
    }
}

public class FinalKeywordDemo {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.engineType();

        Car car = new Car();
        car.engineType();
        car.changeMaxSpeed();
    }
}
