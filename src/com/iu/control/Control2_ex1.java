package com.iu.control;
import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 월급 입력
		 * 1. 정규직 2. 계약직
		 * 정규직이면 세금 - 국민연금 1%, 건보료 1.4%, 고용보험 0.5%, 산재 0.7%
		 * 계약직 - 3.3% 
		 * 실수령액 출력*/
		
		Scanner sc = new Scanner(System.in);
		int pay=0; int state=0;
		System.out.print("월급을 입력하세요 : ");
		pay = sc.nextInt();
		System.out.print("계약 형태를 입력하세요. 정규직 1, 계약직 2 : ");
		state = sc.nextInt();
		
		if(state == 1) { // 정규
			 pay -= pay*0.036;
		} else { // 계약
			pay -= pay*0.033;
		}
		System.out.println("당신의 실수령액은 " + pay + "입니다.");
		
		sc.close();
	}
}