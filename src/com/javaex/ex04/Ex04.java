package com.javaex.ex04;

public class Ex04 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; i <= 7; i++) {
			sum += i; // sum = sum + i
			System.out.println( i + "까지의 합은 " + sum );
		}
	System.out.println("1부터 10까지 정수의 합은 " + sum + " 입니다.");
	}
}
