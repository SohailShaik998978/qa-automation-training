package week6;
import java.util.*;

public class student {
	String name;
    int[] marks; // each out of 100

    student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double percentage() {
        int sum = 0;
        for (int m : marks) sum += m;
        return marks.length == 0 ? 0.0 : (sum * 100.0) / (marks.length * 100);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        student s = new student(name, marks);
        System.out.printf("Percentage for %s: %.2f%%%n", s.name, s.percentage());

	}

}
