package core.gqt.corejava.program;

public class program22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {16,17,4,3,5,2};
		int maxRight = array[array.length-1];
		System.out.println("Length in the array:"+array[array.length-1]+"");
		for(int i = array.length-2; i>=0;i--) {
			if(array[i]>maxRight) {
				maxRight = array[i];
				System.out.println(array[i]+"");
			}
		}

	}

}
