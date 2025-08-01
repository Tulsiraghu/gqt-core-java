package core.gqt.corejava.Array;

public class array05 {
	public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.print("Reversed: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

