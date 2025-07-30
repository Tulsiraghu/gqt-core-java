package core.gqt.corejava.Alphabets;

public class patternW {

    public static void main(String[] args) {
        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2; j++) {
                if (j == 0 || j == n * 2 - 2 ||
                    (i == j && j >= n / 2 && j <= n) ||
                    (i + j == n * 2 - 2 && j >= n)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
