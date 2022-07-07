package com.iu.control;

import java.util.Scanner;

public class Control3_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		System.out.println("국어 입력");
		kor = sc.nextInt();
		System.out.println("영어 입력");
		eng = sc.nextInt();
		System.out.println("수학 입력");
		math = sc.nextInt();
		int total = kor + eng + math;
		double avg = total/3.0;
		
		if(avg>=90) {
			System.out.println("A");
		} else if(avg>=80) {
			System.out.println("B");
		} else if(avg>=70) {
			System.out.println("C");
		} else if(avg>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		sc.close();
	}

}
