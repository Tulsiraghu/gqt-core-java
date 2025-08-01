package core.gqt.corejava.Array;

import java.util.LinkedHashSet;
import java.util.Set;

public class array04 {
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 2, 3, 4, 4};
	        Set<Integer> set = new LinkedHashSet<>();
	        for (int num : arr) {
	            set.add(num);
	        }
	        System.out.println("After removing duplicates: " + set);
	    }
	}


