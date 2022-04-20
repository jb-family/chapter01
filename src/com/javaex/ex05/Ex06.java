package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		
		
		int[] arrA = new int[3];	// A의주소 ex) 0x11
		
		arrA [0] = 3;
		arrA [1] = 6;
		arrA [2] = 9;
		
		int[] arrB = new int[3];	// B의주소 ex) 0x22
		
		for(int i = 0; i < arrA.length; i++) {
			arrB[i] = arrA[i];	// arrA의 값을 arrB로 복사
		}						// 0x11 주소안의 값과 0x22 주소안의 값이 같아진다.
		
		//출력
		for(int i = 0; i < arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("=====================");
		
		for(int i = 0; i < arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("=====================");
		System.out.println("arrA[1] 100으로 변경");
		
		arrA[1] = 100;	// 0x11의 주소안의 arrA[1]의 값만 변경
		
		for(int i = 0; i < arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("=====================");
		
		for(int i = 0; i < arrB.length; i++) {
			System.out.println(arrB[i]);
		}
	}
}
