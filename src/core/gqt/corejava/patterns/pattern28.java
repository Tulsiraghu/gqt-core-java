package core.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Lower part (2 to 5)
        for (int i = 2; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}