package core.gqt.corejava.program;


public class Program1 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int sum = 0;
		for(int i = 0;i<array.length;i++) {
			sum +=array[i];
		}
		System.out.println("Sum of elements in the array:"+sum);
		}

	}


