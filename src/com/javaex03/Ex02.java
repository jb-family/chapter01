package com.javaex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 :");
		int score = sc.nextInt();
		
		if(score >= 60) {
			System.out.println("점수는 " + score + "점 입니다.");
			System.out.println("합격입니다.");
		} else {
			System.out.println("점수는 " + score + "점 입니다.");
			System.out.println("불합격입니다.");
		}
		
		sc.close();
	}
}