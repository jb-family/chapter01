package com.javaex.ex01;

public class Ex02 {
	public static void main(String[] args) {
		
		double var01 = 3.14;
		float var02 = 3.14F;
		System.out.println(var01);
		System.out.println(var02);
		
		// double과 float의 정확도차이 
		// double = 8byte = 32bit 32bit안에는 맨앞자리는 0(양수) 1(음수) 나머지 31자리를 m과 e를 넣어 입력한 값과 최대한 근사치에 맞는값을 출력하게함
		// float = 4byte = 16bit 16bit안에는 맨앞자리는 0(양수) 1(음수) 나머지 15자리를 m과 e를 넣어 입력한 값과 최대한 근사치에 맞는값을 출력하게함
		double var03 = 0.1234567890123456789; // 0.12345678901234568
		float var04 = 0.1234567890123456789F; // 0.12345679
		System.out.println(var03);
		System.out.println(var04);
	}
}


