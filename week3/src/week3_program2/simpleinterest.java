package week3_program2;
import java.util.Scanner;
public class simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Principal: ");
            double p = sc.nextDouble();
            System.out.print("Time (years): ");
            double t = sc.nextDouble();
            System.out.print("Rate (% per year): ");
            double r = sc.nextDouble();

            double si = p * r * t / 100;
            System.out.printf("Simple Interest = %.2f%n", si);
        }

	}

}
