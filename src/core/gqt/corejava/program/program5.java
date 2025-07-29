package core.gqt.corejava.program;

public class program5 {

	public static void main(String[] args) {
		int[] array = {5,2,8,1,6};
		int min = array[0];
		for (int i = 1; i<array.length;i++) {
			if(array[i]>min) {
				min = array[i];
			}
			
		}
		System.out.println("Minimum of element in the array:"+min);
		
	}

}
