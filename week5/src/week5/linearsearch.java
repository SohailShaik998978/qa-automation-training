package week5;

import java.util.Scanner;
import java.util.Arrays;

public class linearsearch {
	static int indexOf(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {   
            if (arr[i] == target) return i;      
        }
        return -1;                               
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter value to search: ");
        int target = sc.nextInt();

        System.out.println("Array: " + Arrays.toString(a));

        int pos = indexOf(a, target);

        if (pos == -1) {
            System.out.println(target + " not found");
        } else {
            System.out.println(target + " found at index " + pos);
        }

	}

}
