import java.text.DecimalFormat;

public class Calculation {

    // Method to perform basic arithmetic operations
    public void basic(double num1, double num2, char operation) {
        double result;
        DecimalFormat df = new DecimalFormat("#.##");

        switch (operation) {
            case '+' -> {
                result = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " : " + df.format(result));
            }
            case '-' -> {
                result = num1 - num2;
                System.out.println("The difference of " + num1 + " and " + num2 + " : " + df.format(result));
            }
            case '*' -> {
                result = num1 * num2;
                System.out.println("The product of " + num1 + " and " + num2 + " : " + df.format(result));
            }
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The division of " + num1 + " and " + num2 + " : " + df.format(result));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            }
            case '%' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The reminder of " + num1 + " and " + num2 + " : " + df.format(result));
                } else {
                    System.out.println("Error: Reminder by zero is not allowed.");
                }
            }
            default ->
                System.out.println("Error: Invalid operation.");
        }
    }

    public void areaOfSquare(double side) {
        double area = side * side;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("The area of square : " + df.format(area));
    }

    public void areaOfRectangle(double width, double height){
        double area = width * height;
        DecimalFormat dc = new DecimalFormat("#.##");
        System.out.println("The area of rectangle : " + dc.format(area));
    }
}
