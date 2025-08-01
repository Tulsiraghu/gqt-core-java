package core.gqt.corejava.Array;

public class array15 {
	public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int key = 30;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        System.out.println("Index of " + key + ": " + index);
    }

}
