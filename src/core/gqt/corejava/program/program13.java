package core.gqt.corejava.program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class program13 {

	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {4,5,6,7,8};
		
		Set<Integer>set1 = new HashSet<>();
		for (int value :  array1) {
			set1.add(value);
		}
		Set<Integer>intersectionSet = new HashSet<>();
		for(int Value :array2) {
			if(set1.contains(Value)) {
				intersectionSet.add(Value);
				
			}
		}
		int[] intersectionArray = new int[intersectionSet.size()];
		int index = 0;
		for (int value : intersectionSet) {
			intersectionArray[index++]=value;
		}
		System.out.println("Intersection of array:"+Arrays.toString(intersectionArray));
	}

}
