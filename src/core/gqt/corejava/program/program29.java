package core.gqt.corejava.program;
import java.util.Arrays;

public class program29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "listen";
		String str2 = "silent";
		char[]charArray1 = str1.toCharArray();
		char[]charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		boolean areAnagrams = Arrays.equals(charArray1,charArray2);
		if(areAnagrams) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
			
		}else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");

			
		}
	}

}
