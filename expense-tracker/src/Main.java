import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Delete Expense");
            System.out.println("4. View Total Expenses");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();  // Consume the newline
                    System.out.print("Enter Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter Date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    Expense expense = new Expense(category, amount, description, date);
                    manager.addExpense(expense);
                    break;

                case 2:
                    List<Expense> expenses = manager.getAllExpenses();
                    System.out.println("\nExpenses:");
                    for (Expense e : expenses) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    System.out.print("Enter expense ID to delete: ");
                    int idToDelete = scanner.nextInt();
                    manager.deleteExpense(idToDelete);
                    System.out.println("Expense deleted.");
                    break;

                case 4:
                    System.out.println("Total Expenses: " + manager.getTotalExpenses());
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
