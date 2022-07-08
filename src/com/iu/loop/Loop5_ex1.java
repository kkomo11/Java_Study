package com.iu.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int yId=1234; int yPw=5678; int inputId=0; int inputPw=0;
		int num=0;
		boolean check = true;
		boolean loginStatus = false;
		//로그인시도 , 성공할 때 까지
		
		while(check) {
			System.out.println("1. 로그인");
			System.out.println("2. 종 료");
			num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("아이디를 입력하세요");
				inputId = sc.nextInt();
				System.out.println("비밀번호를 입력하세요");
				inputPw = sc.nextInt();
				
				if(yId == inputId && yPw == inputPw) {
					System.out.println("로그인에 성공하였습니다.");
					loginStatus = true;
					check = !check;
				} else {
					System.out.println("로그인 실패");
				}
				break;
			case 2:
				check = !check;
			}
		}
		
		//-------------------------------------------------------------------
		
		// 로그인 성공 실패 판단
		// 로그인 실패 : 프로그램 종료
		// 로그인 성공 : 게임 시작
		// RPG, 시작 레벨은 1, 만렙 15
		// 최초 gold : 1000 
		// 모든 몬스터의 경험치는 동일 
		// 1->2 : 3마리
		// 2->3 : 6마리
		// 3->4 : 9마리
		// 4->5 : 12마리
		// 14->15 : ?마리
		// 사냥 or 종료 선택지
		
		// 5렙 달성시 축하금 1000 gold 지금
		// 10렙 달성시 축하금 2000 gold 지금
		// 15렙 달성시 축하금 3000 gold 지금
		int count=1;
		if(loginStatus) {
			System.out.println("게임 시작");
			System.out.println("사냥 1,  종료 2");
			int c = sc.nextInt();
			
			if(c == 1) {
				int level=1; int Gold=1000; int exp = 3;
				while(level<15) {
					System.out.println("몬스터 "+ count +"마리 잡았습니다.");
					if(count == exp) {
						level++;
						System.out.println("레벨 "+ level +"달성!!");
						exp += 3;  count = 0;
						if(level%5==0 && count == 0) {
							System.out.println(200*level+"Gold 지급");
							Gold += 200*level;
						}
						if(level!=15) {
							System.out.println("계속 사냥 1,  종료 2");
							c = sc.nextInt();
							if(c==2) break;
						}
					}
					count++;
				}
				if(level==15) System.out.println("축 최고레벨 달성");
				System.out.println("현재 레벨 : " + level + " 보유 골드 : " + Gold);
			}
		}
		
		System.out.println("프로그램 종료");
		sc.close();
	}
}