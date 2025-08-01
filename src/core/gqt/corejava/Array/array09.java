package core.gqt.corejava.Array;

import java.util.HashSet;
import java.util.Set;

public class array09 {
	 public static void main(String[] args) {
	        int[] a = {1, 2, 3};
	        int[] b = {2, 3, 4};
	        Set<Integer> set = new HashSet<>();
	        for (int num : a) set.add(num);
	        for (int num : b) {
	            if (set.contains(num)) System.out.print(num + " ");
	        }
	    }

}
