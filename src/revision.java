public class revision {
    //question 3
    class animal{
        public void sound (){
            System.out.println(animal makes sound);
        }
    }
    class horse extends animal{
        @Override
        public void sound() {
            System.out.println("Horse neighs");
        }
    }

    public class Main {
        public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Superclass object
        Animal myHorse = new Horse();   // Subclass object

        // Demonstrating runtime polymorphism
        myAnimal.sound();  // Output: Animal makes a sound
        myHorse.sound();   // Output: Horse neighs
    }
    }
    //b
    // Class to compare two numbers
    class NumberCompare {
        private int num1;
        private int num2;

        // Constructor to initialize the numbers
        public NumberCompare(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        // Method to compare the numbers
        public void compare() {
            if (num1 == num2) {
                System.out.println("The numbers are equal.");
            } else {
                System.out.println("The numbers are not equal.");
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Create an object of NumberCompare with two numbers
            NumberCompare compareNumbers = new NumberCompare(10, 20);

            // Call the compare method
            compareNumbers.compare();  // Output: The numbers are not equal.
        }
    }

//question 4
// Base class Rectangle
class Rectangle {
    protected double length;
    protected double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of rectangle
    public double calculateArea() {
        return length * width;
    }
}

    // Derived class Square inherits from Rectangle
    class Square extends Rectangle {

        // Constructor for Square class, passing the same length for length and width
        public Square(double side) {
            super(side, side);  // Call the constructor of Rectangle with equal length and width
        }

        // Method to calculate area of square
        @Override
        public double calculateArea() {
            return length * length;  // Since it's a square, length equals width
        }
    }

    public class ShapeArea {
        public static void main(String[] args) {
            // Create an object of Rectangle
            Rectangle rectangle = new Rectangle(5.0, 10.0);
            System.out.println("Area of Rectangle: " + rectangle.calculateArea());

            // Create an object of Square
            Square square = new Square(4.0);
            System.out.println("Area of Square: " + square.calculateArea());
        }
    }
//b
// Class Shape with a parameterized constructor
class Shape {
    private double length;
    private double width;

    // Parameterized constructor to initialize length and width
    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to display the values of length and width
    public void displayDimensions() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}

    public class Main {
        public static void main(String[] args) {
            // Create an object of Shape with specific values
            Shape myShape = new Shape(8.0, 5.0);

            // Display the dimensions of the shape
            myShape.displayDimensions();
        }
    }
//c
public class SumOddNumbers {
    public static void main(String[] args) {
        int sum = 0;

        // Using for loop to iterate through numbers between 15 and 70
        for (int i = 15; i <= 70; i++) {
            if (i % 2 != 0) {  // Check if the number is odd
                sum += i;  // Add odd number to sum
            }
        }

        // Output the sum of odd numbers
        System.out.println("Sum of odd numbers between 15 and 70: " + sum);
    }
}



}
