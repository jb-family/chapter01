package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		
		
		int[] leftArray = new int[] {10, 20, 30};
		int[] rightArray = new int[] {10, 20, 30};
		
		
		if(leftArray.length == rightArray.length) {	// 두개의 배열의 개수가 같다면 아래 for문 실행
			
			for(int i = 0; i < leftArray.length; i++) {
				if(leftArray[i] != rightArray[i]) {	// left와 right 주소의 값이 다르니? 
					System.out.println( i + "번째 값이 다릅니다.");
				}else {
					
				}
			}
			System.out.println("=================");
			leftArray [0] = 5;
			leftArray [1] = 6;
			
			for(int i = 0; i < leftArray.length; i++) {
				if(leftArray[i] != rightArray[i]) {
					System.out.println( i + "번째 값이 다릅니다.");
				}else {
					
				}
			}
		} else {	// 두개의 배열의 개수가 다르면 else 실행
			System.out.println("배열의 크기가 다릅니다.");
		}
		
		
		
		
	}
}
