package com.javaex.ex02;

public class Ex01 {
	public static void main(String[] args) {
		// println은 줄바꿈기능이 있음 print는 줄바꿈기능이없음
		// 문자열안에 숫자값이 들어가면 숫자값이 문자열로 바뀐다.
		// 문자열안에서 \n 을 사용하면 강제로 줄바꿈 기능이 생긴다.
		// 문자열안에서 \t 을 사용하면 일정한 간격으로 문자와의 간격이 벌어진다.
		// 문자열안에서 " "를 사용하고 싶다면 \" \"을 사용하면 된다.
		// 문자열안에서 \ \를 사용하고 싶다면 \\ \\을 사용하면 된다.
		
		
		int i = 2345;
		double d = 3.14;
		String s = "한";
		String str = "굿모닝";
		char c = '한'; // c + c 숫자로 연산된다.
		String name = "최종빈";
		
		System.out.println("안녕하세유");
		System.out.println(str);
		
		
		System.out.print("안녕");
		System.out.println("하세유");
		System.out.println(str + str + "안녕하세유");
		System.out.println(str + i);
		String var01 = str + i;
		System.out.println(str + " 랑 " + i);
		
		System.out.println(str + d);
		System.out.println(i + i);
		System.out.println(d + d);
		System.out.println(i + d);
		
		System.out.println(c);
		System.out.println(c + c);
		
		System.out.println(s);
		System.out.println(s + s);
		
		System.out.println("제이름은 " + name + " 입니다.");
		System.out.println("==========================");
		System.out.println("안녕\n하세요");
		System.out.println("안녕\t하세요");
		
		System.out.println("안녕\"하\"세요");
		System.out.println("안녕\\하\\세요");
	}
}
