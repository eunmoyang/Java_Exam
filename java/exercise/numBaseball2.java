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

public class numBaseball2 {
   static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String p1 = "";
		String p2 = "";
		String gs1 = "";
		String gs2 = "";
		String[] p1Arr = new String[3];
		String[] p2Arr = new String[3];
		String[] gs1Arr = new String[3];
		String[] gs2Arr = new String[3];
		
		System.out.println("[player1] 숫자 3자리를 입력하세요. (ex. 123) (단, 숫자는 0~9 사이) : ");
		p1 = scan.next();
		System.out.println("[player2] 숫자 3자리를 입력하세요. (ex. 123) (단, 숫자는 0~9 사이) : ");
		p2 = scan.next();
		
		p1Arr = strToArr(p1);
		p2Arr = strToArr(p2);
		
		System.out.println("player2부터 시작합니다!");
		boolean start = true;
		boolean p2Turn = true;
		boolean p1Turn = true;
		
		while(start) {
			while(p2Turn) {  //
				int p2Strike = 0;
				int p2Ball = 0;
				
				System.out.print("[player2] player1의 숫자를 맞혀보세요! : ");
				gs1 = scan.next();
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
				if(p2Strike!=3) {
					System.out.println("[player2] " + p2Strike + "s" + p2Ball + "b! ===> player1 차례에요!");
					p2Turn = false;
					p1Turn = true;
				} else {
					System.out.println("[SYSTEM] 3 strike!!! player2 승리!");
					p2Turn = false;
					start = false;
				}
			}
			while(p1Turn) {
				int p1Strike = 0;
				int p1Ball = 0;
				System.out.print("[player1] player2의 숫자를 맞혀보세요! : ");
				gs2 = scan.next();
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
				if(p1Strike!=3) {
					System.out.println("[player1] " + p1Strike + "s" + p1Ball + "b! ===> player2 차례에요!");
					p1Turn = false;
					p2Turn = true;
				} else {
					System.out.println("[SYSTEM] 3 strike!!! player1 승리!");
					start = false;
				}
			}
			
		}// end of while(start) 
		
		
	} //main

	private static String[] strToArr(String p1) {
		String[] tmpArr = new String[3];
		for(int i=0; i<tmpArr.length; i++) {
			tmpArr[i] = Character.toString(p1.charAt(i));
		}
		return tmpArr;
	}

}
