package week5;
import java.util.Arrays;
import java.util.Scanner;

public class reversearray {
	static void reverseInPlace(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Read size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Read elements
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.println("Original: " + Arrays.toString(a));

        // Reverse using the method
        reverseInPlace(a);

        System.out.println("Reversed: " + Arrays.toString(a));
    }
}
