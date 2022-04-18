package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		// ppt 68 참고해서 정리하기. 
		
		
		Scanner sc = new Scanner(System.in); //키보드연결 
		int num = sc.nextInt(); //키보드 입력값
		System.out.println("당신이 입력하신 숫자는 "+ num + "입니다.");
		
		sc.close();
		
	}
}
