package com.iu.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		// 랜덤한 수를 뽑는다. 1~45 범위를 6개
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int count;
		// 몬스터 info
		String [] monsterName = {"고블린", "오크", "트롤", "골렘"};
		int [] monsterHp = {5, 7, 10, 15};
		
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
			System.out.print(monsterPartyNames[i] + " " + monsterPartyHps[i] + " ");
		}
		
		sc.close();
	}
}