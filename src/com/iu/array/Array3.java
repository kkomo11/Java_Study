package com.iu.array;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = new int[3];
		nums[0] = 100; nums[1] = 200; nums[2] = 300;
		
		int [] nums2 = nums;
		System.out.println(nums2[2]); // 300
		
		nums2[0] = 99;
		System.out.println(nums[0]); // 99 얕은 복사
	}

}
