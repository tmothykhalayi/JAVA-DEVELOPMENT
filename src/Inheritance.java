// Parent Class (Superclass)
class Inheritance {
    String brand;
    int year;

    // Constructor of the parent class
    public Inheritance(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method in the parent class
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    // A method to describe the vehicle
    public void start() {
        System.out.println(brand + " vehicle is starting.");
    }
}

// Child Class (Subclass) - Car
class Car extends Inheritance {
    int doors;

    // Constructor of the child class
    public Car(String brand, int year, int doors) {
        super(brand, year);  // Call the constructor of the parent class
        this.doors = doors;
    }

    // Overriding the start method for Car
    @Override
    public void start() {
        System.out.println(brand + " car is starting with " + doors + " doors.");
    }

    // Additional method for Car
    public void honk() {
        System.out.println(brand + " car honks: Beep Beep!");
    }
}

// Main class to run the program
public class Main  {
    public static void main(String[] args) {
        // Create an object of Car
        Car car = new Car("Toyota", 2022, 4);

        // Display details and call methods
        System.out.println("Car details:");
        car.displayDetails();
        car.start();  // Overridden method for Car
        car.honk();   // Car-specific method
    }
}
