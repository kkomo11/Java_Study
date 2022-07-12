package com.iu.array;

public class Array7 {

	public static void main(String[] args) {
		int [] ar = {4,10,8,9,13};
		// 내림차순 13 10 9 8 4 순서
		
		for(int i=0; i<ar.length-1;i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]<ar[j]) {
					int tmp = ar[j];
					ar[j] = ar[i];
					ar[i] = tmp;
				}
			} 
		}
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		
	}

}
