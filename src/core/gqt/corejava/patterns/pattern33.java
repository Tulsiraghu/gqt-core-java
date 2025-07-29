package core.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		int k = 0;
		for (int i = 1; i <= n; i++) {
		    for (int j = i; j < n; j++) {
		        System.out.print("  ");
		    }
		    k += i;
		    char ch1 = (char) ('A' + k - 1);
		    for (int j = 1; j <= 2 * i - 1; j++) {
		        System.out.print(ch1-- + " ");
		    }
		    System.out.println();
		}
	}
}