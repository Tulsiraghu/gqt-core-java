package core.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = 1;
		System.out.println("enter the size:");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
			
			System.out.print(k+" ");
			k++;
		}
		System.out.println(" ");
		}
	}
}
		