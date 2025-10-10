package week4;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.print(a + (i < 10 ? " " : ""));
            int next = a + b;
            a = b;
            b = next;

	}

}
}
