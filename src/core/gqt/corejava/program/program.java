package core.gqt.corejava.program;

import java.util.Scanner;

class Farmer{
	double principle;
	static double rate;
	double time;
	double si;
	
	void collectDate(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle:");
		principle = sc.nextDouble();
		System.out.println("Enter the time:");
		time = sc.nextDouble();
	}
	void calculate() {
		si = (principle * rate +time)/100;
	}
	void display() {
		System.out.println("SI:"+si);
	}
}

public class program{
	public static void main(String[] args){
		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();
		Farmer f3 = new Farmer();
		System.out.println("Farmer - 1");
		f1.collectDate();
		f1.calculate();
		f1.display();
		System.out.println("----------");
		System.out.println("Farmer - 2");
		f2.collectDate();
		f2.calculate();
		f2.display();
		System.out.println("----------");

		System.out.println("Farmer - 3");
		f3.collectDate();
		f3.calculate();
		f3.display();
		System.out.println("----------");

	}
}
	

		




		
		
		