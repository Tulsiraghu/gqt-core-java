package core.gqt.corejava.Array;
import java.util.Scanner;

public class ArrayOperations1 {
	String arr[][];
	Scanner sc = new Scanner(System.in);

	void createArray() {
		System.out.println("Enter the Student Count:");
		int cls = sc.nextInt();
		System.out.println("Enter the Student Count in each class:");
		int stu = sc.nextInt();

		// creating the array to store n student marks
		arr = new String[cls][stu];
		System.out.println("array created");
		System.out.println("----------------");
	}

	void collectData() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside class no:" + (i + 1));
			for (int j = 0; j < arr[i].length; j++) { 
				System.out.println("Enter the Student name for student no:" + (j + 1));
				arr[i][j] = sc.next();
			}
		}
		System.out.println("Data collected.");
	}

	void dispalyData() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside class no:" + (i + 1));
			for (int j = 0; j < arr[i].length; j++) { 
				System.out.println("Student " + (j + 1) + ": " + arr[i][j]);
			}
			System.out.println("------------");
		}
	}

	public static void main(String[] args) {
		ArrayOperations1 ao = new ArrayOperations1();
		ao.createArray();
		ao.collectData();
		ao.dispalyData();
	}
}
