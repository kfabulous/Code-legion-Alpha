import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    // History list to keep track of calculations
    private static ArrayList<String> history = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Welcome to the Java Calculator ===");

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add (+)");
            System.out.println("2. Subtract (-)");
            System.out.println("3. Multiply (*)");
            System.out.println("4. Divide (/)");
            System.out.println("5. Modulo (%)");
            System.out.println("6. View Calculation History");
            System.out.println("7. Exit");
            System.out.print("Enter choice (1-7): ");

            int choice = scanner.nextInt();

            // Handle exit and history immediately before asking for numbers
            if (choice == 7) {
                running = false;
                System.out.println("Goodbye! Thanks for using the calculator.");
                break;
            } else if (choice == 6) {
                printHistory();
                continue; // Skip the rest of the loop and show the menu again
            } else if (choice < 1 || choice > 7) {
                System.out.println("Invalid choice. Please select a number between 1 and 7.");
                continue;
            }

            // Ask user for the two numbers
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validCalculation = true;
            String operationSign = "";

            // Call the correct function based on user choice
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    operationSign = "+";
                    break;
                case 2:
                    result = subtract(num1, num2);
                    operationSign = "-";
                    break;
                case 3:
                    result = multiply(num1, num2);
                    operationSign = "*";
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println(" Error: Division by zero is not allowed.");
                        validCalculation = false;
                    } else {
                        result = divide(num1, num2);
                        operationSign = "/";
                    }
                    break;
                case 5:
                    if (num2 == 0) {
                        System.out.println(" Error: Modulo by zero is not allowed.");
                        validCalculation = false;
                    } else {
                        result = modulo(num1, num2);
                        operationSign = "%";
                    }
                    break;
            }

            // Display result and save to history if it was a valid calculation
            if (validCalculation) {
                System.out.printf("Result: %.2f %s %.2f = %.2f\n", num1, operationSign, num2, result);
                String record = String.format("%.2f %s %.2f = %.2f", num1, operationSign, num2, result);
                history.add(record);
            }
        }
        scanner.close();
    }

    //  REQUIRED FUNCTIONS 

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }

    //  BONUS FUNCTIONS 

    public static double modulo(double a, double b) {
        return a % b;
    }

    public static void printHistory() {
        System.out.println("\n--- Calculation History ---");
        if (history.isEmpty()) {
            System.out.println("No calculations made yet.");
        } else {
            for (int i = 0; i < history.size(); i++) {
                System.out.println((i + 1) + ". " + history.get(i));
            }
        }
        System.out.println("---------------------------");
    }
}
