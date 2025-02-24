// Abstract class Vehicle
abstract class Vehicle {
    // Abstract method (does not have a body)
    public abstract void start();

    // Abstract method
    public abstract void stop();
}

// Inherited class Car
class Car extends Vehicle {
    // Providing implementation for start()
    public void start() {
        System.out.println("The car starts with an ignition key.");
    }

    // Providing implementation for stop()
    public void stop() {
        System.out.println("The car stops using the brake pedal.");
    }
}

// Inherited class Bicycle
class Bicycle extends Vehicle {
    // Providing implementation for start()
    public void start() {
        System.out.println("The bicycle starts by pedaling.");
    }

    // Providing implementation for stop()
    public void stop() {
        System.out.println("The bicycle stops by applying the brakes.");
    }
}

// Main class to run the program
class testbstraction {
    public static void main(String[] args) {
        // Creating objects of the child classes
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        // Calling the methods
        System.out.println("Car:");
        car.start();
        car.stop();

        System.out.println("\nBicycle:");
        bicycle.start();
        bicycle.stop();
    }
}
