package core.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		 for (int i = 1; i <= 2 * n - 1; i++) {
	            int num = (i <= n) ? i : 2 * n - i;

	            // Print leading spaces
	            for (int j = 1; j <= n - num; j++)
	                System.out.print(" ");

	            // Print first digit
	            System.out.print(num);

	            // Print inner spaces and second digit if not first or last line
	            if (num != 1) {
	                for (int j = 1; j <= (num - 1) * 2 - 1; j++)
	                    System.out.print(" ");
	                System.out.print(num);
	            }
	            System.out.println();
	        }
	    }
	}
