package core.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size:");
		int n = sc.nextInt();
		int count = n*n;

		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
			
			System.out.print(count+" ");
			count--;
		}
		System.out.println(" ");
		}
	}
}