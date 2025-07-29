package core.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		int rows = 3;
		 for (int i = 1; i <= n; i++) {
	            // Print leading spaces for center alignment
	            for (int space = i; space < n; space++) {
	                System.out.print(" ");
	            }

	            // Print increasing characters from A to current row
	            for (char ch = 'A'; ch < 'A' + i; ch++) {
	                System.out.print(ch);
	            }

	            // Print from A to one less than current row
	            for (char ch = 'A'; ch < 'A' + i - 1; ch++) {
	                System.out.print(ch);
	            }

	            System.out.println();
	        }
	    }
	}