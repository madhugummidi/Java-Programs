import java.util.Scanner;

public class BudgetTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user's total income
        System.out.print("Enter your total income: ");
        double income = scanner.nextDouble();
        
        double totalExpenses = 0;
        String expenseDetails = "";
        
        // Enter multiple expenses
        while (true) {
            System.out.print("Enter expense category (or 'done' to finish): ");
            String category = scanner.next();
            
            if (category.equalsIgnoreCase("done")) {
                break;
            }
            
            System.out.print("Enter amount spent on " + category + ": ");
            double amount = scanner.nextDouble();
            
            // Add to total expenses and store by category
            totalExpenses += amount;
            expenseDetails += category + ": $" + amount22;
        }
        
        // Calculate total savings
        double savings = income - totalExpenses;
        
        // Display summary
        System.out.println("\n===== Budget Summary =====");
        System.out.println("Total Income: $" + income);
        System.out.println("Total Expenses: $" + totalExpenses);
        System.out.println("Total Savings: $" + savings);
        
        System.out.println("\nExpense Breakdown by Category:");
        System.out.print(expenseDetails);
        
        scanner.close();
    }
}
