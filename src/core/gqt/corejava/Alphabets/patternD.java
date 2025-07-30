package core.gqt.corejava.Alphabets;

public class patternD {

    public static void main(String[] args) {
        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 ||                              // left line
                    (i == 0 && j < n - 1) ||               // top line
                    (i == n - 1 && j < n - 1) ||           // bottom line
                    (j == n - 1 && i != 0 && i != n - 1))  // right curve
                {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
