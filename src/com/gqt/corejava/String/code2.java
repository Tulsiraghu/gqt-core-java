package com.gqt.corejava.String;

public class code2 { 
	public static void main(String[] args) {
	String s1 = "RAMA";
	String s2 = "RAMA";
	String s3 = "rama";
	String s4 = "SITA";
	System.out.println("Case-1 : Same String");
	if(s1.equalsIgnoreCase(s2)==true) {
		System.out.println("String equals");
	}
	else {
		System.out.println("String not equal");
	}
	System.out.println("---------------------");
	if(s1 == s2) {
		System.out.println("References equal");
	}
	else {
		System.out.println("References not equal");
	}
	System.out.println("---------------");
	System.out.println("Case-2 : Different String");
	if(s1.equalsIgnoreCase(s4)==true) {
		System.out.println("String equals");
	}
	else {
		System.out.println("String not equal");
	}
	System.out.println("---------------------");
	if(s1 == s4) {
		System.out.println("References equal");
	}
	else {
		System.out.println("References not equal");
	}
	System.out.println("------------------");
	System.out.println("Case-3 : Same String but different case");
	if(s1.equalsIgnoreCase(s3)==true) {
		System.out.println("String equals");
	}
	else {
		System.out.println("String not equal");
	}
	System.out.println("---------------------");
	if(s1 == s3) {
		System.out.println("References equal");
	}
	else {
		System.out.println("References not equal");
	}
	}
}
