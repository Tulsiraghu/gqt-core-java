package core.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("-");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
