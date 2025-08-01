package core.gqt.corejava.Array;

public class array02 {
	 public static void main(String[] args) {
	        int[] arr = {5, 2, 9, 1, 7};
	        int min = arr[0], max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) min = arr[i];
	            if (arr[i] > max) max = arr[i];
	        }
	        System.out.println("Min: " + min);
	        System.out.println("Max: " + max);
	    }
	}

	
