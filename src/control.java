import java.util.Scanner;
public class control {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        String s = sc.nextLine();
        int mark = Integer.parseInt(s);
        if (mark >= 0 && mark <= 100) {
            if (mark >= 70 && mark <= 100) {
                System.out.println("A");
            } else if (mark >= 60 && mark <= 69) {
                System.out.println("B");
            } else if (mark >= 50 && mark <= 59) {
                System.out.println("C");
            } else if (mark >= 40 && mark <= 49) {
                System.out.println("D");
            } else {
                System.out.println("F ,Keep 1000 for Supplemantary");
            }

        } else {

            System.out.println("invalid mark");
        }
        sc.close();
    }
}



