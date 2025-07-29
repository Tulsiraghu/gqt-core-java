package core.gqt.corejava.program;

public class program35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
        String str2 = "World";

        char[] result = new char[str1.length() + str2.length()];

        for (int i = 0; i < str1.length(); i++) {
            result[i] = str1.charAt(i);
        }

        for (int i = 0; i < str2.length(); i++) {
            result[str1.length() + i] = str2.charAt(i);
        }

        String concatenatedString = new String(result);

        System.out.println("Concatenated string: " + concatenatedString);
    }
}


	

