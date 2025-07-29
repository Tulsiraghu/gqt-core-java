package core.gqt.corejava.program;

public class program27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "brother";
		boolean isPalindrome = true;
		for (int i =0, j=str.length()-1;i<j;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)){
				isPalindrome = false;
				break;
				
				
			}
		}
		if(isPalindrome) {
			System.out.println(str+" is a palindrome:");
			
		}else {
			System.out.println(str+" is not palindrome");
		}

	}

}
