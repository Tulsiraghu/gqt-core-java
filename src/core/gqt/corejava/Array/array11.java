package core.gqt.corejava.Array;

public class array11 {
	public static void main(String[] args) {
        int[] arr = {3, -1, 4, -5, 6};
        int sum = 0;
        for (int num : arr) {
            if (num > 0) sum += num;
        }
        System.out.println("Sum of positive numbers: " + sum);
    }

}
