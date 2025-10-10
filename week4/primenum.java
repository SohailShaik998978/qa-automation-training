package week4;
import java.util.Scanner;

public class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 1) {
            System.out.println(n + " is not prime");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) {   // check divisors up to sqrt(n)
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) System.out.println(n + " is prime");
        else         System.out.println(n + " is not prime");

	}

}
