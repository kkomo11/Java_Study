package com.iu.array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
//		 학교 성적 프로그램
//		 1. 학생 정보 입력
//			- 학생 수를 입력
//			- 이름, 번호, 국어, 영어, 수학 입력 후 계산해서 총점. 평균 입력	
//		2. 학생 정보 조회
//			- 모든 학생의 이름, 번호, 총점, 평균 출력
//		3. 학생의 정보를 검색
//			- 검색할 학생의 번호를 입력, 해당 학생의 모든 정보 출력
//			- 일치하는 번호 x, 없는 번호라는 메세지 출력
//		4. 학생 정보 삭제
//			- 삭제할 학생의 번호 입력, 해당 학생의 정보 삭제, 번호가 없으면 메세지 출력
//		5. 학생 정보 추가
//			- 학생의 이름, 번호, 국어, 영어, 수학 입력 후 총점 평균 계산해서 추가
//		6. 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학교 성적 프로그램");
		boolean check=true; int select=0; int student=0;
		boolean first=false;
		String [] stdName=new String[student];
		int [] stdNum=new int[student];
		int [] kor=new int[student];
		int [] eng=new int[student];
		int [] math=new int[student];
		int [] total=new int[student];
		double [] avg=new double[student];
		
		while(check) {
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 조회");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 정보 추가");
			System.out.println("6. 프로그램 종료");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("학생의 수를 입력하세요");
				student = sc.nextInt();
				stdName = new String[student];
				stdNum = new int[student];
				kor = new int[student];
				eng = new int[student];
				math = new int[student];
				total = new int[student];
				avg = new double[student];
				for(int i=0; i<student; i++) {
					System.out.println("학생의 이름을 입력하세요");
					stdName[i] = sc.next();
					System.out.println(stdName[i] + "학생의 번호를 입력하세요");
					stdNum[i] = sc.nextInt();
					System.out.println(stdName[i] + "학생의 국어 점수를 입력하세요");
					kor[i] = sc.nextInt();
					System.out.println(stdName[i] + "학생의 영어 점수를 입력하세요");
					eng[i] = sc.nextInt();
					System.out.println(stdName[i] + "학생의 수학 점수를 입력하세요");
					math[i] = sc.nextInt();
					total[i] = kor[i] + eng[i] + math[i];
					avg[i] = total[i] / 3.0;
					first = true;
				}
				break;
			case 2:
				if(first) {
					System.out.println("이름\t\t번호\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t");
					for(int i=0; i<stdName.length; i++) {
						System.out.println(stdName[i]+"\t\t"+stdNum[i]+"\t\t"+kor[i]+"\t\t"
								+ eng[i] + "\t\t" + math[i] + "\t\t" + total[i] + "\t\t"
								+ avg[i] + "\t\t");
					}
				} else {
					System.out.println("학생 정보를 먼저 입력해주세요");
				}
				break;
			case 3:
				boolean check2 = true;
				if(first) {
					System.out.println("검색할 학생의 번호를 입력하세요");
					int search = sc.nextInt();
					for(int i=0; i<stdName.length; i++) {
						if(search == stdNum[i]) {
							System.out.println("이름\t\t번호\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t");
							System.out.println(stdName[i]+"\t\t"+stdNum[i]+"\t\t"+kor[i]+"\t\t"
									+ eng[i] + "\t\t" + math[i] + "\t\t" + total[i] + "\t\t"
									+ avg[i] + "\t\t");
							check2=false;
						}
					}
					if(check2) {
						System.out.println("해당 번호의 학생이 존재하지 않습니다.");
					}
				} else {
					System.out.println("학생 정보를 먼저 입력해주세요");
				}
				break;
			case 4:
				boolean check3 = true; int i;
				String [] reStdName = new String[stdName.length-1];
				int [] reStdNum = new int[stdNum.length-1];
				int [] reKor = new int[kor.length-1];
				int [] reEng = new int[eng.length-1];
				int [] reMath = new int[math.length-1];
				int [] reTotal = new int[total.length-1];
				double [] reAvg = new double[avg.length-1];
				if(first) {
					System.out.println("삭제할 학생의 번호를 입력해주세요");
					int delete = sc.nextInt();
					for(i=0; i<reStdNum.length; i++) {
						if(delete != stdNum[i]) {
							if(check3) {
								reStdName[i] = stdName[i];
								reStdNum[i] = stdNum[i];
								reKor[i] = kor[i];
								reEng[i] = eng[i];
								reMath[i] = math[i];
								reTotal[i] = total[i];
								reAvg[i] = avg[i];
							} else {
								reStdName[i] = stdName[i+1];
								reStdNum[i] = stdNum[i+1];
								reKor[i] = kor[i+1];
								reEng[i] = eng[i+1];
								reMath[i] = math[i+1];
								reTotal[i] = total[i+1];
								reAvg[i] = avg[i+1];
							}
						} else { // 지워야할 인덱스와 같으면
							reStdName[i] = stdName[i+1];
							reStdNum[i] = stdNum[i+1];
							reKor[i] = kor[i+1];
							reEng[i] = eng[i+1];
							reMath[i] = math[i+1];
							reTotal[i] = total[i+1];
							reAvg[i] = avg[i+1];
							check3 = false;
						}
					}
					stdName = reStdName;
					stdNum = reStdNum;
					kor = reKor;
					eng = reEng;
					math = reMath;
					total = reTotal;
					avg = reAvg;
				} else {
					System.out.println("학생 정보를 먼저 입력해주세요");
				}
				break;
			case 5:
				int j;
				String [] addStdName = new String[stdName.length+1];
				int [] addStdNum = new int[stdNum.length+1];
				int [] addKor = new int[kor.length+1];
				int [] addEng = new int[eng.length+1];
				int [] addMath = new int[math.length+1];
				int [] addTotal = new int[total.length+1];
				double [] addAvg = new double[avg.length+1];
				if(first) {
					System.out.println("추가할 학생의 이름을 입력해주세요");
					String addName = sc.next();
					System.out.println("추가할 학생의 번호를 입력해주세요");
					int addNum = sc.nextInt();
					System.out.println("추가할 학생의 국어 점수를 입력해주세요");
					int addkor = sc.nextInt();
					System.out.println("추가할 학생의 영어 점수를 입력해주세요");
					int addeng = sc.nextInt();
					System.out.println("추가할 학생의 수학 점수를 입력해주세요");
					int addmath = sc.nextInt();
					int addtotal = addkor + addeng + addmath;
					double addavg = addtotal / 3.0;
					
					for(j=0; j<stdName.length; j++) {
						addStdName[j] = stdName[j];
						addStdNum[j] = stdNum[j];
						addKor[j] = kor[j];
						addEng[j] = eng[j];
						addMath[j] = math[j];
						addTotal[j] = total[j];
						addAvg[j] = avg[j];
					}
					addStdName[j] = addName;
					addStdNum[j] = addNum;
					addKor[j] = addkor;
					addEng[j] = addeng;
					addMath[j] = addmath;
					addTotal[j] = addtotal;
					addAvg[j] = addavg;
					
					stdName = addStdName;
					stdNum = addStdNum;
					kor = addKor;
					eng = addEng;
					math = addMath;
					total = addTotal;
					avg = addAvg;
				} else {
					System.out.println("학생 정보를 먼저 입력해주세요");
				}
				break;
			case 6:
				check = !check;
				break;
			default:
				System.out.println("잘못된 번호입니다.");
			}
		}
		sc.close();
	}
}