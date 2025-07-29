package core.gqt.corejava.program;


public class program9 {

	public static void main(String[] args) {
		int[] array = {5,2,8,1,6};
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int value : array) {
			if(value>firstMax) {
				secondMax = firstMax;
				firstMax = value;
			} else if(value>secondMax && value!= firstMax) {
				secondMax = value;
			
		}
	}
System.out.println("Second largest element in the array:"+secondMax);
}
}
