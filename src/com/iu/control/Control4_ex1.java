package com.iu.control;

import java.util.Scanner;

public class Control4_ex1 {

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
		
		int total = kor+eng+math; int avg = total/3;
		switch((int) (avg/10)) {
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		
		sc.close();
	}
}