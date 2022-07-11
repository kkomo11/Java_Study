package com.iu.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드로부터 인원수 입력
		// 인원 수 만큼 이름을 입력받아서
		// 이름들을 출력
		
		Scanner sc = new Scanner(System.in);
		int count; int sum=0;
		System.out.println("인원 수 입력");
		count = sc.nextInt();
		String [] names= new String[count];
		int [] kors = new int[count];
		for(int i=0; i<names.length; i++) {
			System.out.println((i+1) + "번째 인원 이름 입력");
			names[i] = sc.next();
		}
		
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
		// 각 학생의 이름별로 국어 점수를 입력 후 출력
		
		System.out.println();
		
		for(int i=0; i<kors.length; i++) {
			System.out.print(names[i] + "의 국어 점수를 입력하세요 ");
			kors[i] = sc.nextInt();
			sum += kors[i];
		}
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i] + "의 국어점수 " + kors[i] + "점");
		}
		
		System.out.println("이 반의 국어 점수 총점은 " + sum + "점 입니다.");
		sc.close();
	}
}