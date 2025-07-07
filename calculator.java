import java.util.Scanner;

public class calculator {

    // Main method to run the calculator
    public static void main(String[] args) {
        // Create an instance of the Calculation class
        Calculation calculator = new Calculation();

        // Using try-with-resources to ensure the scanner is closed automatically
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Choose a task:");
            System.out.println("1. Basic Arithmetic Calculation");
            System.out.println("2. Area of Square");
            System.out.println("3. Area of Rectangle");
            System.out.print("Enter your choice : ");
            int task = sc.nextInt();

            switch (task) {
                case 1 -> {
                    System.out.print("Enter first number: ");
                    double num1 = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    double num2 = sc.nextDouble();

                    System.out.print("Choose an operation (+, -, *, /, %): ");
                    char operation = sc.next().charAt(0);

                    calculator.basic(num1, num2, operation);
                }
                case 2 -> {
                    System.out.print("Enter the side of the square: ");
                    double side = sc.nextDouble();

                    calculator.areaOfSquare(side);
                }
                case 3 -> {
                    System.out.println("Enter width of the rectangle : ");
                    double width = sc.nextDouble();

                    System.out.println("Enter height of the rectangle : ");
                    double height = sc.nextDouble();

                    calculator.areaOfRectangle(width, height);
                }
                default ->
                    System.out.println("Invalid operation selected. Please try again.");
            }

            // Close the scanner to prevent resource leaks
            System.out.println("Thank you for using the calculator!");
        }
    }
}
