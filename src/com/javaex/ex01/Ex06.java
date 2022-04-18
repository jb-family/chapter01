package com.javaex.ex01;

public class Ex06 {
	public static void main(String[] args) {
		
		//자동형변환
		System.out.println(2+3.5);	//출력 값 5.5
		
		
		double var01 = 2+3.5; // 2 --> 2.0으로 자동 형변환됨.   
		System.out.println(var01);
// 정수와 실수를 더하면 정수형이 실수형으로 변경되어 계산된다.
//그래서 실수+실수로 계산된다. 이게 자동형변환이다.
// 자동형변환은 자바에서 필요할때마다 자동적으로 행한다. 범위가 좁은 자료형 > 범위가 넓은 자료형으로 변환됨
		
		System.out.println("====================");
		
		//자동형변환
		long var02 = 12345L;
		float var03 = 1.1F;
		System.out.println(var02 + var03);	// 출력 값 12346.1
		
		float result = var02 + var03;	// var02(12345L) --> 12345.0f으로 바뀐다.
		System.out.println(result);		// 출력 값 12346.1
		
		//////////////////////////////////////////////////////////////////
		
		//강제 형변환
		float var04 = 1111.2345f;	//
		int var05 = (int)var04;		// float에서 int로 강제형변환하여 소숫점이 버려짐. 버려지는 값을 값손실이라 함.
		System.out.println(var05);	// 출력 값 1111 (int는 정수형이기 때문)
		
		
		//축소변환 정상(int --> byte)
		int v01 = 10;	//4byte = 32bit 32칸의 메모리 공간이 있음. byte는 -128 ~ 127 값까지 저장가능.
		byte v02 = (byte)v01;	// 강제 형변환으로 4byte -> 1byte로 변환 즉 32bit 저장공간을 8bit로 축소됨
		System.out.println(v02);// 출력 값 10
		
		
	//축소변환 비정상(int --> byte) 
	int v03 = 203129770;	// byte는 -128 ~ 127 값까지 저장가능.	
	byte v04 = (byte)v03;	// int의 저장공간에서 byte의 저장공간으로 강제 형변환되었으나 가질 수 있는 공간의 범위를 초과하여 값이 바뀐다.
	System.out.println(v04);// 출력 값 -86
		
		//확대변환 (byte --> int)  
		byte v05 = 10;			// byte(1byte) -> int (4byte) 강제 형변환함.
		int v06 = (int)v05;		// 강제 형변환하기 위해서는 변수이름 앞에 변환할 형을 입력해야한다.
		System.out.println(v06);// 출력 값 10
		
		//실수 --> 정수 강제 형변환
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v08);
		
		//정수 --> 실수 강제 형변환
		int v09 = 7;
		double v10 = v09;
		System.out.println(v10);
		
		
		// 실수를 정수로 강제형변환할때 입력한 실수값이 실제로 변하는 것이 아니라 
		// 임시로 정수로 형변환하 는것임 ppt53 참고
		
		
		
		
		
		
	}
}
