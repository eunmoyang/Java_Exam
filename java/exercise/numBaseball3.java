/*
 * [숫자 야구]
 * 숫자와 자리수가 둘 다 맞으면 strike
 * 숫자는 맞는데 자리가 안 맞으면 ball
 * 둘 다 안 맞으면 foul
 * 먼저 3strike 맞춘 사람이 승리
 */
package kr.co.job.exercise;

import java.util.*;

public class numBaseball3 {
   static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String p1 = null;
		String p2 = null;
		String gs1 = null;
		String gs2 = null;
		String[] p1Arr = new String[3];
		String[] p2Arr = new String[3];
		String[] gs1Arr = new String[3];
		String[] gs2Arr = new String[3];
		String[] print = {"player1", "player2", "숫자를 정해보세요!", "숫자를 맞혀보세요!", "(ex. 123) (단, 숫자는 0~9 사이)"};
		
		p1Arr = inputNumber(p1, p1Arr, print[0], print[0], print[2], print[4]);
		p2Arr = inputNumber(p2, p2Arr, print[1], print[1], print[2], print[4]);
		
		System.out.println("=============================================================");
		System.out.println(print[1] + "부터 시작합니다!");
		boolean start = true;	
		int playing = 0;
		while(start) {
			playing++;
			if(playing%2==1) {
				int p2Strike = 0;
				int p2Ball = 0;
				
				gs1Arr = inputNumber(gs1, gs1Arr, print[1], print[0], print[3], print[4]);
				start = match(gs1Arr, p1Arr, p2Strike, p2Ball, start, print[1], print[0]);
			}
			else {
				int p1Strike = 0;
				int p1Ball = 0;
				
				gs2Arr = inputNumber(gs2, gs2Arr, print[0], print[1], print[3], print[4]);
				start = match(gs2Arr, p2Arr, p1Strike, p1Ball, start, print[0], print[1]);
			}
			
		} // end of while
		
	} //main

	
	private static boolean match(String[] gs1Arr, String[] p1Arr, int p2Strike, int p2Ball, boolean start, String print, String print2) {
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
			System.out.println("[" + print + "] " + p2Strike + "s" + p2Ball + "b!");
			System.out.println(">> " + print2 + " 차례에요!");
			System.out.println("=============================================================");
		} else {
			System.out.println("=============================================================");
			System.out.println("3 strike~! " + print + "님이 승리하셨습니다!");
			start = false;
		}
		return start;
	}

	
	private static String[] inputNumber(String p1, String[] p1Arr, String print, String print2, String print3, String print4) {
		boolean check = true;
		while (check) {
			System.out.println("[" + print + "] " + print2 + "의 " + print3 + " " + print4);
			System.out.print(">> ");
			p1 = scan.next();
			int count = 0;
			if (p1.length() == 3) {
				p1Arr = strToArr(p1);
				for (int i = 0; i < p1Arr.length; i++) {
					for (int j = 0; j < p1Arr.length; j++) {
						if (p1Arr[i].equals(p1Arr[j])) {
								count++;
						}
					}
				}
				if (count>3) {
					System.out.println("숫자가 중복되지 않게 다시 입력해주세요!");
				} else {
					check = false;
				}
			} else {
				System.out.println("숫자를 세 자리 수로 다시 입력해주세요!");
			}
		}
		return p1Arr;
	}

	
	private static String[] strToArr(String p1) {
		String[] tmpArr = new String[3];
		for(int i=0; i<tmpArr.length; i++) {
			tmpArr[i] = Character.toString(p1.charAt(i));
		}
		return tmpArr;
	}

}
