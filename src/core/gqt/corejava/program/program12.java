package core.gqt.corejava.program;


public class program12 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int n= 2;
		int length = array.length;
		for(int i = 0; i<n; i++) {
			int first = array[0];
			
			for(int j = 0; j<length-1;j++) {
				array[j] = array[j+1];
			}
			array[length - 1] = first;
			
			
		}
		System.out.println("Array after ritating to the left:");
		for (int value : array) {
			System.out.println(value+"");
		}
	}

}
