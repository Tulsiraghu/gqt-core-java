package core.gqt.corejava.Array;

public class array25 {
	public static void main(String[] args) {
        int[] arr = {-1, 0, 5, -3, 2, 0};
        int pos = 0, neg = 0, zero = 0;
        for (int i : arr) {
            if (i > 0) pos++;
            else if (i < 0) neg++;
            else zero++;
        }
        System.out.println("Positive: " + pos + ", Negative: " + neg + ", Zeros: " + zero);
    }

}
