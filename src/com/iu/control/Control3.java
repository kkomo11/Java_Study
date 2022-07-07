package com.iu.control;

import java.util.Scanner;

public class Control3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 10; // 지역변수
		System.out.println("1-3 숫자 입력 ");
		int select = sc.nextInt();
		
		if(select == 1) {
		//	int count = 1; 중복 할당 아님!!
			System.out.println(num);
			System.out.println("1 선택");
		} else if(select == 2) {
		//	int count=1;
			System.out.println("2 선택");
		} else {
		//	int count = 1;
			System.out.println("3 선택");
		}
		
		System.out.println(num);
		
		sc.close();
	}

}
