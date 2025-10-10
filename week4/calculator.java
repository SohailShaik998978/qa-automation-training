package week4;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("First number: ");
        double a = sc.nextDouble();

        System.out.print("Operator (+ - * / %): ");
        char op = sc.next().charAt(0);

        System.out.print("Second number: ");
        double b = sc.nextDouble();

        switch (op) {
            case '+': System.out.println("Result: " + (a + b)); break;
            case '-': System.out.println("Result: " + (a - b)); break;
            case '*': System.out.println("Result: " + (a * b)); break;
            case '/':
                if (b == 0) System.out.println("Error: divide by zero");
                else System.out.println("Result: " + (a / b));
                break;
            case '%':
                if (b == 0) System.out.println("Error: modulo by zero");
                else System.out.println("Result: " + (a % b));
                break;
            default: System.out.println("Invalid operator");
        }

        sc.close();

	}

}
