package week6;
import java.util.Arrays;

public class obj {
	String name;
    int[] marks; // each subject out of 100

    obj(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double percentage() {
        int sum = 0;
        for (int m : marks) sum += m;
        return marks.length == 0 ? 0.0 : (sum * 100.0) / (marks.length * 100);
    }

    String details() {
        return "Name: " + name +
               ", Marks: " + Arrays.toString(marks) +
               String.format(", Percentage: %.2f%%", percentage());
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obj o1 = new obj("Alice", new int[]{85, 90, 78});
        obj o2 = new obj("Bob",   new int[]{70, 88, 92, 81});
        obj o3 = new obj("Cara",  new int[]{100, 95});

        System.out.println(o1.details());
        System.out.println(o2.details());
        System.out.println(o3.details());

	}

}
