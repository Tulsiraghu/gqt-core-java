package core.gqt.corejava.program;

public class program21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
		};
		int sum = 0;
		for (int i = 0; i<matrix.length;i++) {
			sum += matrix[i][i];
		
		}
		System.out.println("Sum of diagonal elements in the 2D array:"+sum);
		

	}

}

