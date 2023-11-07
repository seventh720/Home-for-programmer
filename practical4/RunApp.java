import java.util.Scanner;

public class RunApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("Enter the first number:");
            int num1;

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
            }

            num1 = scanner.nextInt();

            System.out.println("Enter operator (+, -, * or q to quit):");
            char operator = scanner.next().charAt(0);

            System.out.println("Enter the second number:");
            int num2;

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
            }
        
            num2 = scanner.nextInt();

            int result = 0; // init result

            switch (operator) {
                case '+':
                    result = calculator.add(num1, num2);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    break;
                case 'q':
                case 'Q':
                    return;
                default:
                    System.out.println("Invalid operator. Please try again.");
                    continue; // Continue the loop to get valid input
            }

            System.out.println("Result: " + result);
        }
    }
}