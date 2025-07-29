package core.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int space = i; space < n; space++) {
                System.out.print(" ");
            }

            // Print stars with a space
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}