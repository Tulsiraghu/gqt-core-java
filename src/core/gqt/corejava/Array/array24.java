package core.gqt.corejava.Array;

import java.util.Arrays;

public class array24 {
	public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        Arrays.sort(arr);
        System.out.println("Kth smallest: " + arr[k-1]);
        System.out.println("Kth largest: " + arr[arr.length - k]);
    }

}
