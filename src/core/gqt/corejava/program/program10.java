package core.gqt.corejava.program;


public class program10 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int n=2; //number of positions to shift
		for (int i = 0; i<n; i++) {
			int last = array[array.length-1];
			for (int j = array.length - 1; j>0; j--) {
				array[j] = array[j-1];
			}
			array[0]=last;
			}
		System.out.println("Array after shifting to the right:");
		for (int value : array) {
			System.out.println(value+"");
			
			
		}
		}

}
