package core.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		 for (int i = 1; i <= n; i++) {
	            // Print leading spaces
	            for (int j = i; j < n; j++) {
	                System.out.print("  "); // Two spaces to align with number + space
	            }
	            // Print increasing numbers
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            // Print decreasing numbers
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	    }
	}
