package core.gqt.corejava.Array;

import java.util.Scanner;

public class ArrayOperations2 {
	String arr[][];
	Scanner sc = new Scanner(System.in);

	void createArray() {
		System.out.println("Enter class count.");
		int cls = sc.nextInt(); 
		arr = new String[cls][];
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Enter count of student inside the class no:"+(i+1));
			arr[i] = new String[sc.nextInt()];
		}
		System.out.println("Array is created");
		System.out.println("----------------");
	}
		
				
	void collectData() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside Class " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Enter name for Student " + (j + 1) + ": ");
				arr[i][j] = sc.next();
			}
			System.out.println("----------------");
		}
		System.out.println("Data Created.");
		System.out.println("--------------------");
	}

	void displayData() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Class " + (i + 1) + " Student Names:");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Student " + (j + 1) + ": " + arr[i][j]);
			}
			System.out.println("---------------------");
		}
	}

	public static void main(String[] args) {
		ArrayOperations2 ao = new ArrayOperations2();
		ao.createArray();     
		ao.collectData();     
		ao.displayData();     
	}
}
