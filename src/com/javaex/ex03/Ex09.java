package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자 :");
		int num = sc.nextInt();
		
		if(num > 0) {	//양수 (짝수, 홀수)
			if(num % 2 == 0) { //짝수
				System.out.println("짝수입니다.");
				} else {
					System.out.println("홀수입니다.");
				}
			} else if (num < 0) { //음수
				System.out.println("음수입니다.");
				
			} else {
				System.out.println("0입니다.");
			}
		
		sc.close();
	}
}
