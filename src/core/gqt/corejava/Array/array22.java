package core.gqt.corejava.Array;

public class array22 {
	public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        boolean isSymmetric = true;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != mat[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }
        System.out.println("Matrix is symmetric: " + isSymmetric);
    }

}
