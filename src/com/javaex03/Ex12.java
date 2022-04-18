package com.javaex03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {	// switch문에 break가 없으면 break가 있는 case문을 만날때까지 계속 진행된다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();
		switch(month) {
			case 1 : System.out.println("31일");
			break;
			case 2 : System.out.println("28일");
			break;
			case 3 : System.out.println("31일");
			break;
			case 4 : System.out.println("30일");
			break;
			case 5 : System.out.println("31일");
			break;
			case 6 : System.out.println("30일");
			break;
			case 7 : System.out.println("31일");
			break;
			case 8 : System.out.println("31일");
			break;
			case 9 : System.out.println("30일");
			break;
			case 10 : System.out.println("31일");
			break;
			case 11 : System.out.println("30일");
			break;
			default : System.out.println("31일");
			break;
		}
		
		sc.close();
	}
}
