package com.javaex.ex01;

public class Ex09 {
	public static void main(String[] args) {


		//관계연산자
		int n1 = 5;
		int n2 = 3;
				
		
		
		System.out.println(n1 < n2); // n1<n2 보다 작다 false
		System.out.println(n1 > n2); // n1>n2 보다 크다 true
		
		System.out.println(n1<=n2); // n1<=n2 작거나 같다 false
		System.out.println(n1>=n2); // n1>=n2 크거나 같다 true
		
		System.out.println(n1==n2); // n1==n2 같다 false
		System.out.println(n1!=n2); // n1!=n2 다르다 true
		
		
		boolean result = n1 < n2;	// boolean형으로 쓰는이유는 관계연산자를 사용하기 때문. 
		System.out.println(result);	// 관계연산자는 true 또는 false 값으로 밖에 안나옴
									// 출력 값 false
	}
}
