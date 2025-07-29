package core.gqt.corejava.program;


public class program15 {

	public static void main(String[] args) {
		int [] array = {5,2,8,1,6};
		int n = array.length;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n-1-i;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("sorted array using bubble sort:");
		for (int value : array) {
			System.out.println(value+"");
		}
	}
}
			
	
