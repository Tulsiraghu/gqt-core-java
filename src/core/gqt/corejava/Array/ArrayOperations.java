package core.gqt.corejava.Array;
import java.util.Scanner;

public class ArrayOperations {
	int arr[];
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("Enter the Student Count:");
		int n = sc.nextInt();
		//creating the array to store n student marks
		arr = new int[n];
		System.out.println("array created");
		System.out.println("----------------");
		
	}
	void collectData() {
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println("Enter marks of student number:"+(i+1));
			arr[i] = sc.nextInt();
			
		}
		System.out.println("Dtat stored into array");
	}
void dispalyData() {
	for(int i = 0; i<arr.length; i++)
	{
		System.out.println("The marks of student number:"+(i+1)+" is = "+arr[i]);
	}
}
	public static void main(String[] args) {
		ArrayOperations ao = new ArrayOperations();
		ao .createArray();
		ao .collectData();
		ao .dispalyData();
		
		
	}
}
