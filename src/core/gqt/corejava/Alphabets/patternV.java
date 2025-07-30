package core.gqt.corejava.Alphabets;

public class patternV {

    public static void main(String[] args) {
        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j == i && i < n - 1 || j == 2 * n - i - 2 && i < n - 1 ||
                    i == n - 1 && j == n - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
