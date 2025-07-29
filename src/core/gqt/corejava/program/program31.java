package core.gqt.corejava.program;

public class program31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "this is a sample sentence";

        String[] words = sentence.split("\\s");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
        	result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append("");
             
            }
        

        System.out.println("Original sentence:"+sentence);
        System.out.println("Modified sentence:"+result.toString().trim());

        
    }
}


