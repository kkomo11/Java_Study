package com.iu.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		/* 2 
		 * a=97 z=122
		 * A = 65  Z=90
		*/
		char ch = ' '; int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("오늘의 숫자(1-5) : ");
		num = sc.nextInt();
		System.out.println("알파벳 입력");
		ch = sc.next().charAt(0);
		
		if(65<=ch && ch<=90) { // 대문자
			ch = (char)(ch+num);
			if(ch > 90) {
				ch -= 26;
			}
		}
		
		if(97<=ch && ch<=122) { //소문자
			ch = (char)(ch+num);
			if(ch > 122) {
				ch -= 26;
			}
		}
		
		System.out.println(ch);
		
		// study edition
		// 집에서 추가한 것.
		sc.close();
	}

}
