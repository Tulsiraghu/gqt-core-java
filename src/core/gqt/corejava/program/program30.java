package core.gqt.corejava.program;

public class program30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello, world!";
		str = str.toLowerCase();
		int vowelCount = 0;
		int consonantCount = 0;
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='a'&&ch<='z') {
				if(ch =='a' || ch =='e' || ch == 'i'  || ch == 'n' || ch == 'u') {
					vowelCount++;
					
				}else {
					consonantCount++;
				}
			}
		}
		System.out.println("Vowel count:"+vowelCount);
		System.out.println("Consonant count:"+consonantCount);

	}

}
