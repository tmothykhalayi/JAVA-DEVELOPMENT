import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input for the first set
        System.out.print("Enter first number of first set: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number of first set: ");
        int num2 = scanner.nextInt();

        // Getting input for the second set
        System.out.print("Enter first number of second set: ");
        int num3 = scanner.nextInt();
        System.out.print("Enter second number of second set: ");
        int num4 = scanner.nextInt();

        // Calculating the sum of both sets
        int sum1 = addNumbers(num1, num2);
        int sum2 = addNumbers(num3, num4);

        // Outputting the results
        System.out.println("Sum of first set: " + sum1);
        System.out.println("Sum of second set: " + sum2);

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
