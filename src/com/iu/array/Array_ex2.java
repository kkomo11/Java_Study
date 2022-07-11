package com.iu.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		// 랜덤한 수를 뽑는다. 1~45 범위를 6개
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		String [] monsterName = {"고블린", "오크", "트롤", "골렘"};
		int [] monsterHp = {5, 7, 10, 15};
		
		int count;
		// 캐릭터 이름설정(마법사)
		System.out.println("캐릭터 이름 입력");
		String name = sc.next();
		
		// 파이어볼
		int magicPower=6; int damage=0;
		
		// 몬스터 info
		// 몬스터 파티 생성
		// 몬스터의 수를 입력 (1~4)
		// 몬스터의 체력은 기본 체력의 절반에서 
		
		System.out.print("몬스터의 수를 입력(1 ~ 4) : ");
		count = sc.nextInt();
		String [] monsterPartyNames = new String[count];
		int [] monsterPartyHps = new int[count];
		for(int i=0; i<count; i++) {
			int index = rand.nextInt(4);
			monsterPartyNames[i] = monsterName[index];
			monsterPartyHps[i] = monsterHp[index];
		}
		for(int i=0; i<monsterPartyNames.length; i++) {
			System.out.println(monsterPartyNames[i] + "의 hp : " + monsterPartyHps[i] + " ");
		}
		
		// 0부터 6미만의 랜덤한 데미지로 몬스터를 1회 공격
		// 1. 사냥 2. 도망
		boolean check = true;
		while(check) {
			int death=0;
			System.out.println("1. 사냥   2. 도망");
			int move = sc.nextInt();
			if(move == 1) {
				System.out.println(name + "의 파이어볼!");
				for(int i=0; i<monsterPartyNames.length; i++) {
					damage = rand.nextInt(magicPower);
					monsterPartyHps[i] -= damage;
					if(monsterPartyHps[i] < 1) {
						death++;
					}
				}
				for(int i=0; i<monsterPartyNames.length; i++) {
					System.out.println(monsterPartyNames[i] + "의 잔여 hp : " + monsterPartyHps[i] + " ");
				}
				
				System.out.println("처치한 몬스터 " + death + "마리");
				
			} else {
				check = !check;
			}
		}
		sc.close();
	}
}