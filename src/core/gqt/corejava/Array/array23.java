package core.gqt.corejava.Array;

public class array23 {
	public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < 3; i++) {
            int minRow = mat[i][0], colIdx = 0;
            for (int j = 1; j < 3; j++) {
                if (mat[i][j] < minRow) {
                    minRow = mat[i][j];
                    colIdx = j;
                }
            }
            boolean isSaddle = true;
            for (int k = 0; k < 3; k++) {
                if (mat[k][colIdx] > minRow) {
                    isSaddle = false;
                    break;
                }
            }
            if (isSaddle) {
                System.out.println("Saddle point: " + minRow);
                return;
            }
        }
        System.out.println("No saddle point found.");
    }

}
