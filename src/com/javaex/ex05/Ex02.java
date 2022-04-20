package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {

		int[] intArray = new int[5]; 		
		//int[] 배열의 주소값 연결 
		// = new int[] 배열의 주소 메모리공간생성 [] 즉 5칸을 만든다는의미.
		// 주소를 만들어서 intArray라는 변수에 연결시킴.
		
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		intArray[3] = 12;
		intArray[4] = 15;
		/*
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		*/
		
		for(int i =0; i<5; i++) {
			System.out.println(intArray[i]);
		}
		
		
	}
}
