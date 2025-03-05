import java.util.Scanner;
public class feption{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("ENTER A POSITIVE NUMBER");
            int num = sc.nextInt();
            if (num < 0) throw new ArithmeticException("negative number not allowed");
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
                System.out.println("factorial: " + fact);
            }
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        sc.close();
    }
}