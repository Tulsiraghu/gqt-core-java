package core.gqt.corejava.Array;

public class array03 {
	 public static void main(String[] args) {
	        int[] src = {1, 2, 3, 4};
	        int[] dest = new int[src.length];
	        for (int i = 0; i < src.length; i++) {
	            dest[i] = src[i];
	        }
	        System.out.print("Copied Array: ");
	        for (int num : dest) {
	            System.out.print(num + " ");
	        }
	    }
	}

	