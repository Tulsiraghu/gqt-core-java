package com.gqt.corejava.Numbers;

import java.util.Scanner;

public class Pattern0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (
					i == 0 ||                    // Top border
					i == n - 1 ||                // Bottom border
					j == 0 ||                    // Left border
					j == n - 1                   // Right border
				) {
					System.out.print("# ");
				} 
				else if (i == j && i != 0 && i != n - 1) { // Diagonal for style
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
