package JavaDevelopment;
import java.util.Scanner;

public class EnhancedConsolebasedCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Enhanced Console Calculator ---");
            System.out.println("1. Basic Arithmetic");
            System.out.println("2. Scientific Calculations");
            System.out.println("3. Unit Conversions");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> basicArithmetic(sc);
                case 2 -> scientificCalculations(sc);
                case 3 -> unitConversions(sc);
                case 4 -> System.out.println("Exiting calculator. Goodbye!");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
    static void basicArithmetic(Scanner sc) {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Choose operation: + - * /");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+' -> System.out.println("Result: " + (a + b));
            case '-' -> System.out.println("Result: " + (a - b));
            case '*' -> System.out.println("Result: " + (a * b));
            case '/' -> {
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Error: Division by zero");
            }
            default -> System.out.println("Invalid operation.");
        }
    }
    static void scientificCalculations(Scanner sc) {
        System.out.println("1. Square Root");
        System.out.println("2. Exponentiation (x^y)");
        System.out.print("Choose operation: ");
        int op = sc.nextInt();

        switch (op) {
            case 1 -> {
                System.out.print("Enter number: ");
                double num = sc.nextDouble();
                if (num >= 0)
                    System.out.println("Square root: " + Math.sqrt(num));
                else
                    System.out.println("Error: Negative input");
            }
            case 2 -> {
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter exponent: ");
                double exp = sc.nextDouble();
                System.out.println("Result: " + Math.pow(base, exp));
            }
            default -> System.out.println("Invalid choice.");
        }
    }
    static void unitConversions(Scanner sc) {
        System.out.println("1. Temperature (Celsius <-> Fahrenheit)");
        System.out.println("2. Currency (INR <-> USD)");
        System.out.print("Choose conversion: ");
        int op = sc.nextInt();

        switch (op) {
            case 1 -> {
                System.out.println("1. Celsius to Fahrenheit");
                System.out.println("2. Fahrenheit to Celsius");
                int tempChoice = sc.nextInt();
                System.out.print("Enter temperature: ");
                double temp = sc.nextDouble();

                if (tempChoice == 1)
                    System.out.println("Fahrenheit: " + ((temp * 9 / 5) + 32));
                else if (tempChoice == 2)
                    System.out.println("Celsius: " + ((temp - 32) * 5 / 9));
                else
                    System.out.println("Invalid choice.");
            }
            case 2 -> {
                System.out.println("1. INR to USD");
                System.out.println("2. USD to INR");
                int currChoice = sc.nextInt();
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                double rate = 83.0; 

                if (currChoice == 1)
                    System.out.println("USD: " + (amount / rate));
                else if (currChoice == 2)
                    System.out.println("INR: " + (amount * rate));
                else
                    System.out.println("Invalid choice.");
            }
            default -> System.out.println("Invalid conversion type.");
        }
    }
}