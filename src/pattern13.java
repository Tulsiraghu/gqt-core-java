
import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size");
		int n = scanner.nextInt();
		int count;
		for(int i = 1; i <= n; i++) {
			count = i;
			for(int j = i; j <= i+20; j=j+5) {
			
			System.out.print(j+" ");	
			count = count+n;
		}
		System.out.println(" ");
		}
	}
}
		
