package com.iu.control;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드로부터 국어, 영어, 수학 점수를 차례로 입력
		// 총점과 평균 계산
		// 평균이 90점 이상이면 우등상 수상 출력
		// 모든 학생들은 졸업 출력
		
		/*
		 * 2. 90 이상 A 80 이상 B 70 이상 C 60이상 D 나머지 F
		 */
		Scanner sc = new Scanner(System.in);
		int kor=0; int eng=0; int math=0; double avg=0; int total = 0;
		
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		math = sc.nextInt();
		
		total = kor + eng + math; avg = total/3;
		if(avg >= 90) {
			System.out.println("우등상 수상");
		}
		
		System.out.println("졸업 축하합니다. ");
		
		if(avg >= 90) {
			System.out.println("A 학점");
		}
		if(avg <90 && avg >=80) {
			System.out.println("B 학점");
		}
		if(avg <80 && avg >=70) {
			System.out.println("C 학점");
		}
		if(avg <70 && avg >=60) {
			System.out.println("D 학점");
		}
		if(avg <60){
			System.out.println("F 학점");
		}
		
		sc.close();
	}
}