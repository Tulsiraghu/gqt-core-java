package core.gqt.corejava.Alphabets;

public class patternC {

    public static void main(String[] args) {
        int n = 7; // Height of the pattern

        for (int i = 0; i < n; i++) { // rows
            for (int j = 0; j < n; j++) { // columns
                if (i == 0 ||                      // top horizontal line
                    i == n - 1 ||                  // bottom horizontal line
                    j == 0) {                      // left vertical line
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
