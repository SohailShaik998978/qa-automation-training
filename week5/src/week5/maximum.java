package week5;
import java.util.Scanner;

public class maximum {
	static int maxOf3(int a, int b, int c) {
        int max = a;              // assume a is max
        if (b > max) max = b;     // compare with b
        if (c > max) max = c;     // compare with c
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int result = maxOf3(a, b, c);    // calling the method
        System.out.println("Maximum = " + result);

	}

}
