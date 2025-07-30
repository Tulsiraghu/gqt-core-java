package core.gqt.corejava.Alphabets;

public class patternB {

    public static void main(String[] args) {
        int n = 7; // Height of the pattern

        for (int i = 0; i < n; i++) { // rows
            for (int j = 0; j < n; j++) { // columns
                if (j == 0 ||                                // left vertical line
                    (i == 0 && j < n - 1) ||                 // top horizontal line
                    (i == n / 2 && j < n - 1) ||             // middle horizontal line
                    (i == n - 1 && j < n - 1) ||             // bottom horizontal line
                    (j == n - 1 && i != 0 && i != n / 2 && i != n - 1)) { // right curves
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
