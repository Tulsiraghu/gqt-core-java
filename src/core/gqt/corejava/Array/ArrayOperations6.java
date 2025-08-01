package core.gqt.corejava.Array;
import java.util.Scanner;

class ArrayOperations6 {
	public static void main(String args[]) {
		allocateclg al=new allocateclg();
		al.createArray();
		al.collectData();
		al.display();
	}
}

class allocateclg{
	String a[][][];
	Scanner sc=new Scanner(System.in);
	void createArray() {
		System.out.print("Enter no.of clg: ");
		int clg=sc.nextInt();
		a=new String[clg][][];
		for(int i=0;i<a.length;i++) {
			System.out.println("Count of classes in clg"+(i+1));
			a[i]=new String[sc.nextInt()][];
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("inside class "+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("no.of students"+(j+1));
				a[i][j]=new String[sc.nextInt()];
			}
			
		}
	}
	void collectData() {
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter clg"+(i+1));
			for(int j=0;j<a[i].length;j++) {
			System.out.println("entered class"+ (j+1));
			for(int k=0;k<a[i][j].length;k++) {
				System.out.println("enter student name"+ (k+1));
			a[i][j][k]=sc.next();}}
		}
		System.out.println("Data stored in memory");
	}
	
	void display() {
		for(int i=0;i<a.length;i++) {
			System.out.println("Enterd class"+(i+1));
			for(int j=0;j<a[i].length;j++) {
			System.out.println("entered class"+ (j+1));
			for(int k=0;k<a[i][j].length;k++) {
			System.out.println("enter student name"+ "schoo l"+(k+1)+ "is"+a[i][j][k]);
			}
				
		}
		}
	}
	}
	