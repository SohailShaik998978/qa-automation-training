package week5;
import java.util.Scanner;

public class factorial {
	static long factorial(int n) {
        long result = 1;                 // 0! and 1! are 1
        for (int i = 2; i <= n; i++) {   // multiply 2 * 3 * ... * n
            result *= i;
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        long ans = factorial(n);         // calling the method
        System.out.println(n + "! = " + ans);

	}

}
