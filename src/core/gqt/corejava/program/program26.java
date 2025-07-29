package core.gqt.corejava.program;

public class program26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "Hello,world!";
		StringBuilder reversed = new StringBuilder();
		for (int i = original.length()-1;i>=0;i--) {
			reversed.append(original.charAt(i));
			
		}
		System.out.println("Original:"+original);
		System.out.println("Reversed:"+reversed);

	}

}
