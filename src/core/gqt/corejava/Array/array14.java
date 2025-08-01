package core.gqt.corejava.Array;

import java.util.Arrays;

public class array14 {
	 public static void main(String[] args) {
	        int[] arr = {5, 1, 3, 4, 2};
	        Arrays.sort(arr);
	        System.out.println("Second smallest: " + arr[1]);
	        System.out.println("Second largest: " + arr[arr.length - 2]);
	    }

}
