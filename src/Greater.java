import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 1;

        do {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();
            sum += num;
            i++;
        } while (i <= 10);

        System.out.println("The sum of the ten numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
