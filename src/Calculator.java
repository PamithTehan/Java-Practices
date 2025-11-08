import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1, num2, result =0;
        char operation;
        boolean validOperation = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        num2 = sc.nextDouble();
        System.out.println("Operation(+,-,*,/,^): ");
        operation = sc.next().charAt(0);

        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0) {
                    System.out.println("number 2 is zero.");
                    validOperation = false;
                }
                else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid Operation!");
                validOperation = false;
            }
        }

       if(validOperation) {
           System.out.println("Result : " + result);
       }

        sc.close();
    }
}
