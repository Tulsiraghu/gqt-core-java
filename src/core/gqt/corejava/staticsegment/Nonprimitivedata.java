package core.gqt.corejava.staticsegment;
import java.util.Scanner;
public class Nonprimitivedata {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the byte data:");
		Byte b = new Byte(sc.nextByte());
		System.out.println("Enter the byte data:"+b);
		System.out.println("--------------------");
		System.out.println("Enter the short data:");
		Short s = new Short(sc.nextShort());
		System.out.println("Enter the short data:"+s);
		System.out.println("--------------------");
		System.out.println("Enter the integer data:");
		Integer i = new Integer(sc.nextInt());
		System.out.println("The Integer data:"+i);
		System.out.println("---------------------");
		System.out.println("Enter the long data:");
		Long l = new Long(sc.nextLong());
		System.out.println("The Long data:"+l);
		System.out.println("-----------------");
		System.out.println("Enter the float data");
		Float f = new Float(sc.nextFloat());
		System.out.println("The Float data:"+f);
		System.out.println("----------------------");
		System.out.println("Enter the Double data:");
		Double d = new Double(sc.nextDouble());
		System.out.println("The Double data:"+d);
		System.out.println("---------------------");
		System.out.println("Enter the string:");
		String str = new String(sc.nextLine());
		System.out.println("The String data:"+str);
		System.out.println("-------------------");
		Character c = new Character('a');
		System.out.println("Character data="+c);
		System.out.println("-----------------");
		Boolean b1 = new Boolean(true);
		System.out.println("boolean data+"+b1);
		sc.close();
		
		
		
		
		

	}

}
