package core.gqt.corejava.Array;

import java.util.Scanner;

public class ArrayOperations2 {
	String arr[][];
	Scanner sc = new Scanner(System.in);

	void createArray() {
		int cls = 3; 
		int stu = 3; 
		arr = new String[cls][stu];
		System.out.println("Array for 3 classes with 3 students each created.");
		System.out.println("-------------------");
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
		System.out.println("All student names collected successfully.");
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
