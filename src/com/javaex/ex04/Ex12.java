package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("숫자를 입력하세요[0이면 종료]");
		int sum = 0;
		int num;
		
		/*
		do {
			num = sc.nextInt();
			sum += num;
			System.out.println("합계" + sum);	
		}while(num != 0);	// 0이 아니면 do 에서 반복됨. 만약 num == 0 이면 0입력 시 반복됨.
		*/
		
		while(true) {
			num = sc.nextInt();
			sum = sum + num;
			System.out.println("합계 : " + sum);
			if(num == 0) {
				break;
			}
		}
		
		System.out.println("종료");
		
		sc.close();
	}
}
