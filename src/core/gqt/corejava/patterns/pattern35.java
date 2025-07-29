package core.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		for (int i = 0; i < 5; i++) {
		    for (int j = i; j < 4; j++) {
		        System.out.print(" ");
		    }
		    for (char ch1 = (char) ('A' + i); ch1 >= 'A'; ch1--) {
		        System.out.print(ch1);
		    }
		    for (char ch2 = 'B'; ch2 <= (char) ('A' + i); ch2++) {
		        System.out.print(ch2);
		    }
		    System.out.println();
		}
	}
}
		