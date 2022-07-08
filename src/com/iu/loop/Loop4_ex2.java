package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// FPS
		// 총알 : 
		// 탄창 : 30발, 3개
		
		// 1. 단발, 2. 점사
		
		Scanner sc = new Scanner(System.in);
		

		for(int i=0; i<3; i++) {
			int select=0; int bullet=1; String sound = "탕";
//			int num=30;
			
			System.out.println("1. 단발     2.  점사");
			select = sc.nextInt();
			
			if(select==2) {
				bullet=3;
				sound = "탕 탕 탕";
			}
			
			for(int j=0; j<30; j+=bullet) {
			/*	if(num < bullet) {
					bullet = num;
				} 
				for(int h=0; h<bullet; h++) {
					System.out.print(sound +" ");
				}
				System.out.println();
				num -= bullet;*/
				System.out.println(sound);
			}
		}
		
		System.out.println("\n발사 종료");
		sc.close();
	}

}