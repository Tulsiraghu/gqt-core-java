package core.gqt.corejava.Array;

import java.util.Arrays;

public class array06 {
	 public static void main(String[] args) {
	        int[] arr = {3, 1, 4, 2};
	        Arrays.sort(arr);
	        System.out.print("Ascending: ");
	        for (int num : arr) System.out.print(num + " ");
	        System.out.println();
	        System.out.print("Descending: ");
	        for (int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i] + " ");
	    }

}
