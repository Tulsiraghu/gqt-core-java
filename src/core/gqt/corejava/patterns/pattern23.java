package core.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            // Print numbers
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}