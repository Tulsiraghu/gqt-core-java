package core.gqt.corejava.program;

public class program20 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		System.out.println("even number:");
		for(int value : array) {
			if(value % 2 ==0) {
				System.out.println(value+"");
			}
		}
		System.out.println("\nOdd number:");
		for (int value:array) {
			if(value%2!=0) {
				System.out.println(value+"");
				
			}
		}
	}
}
