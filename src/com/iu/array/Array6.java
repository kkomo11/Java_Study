package com.iu.array;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열의 길이 변경
		int [] nums = {1,2,3};
		int [] copy = new int[nums.length-1];
		System.out.println(nums.length);
		
		for(int i=0; i<copy.length; i++) {
			copy[i] = nums[i];
		}
		
		nums = copy;
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums.length);
		}
	}

}
