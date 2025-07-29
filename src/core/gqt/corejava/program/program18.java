package core.gqt.corejava.program;
import java.util.HashSet;
import java.util.Set;
public class program18 {

	public static void main(String[] args) {
		int[] array = {1,2,3,2,4,5};
		Set<Integer>uniqueSet = new HashSet<>();
		boolean containsDuplicates = false;
		for(int value : array) {
			if(!uniqueSet.add(value)) {
				containsDuplicates = true;
				break;
				
			}
		}
		if(containsDuplicates) {
			System.out.println("The array contains duplicate element:");
		}else {
			System.out.println("the array does not contains duplicates element:");
			
		}
		
		
	}

}
