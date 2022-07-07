package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0-9 출력 반복문
		//단, 출력은 짝수만
		Scanner sc = new Scanner(System.in);
		int num=0;
		for(int i=0; i<10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		
		//0-9까지 짝수
		// if문 사용 x
		
		for(int i=0; i<10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println();
		
		//scanner로부터 멍멍 출력 
		System.out.print("멍멍 횟수 입력 : ");
		num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.println("멍멍");
		}
		
		sc.close();
	}

}
