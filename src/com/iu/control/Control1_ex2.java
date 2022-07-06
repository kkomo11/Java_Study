package com.iu.control;

import java.util.Scanner;

public class Control1_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0; String result = "홀수";
		
		System.out.print("숫자를 입력 : ");
		num = sc.nextInt();
		
		if(num%2 == 0) {
			result = "짝수";
		}
		
		System.out.println(result);
		sc.close();
	}
}