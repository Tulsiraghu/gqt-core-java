package core.gqt.corejava.Array;

public class array21 {
	public static void main(String[] args) {
        int[][] mat = {
            {1, 2},
            {3, 4}
        };
        for (int i = 0; i < 2; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < 2; j++) {
                rowSum += mat[i][j];
                colSum += mat[j][i];
            }
            System.out.println("Row " + i + " sum: " + rowSum);
            System.out.println("Column " + i + " sum: " + colSum);
        }
    }

}
