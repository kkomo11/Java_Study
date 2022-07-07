package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0분0초부터 59분 59초까지
		// 분과 초를 입력받음.
		// 1, 15 입력 입력받은 분, 초에 for문 종료
		
		Scanner sc = new Scanner(System.in);
		System.out.println("분 입력");
		int min = sc.nextInt();
		System.out.println("초 입력");
		int sec = sc.nextInt();
		
		for(int m=0; m<60; m++) {
			for(int s=0; s<60; s++) {
				System.out.println(m+"분 : "+s+"초");
				if(m == min && s == sec) {
					m=1000; s=1000;
				}
			}
		}
		
		sc.close();
	}
}