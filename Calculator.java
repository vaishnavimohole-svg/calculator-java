import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2, result;
        int choice;

        System.out.println("===== JAVA CALCULATOR =====");

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        switch(choice) {

            case 1:
                result = num1 + num2;
                System.out.println("Addition = " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("Subtraction = " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("Multiplication = " + result);
                break;

            case 4:
                if(num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division = " + result);
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}