package com.javaex.ex01;

public class Ex07 {
	public static void main (String[] args) {
		
		// v01에서 5/4 = 
		double v01 = 5/4; // double = int + int (int)
		System.out.println(v01); // 1.0
		
		double v02 = (double)5/4; // double = double + int (double)
		System.out.println(v02); // 1.25
		
		double v03 = 5 / (double)4; // double = int + double (double)
		System.out.println(v03); // 1.25 
		
		double v04 = (double)5 / (double)4; // double = double + double (double)
		System.out.println(v04); // 1.25
		
		int v05 = (int)1.3 + (int)1.8; // int = int + int (int)
		System.out.println(v05); //2
	}
}
