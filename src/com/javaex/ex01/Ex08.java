package com.javaex.ex01;

public class Ex08 {
	public static void main(String[] args) {
		
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		System.out.println("산술연산자");
		//산술연산자
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // 정수/정수 = 정수(몫)
		System.out.println(a % b); // 정수/정수 = 정수(나머지)
		System.out.println("=============");
		//산술연산자 / % 자세히
		System.out.println("산술연산자 / % 자세히");
		System.out.println(7/2); 		// 3(몫)
		System.out.println(7.0/2.0);	// 3.5 (실수 / 실수 = 실수)
		System.out.println(7%2); 		// 1(나머지)
		System.out.println(7.0%2.0); 		// 1.0(나머지)
		System.out.println("=============");
		
		System.out.println("부호연산자");
		//부호 연산자
		int var = -3;
		int pvar = +var; // -3
		int mVar = -var; // 3
		System.out.println(pvar);
		System.out.println(mVar);
		System.out.println("=============");
		//증감 연산자
		// 숫자앞에 ++ 또는 -- 를 사용하면 지금 출력 값을 변경한뒤 출력.
		// 숫자뒤에 ++ 또는 -- 를 사용하면 지금 출력 값을 변경하지 않고 다음 출력에 변경된 값 출력.
		
		System.out.println("증감연산자");
		System.out.println(a);		//7
		System.out.println(++a);	//8 바로 + 됨
		System.out.println(a);		//8
		
		System.out.println(b);		//2
		System.out.println(--b);	//1 바로 - 됨
		System.out.println(b);		//1
		
		System.out.println(a);		//8
		System.out.println(a++);	//8 출력한 뒤 a의 값 증가됨
		System.out.println(a);		//9 다음 출력에 증가된 값 출력
		
		System.out.println(b);		//1
		System.out.println(b--);	//1 출력한 뒤 b 값 감소됨
		System.out.println(b);		//0 다음 출력에 감소된 값 출력
		
		System.out.println("=============");
		
		
	}
}
