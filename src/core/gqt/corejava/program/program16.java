package core.gqt.corejava.program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class program16 {


	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {4,5,6,7,8};
		
		Set<Integer>unionSet = new HashSet<>();
		for (int value :  array1) {
			unionSet.add(value);
			
		}
		for (int value :  array2) {
			unionSet.add(value);
		}
		int[] unionArray = new int[unionSet.size()];
		int index = 0;
		for(int value : unionSet) {
			unionArray[index++]=value;
		}
		System.out.println("Union of array:"+Arrays.toString(unionArray));
		
		
		
		}
	}


