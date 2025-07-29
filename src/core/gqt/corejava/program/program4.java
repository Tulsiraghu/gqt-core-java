package core.gqt.corejava.program;

public class program4 {

	public static void main(String[] args) {
		int[] array = {5,2,8,1,6};
		int max = array[0];
		for (int i = 1; i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];
			}
			
		}
		System.out.println("Maximum of element in the array:"+max);
		
	}

}
