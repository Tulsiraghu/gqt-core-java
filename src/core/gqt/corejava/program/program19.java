package core.gqt.corejava.program;
import java.util.Arrays;
public class program19 {

	public static void main(String[] args) {
		int[] array = {5,2,8,1,6};
		Arrays.sort(array);
		if(array.length<3) {
			System.out.println("Array doesnot have a third samallest element.");
		
		}else {
			System.out.println("third smallest elemt in the array:"+array[2]);
			
		}
	}

}
