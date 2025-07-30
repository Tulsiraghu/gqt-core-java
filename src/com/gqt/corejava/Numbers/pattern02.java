package com.gqt.corejava.Numbers;

import java.util.Scanner;

public class pattern02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (
					i == 0 ||                         // Top line
					i == n - 1 ||                     // Bottom line
					i == n / 2 ||                     // Middle line
					(j == n - 1 && i < n / 2) ||      // Top right vertical
					(j == 0 && i > n / 2)             // Bottom left vertical
				) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
