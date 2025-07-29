package core.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		 int n = sc.nextInt();

	        // Upper half
	        for (int i = 1; i <= n; i++) {
	            // spaces
	            for (int j = i; j < n; j++) {
	                System.out.print("  ");
	            }
	            // ascending
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            // descending
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }

	        // Lower half
	        for (int i = n - 1; i >= 1; i--) {
	            // spaces
	            for (int j = n; j > i; j--) {
	                System.out.print("  ");
	            }
	            // ascending
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            // descending
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	    }
	}