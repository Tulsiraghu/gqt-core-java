package core.gqt.corejava.Array;
import java.util.Scanner;

public class Unstructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Count:");
		int n = sc.nextInt();
		//creating the array to store n student marks
		int arr[] = new int[n];
		//collecting the string marks of n students
		for (int i = 0; i<arr.length; i++)
		{
			System.out.println("enter the marks of student number:"+(i+1));
			arr[i] = sc.nextInt();
		}
		System.out.println("--------------");
		//Display marks stored inside the array
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println("The marks of student number:"+(i+1)+" is = "+arr[i]);
		}
		

	}

}
