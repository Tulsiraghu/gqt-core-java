package core.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		for (int i = 0; i < 5; i++) {
		    for (int j = i; j < 4; j++) {
		        System.out.print(" ");
		    }
		    for (int j = i; j >= 0; j--) {
		        System.out.print(j);
		    }
		    for (int j = 1; j <= i; j++) {
		        System.out.print(j);
		    }
		    System.out.println();
		}
	}
}