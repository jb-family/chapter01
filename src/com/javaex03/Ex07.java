package com.javaex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("점수를 입력하세요.");
		int num = sc.nextInt(); // 3이라 가정
		int num3 = num % 3; // 0
		if(num3 == 0) {
			System.out.println(num + "은(는) 3의 배수입니다.");	
		} else {
			System.out.println(num + "은(는) 3의 배수가 아닙니다.");
		}
		
		
		sc.close();
	}
}