package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 대문자 2. 소문자
		// 1번이면 대문자 A-Z 2번이면 소문자 a-z
		
		// 1부터 10까지 합 구하기
		
		// ID, PW 입력해서 로그인판단 최대 로그인 횟수는 5회
		// id : 1234, pw : 5678
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 대문자   2. 소문자");
		int num1 = sc.nextInt();
		
		if(num1 == 1) {
			for(int i=0; i<26; i++)
				System.out.println((char)(65+i));
		} else {
			for(int i=0; i<26; i++)
				System.out.println((char)(97+i));
		}
		
		System.out.println("=====================================");
		
		int sum=0;
		for(int i=1; i<11; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합 " + sum);
		
		System.out.println("=====================================");
		
		int yId = 1234; int yPw = 5678;
		int inputId=0; int inputPw=0;
		int i=0;
		
		for(i=0; i<5; i++) {
			System.out.println("아이디를 입력하세요");
			inputId = sc.nextInt();
			
			System.out.println("비밀번호를 입력하세요");
			inputPw = sc.nextInt();
			
			if(yId == inputId && yPw == inputPw) {
				System.out.println("로그인에 성공하였습니다.");
				i = 100;
			} else {
				if(i==4) {
					System.out.println("로그인 5회 시도. 아이디 잠김");
				} else {
					System.out.println("로그인 실패 재입력 바람");
				}
			}
		}
		sc.close();
	}
}