import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Check if the radius is positive
        if (radius < 0) {
            System.out.println("Radius cannot be negative. Please enter a positive value.");
        } else {

            double area = calculateArea(radius);
            System.out.println("The area of the circle is: " + area);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
