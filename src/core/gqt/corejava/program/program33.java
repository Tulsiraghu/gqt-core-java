package core.gqt.corejava.program;

public class program33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1234";

        if (str.matches("\\d+")) {
            System.out.println(str + "contains only digits.");
        } else {
            System.out.println(str + "does not contain only didgits.");
        }
	}
}