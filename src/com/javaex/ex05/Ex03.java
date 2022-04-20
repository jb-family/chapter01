package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		/*
		nums[0] = (int)(Math.random()* 45+1);
		nums[1] = (int)(Math.random()* 45+1);
		nums[2] = (int)(Math.random()* 45+1);
		nums[3] = (int)(Math.random()* 45+1);
		nums[4] = (int)(Math.random()* 45+1);
		nums[5] = (int)(Math.random()* 45+1);
		 */
		// 입력은 for문으로 돌릴수도 돌릴수없기도 하다. (돌릴수있느경우는 규칙이 같은경우
		// 출력은 for문으로 돌릴수있다.

		int[] nums = new int[6];
		
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()* 45+1);
		}
		
		System.out.println(nums[0]);
		System.out.println(nums[4]);
		System.out.println("===============");
		
		for(int i = 0; i < 6; i++) {
			System.out.println(nums[i]);
		}
		
		
		
	}
}
