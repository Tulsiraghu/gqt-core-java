package core.gqt.corejava.Array;

public class array20 {
	 public static void main(String[] args) {
	        int[][] mat = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        int sum = 0;
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j <= i; j++) {
	                sum += mat[i][j];
	            }
	        }
	        System.out.println("Lower triangle sum: " + sum);
	    }

}
