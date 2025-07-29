package core.gqt.corejava.staticsegment;
import java.util.Scanner;
public class Scannerclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the byte data:");
		byte b = sc.nextByte();
		System.out.println("Byte data+"+b);
		System.out.println("---------------");
		System.out.println("Enter the Short data:");
		short s = sc.nextShort();
		System.out.println("Short data+"+s);
		System.out.println("---------------");
		System.out.println("Enter the Integerdata:");
		int i = sc.nextInt();
		System.out.println("Int data+"+i);
		System.out.println("---------------");
		System.out.println("Enter the Long data:");
		long l = sc.nextLong();
		System.out.println("Long data+"+l);
		System.out.println("---------------");
		System.out.println("Enter the Float data:");
		float f = sc.nextFloat();
		System.out.println("Float data+"+f);
		System.out.println("---------------");
		System.out.println("Enter the double data:");
		double d= sc.nextDouble();
		System.out.println("Double data+"+d);
		System.out.println("---------------");
		System.out.println("Enter the String data:");
		sc.nextLine();
		String str = sc.nextLine();
		System.out.println("String data+"+str);
		System.out.println("---------------");
		sc.close();
		
	}

}
