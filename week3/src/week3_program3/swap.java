package week3_program3;
import java.util.Scanner;
public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter two integers (a b): ");
            long a = sc.nextLong(), b = sc.nextLong(); // use long to reduce overflow risk

            a = a + b; // sum in a
            b = a - b; // now b becomes original a
            a = a - b; // now a becomes original b

            System.out.println("After swap: a = " + a + ", b = " + b);
        }

	}

}
