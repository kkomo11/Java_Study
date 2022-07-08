package com.iu.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
//		System.out.println(random.nextInt(10)); 0부터 10미만 랜덤 int
		// 가위바위보 게임
		// 0 가위, 1 주먹, 2 보
		// 유저가 이길 때까지 가위바위보
		
		boolean win = false; int user=0; int com=0;
		while(!win) {
			System.out.println("가위바위보 시작!");
			System.out.println("0. 가위   1. 주먹   2. 보");
			user = sc.nextInt();
			com = random.nextInt(3);
			System.out.println("컴퓨터 : " + com);
			if(user-com == 1 || user-com == -2) {
				System.out.println("이김");
				win = true;
			} else if(user == com) {
				System.out.println("비김");
			} else {
				System.out.println("짐");
			}
		}
		sc.close();
	}
}