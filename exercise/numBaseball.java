/*
 * [숫자 야구]
 * 숫자와 자리수가 둘 다 맞으면 strike
 * 숫자는 맞는데 자리가 안 맞으면 ball
 * 둘 다 안 맞으면 foul
 * 먼저 3strike 맞춘 사람이 승리
 */
package kr.co.job.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class numBaseball {
   static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 0;
		int p1Num = 0;
		int count1 = 0;
		int count2 = 0;
		String p1 = "";
		String p2 = "";
		String[] p1Arr = new String[3];
		String[] p2Arr = new String[3];
		String[] gs1Arr = new String[3];
		String[] gs2Arr = new String[3];
		
		boolean start = true;
		while(start) {
		System.out.println("==========숫자야구==========");
		System.out.println("1. player1\n2. player2\n3. 결과 보기\n99. 종료");
		System.out.println("==========================");
		System.out.println("input number : ");
		num = scan.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("==========player1==========");
			System.out.println("1. 내 숫자 입력\n2. player2 숫자 맞히기\n99.종료");
			System.out.println("==========================");
			System.out.println("input number : ");
			p1Num = scan.nextInt();
			
			switch(p1Num) {
			case 1:
				p1 = saveValue();
				p1Arr = strToArr(p1);
				break;
			case 2:
				boolean p1Game = true;
				while(p1Game) {
					int p1Strike = 0;
					int p1Ball = 0;
					count1++;
					String gs2 = saveValue();
					
					gs2Arr = strToArr(gs2);
					
					for(int i=0; i<gs2Arr.length; i++) {
						for(int j=0; j<p2Arr.length; j++) {
							if(gs2Arr[i].equals(p2Arr[j])) {
								if(i==j) {
									p1Strike+=1;
								} else {
									p1Ball+=1;
								}
								
							}
						}
					}
					System.out.println("[player1] result : " + p1Strike + "s" + p1Ball + "b");
					if(p1Strike==3) {
						System.out.println("3strike!!! " + count1 + "회 시도하셨습니다.");
						p1Game = false;
					}
				}
				break;
			case 99:
				System.out.println("기존 메뉴로 돌아갑니다.");
				break;
			default:
				System.out.println("다시 입력하세요.");
			}
			break;
		case 2:
			System.out.println("==========player2==========");
			System.out.println("1. 내 숫자 입력\n2. player1 숫자 맞히기\n99.종료");
			System.out.println("==========================");
			System.out.println("input number : ");
			p1Num = scan.nextInt();
			
			switch(p1Num) {
			case 1:
				p2 = saveValue();
				p2Arr = strToArr(p2);
				break;
			case 2:
				boolean p2Game = true;
				while(p2Game) {
					int p2Strike = 0;
					int p2Ball = 0;
					count2++;
					String gs1 = saveValue();
					
					gs1Arr = strToArr(gs1);
					
					for(int i=0; i<gs1Arr.length; i++) {
						for(int j=0; j<p1Arr.length; j++) {
							if(gs1Arr[i].equals(p1Arr[j])) {
								if(i==j) {
									p2Strike+=1;
								} else {
									p2Ball+=1;
								}
								
							}
						}
					}
					System.out.println("[player2] result : " + p2Strike + "s" + p2Ball + "b");
					if(p2Strike==3) {
						System.out.println("3strike!!! " + count2 + "회 시도하셨습니다.");
						p2Game = false;
					}
				}
				break;
			case 99:
				System.out.println("기존 메뉴로 돌아갑니다.");
				break;
			default:
				System.out.println("다시 입력하세요.");
			}
			break;
		case 3:
			if(count1<count2) {
				System.out.println("player1 승리!");
			} else {
				System.out.println("player2 승리!");
			}
			break;
		case 99:
			System.out.println("숫자 야구를 종료합니다.");
			start = false;
			break;
		default:
			System.out.println("다시 입력하세요.");
		} // switch num	
		} // while bb
		
		
	} //main

	private static String[] strToArr(String p1) {
		String[] tmpArr = new String[3];
		for(int i=0; i<tmpArr.length; i++) {
			tmpArr[i] = Character.toString(p1.charAt(i));
		}
		return tmpArr;
	}

	private static String saveValue() {
		System.out.println("숫자 3자리를 입력하세요. (ex. 123) (단, 모든 숫자는 0~9 사이) : ");
		return scan.next();
	}

}
