/*
 * [숫자 야구]
 * 숫자와 자리수가 둘 다 맞으면 strike
 * 숫자는 맞는데 자리가 안 맞으면 ball
 * 둘 다 안 맞으면 foul
 * 먼저 3strike 맞춘 사람이 승리
 */
package kr.co.job.exercise;

import java.util.*;

public class numBaseball4 {
   static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String p1 = null; // 플레이어 1에게 입력 받을 문자열(숫자 세자리)을 저장하는 변수
		String p2 = null; // 플레이어 2에게 입력 받을 문자열(숫자 세자리)을 저장하는 변수
		String gs1 = null; // 플레이어 2가 추측한 플레이어 1의 숫자를 저장하는 변수
		String gs2 = null; // 플레이어 1이 추측한 플레이어 2의 숫자를 저장하는 변수
		String[] p1Arr = new String[3]; // 플레이어 1이 입력한 숫자를 각 자리수별로 나누어 저장할 배열
		String[] p2Arr = new String[3]; // 플레이어 2가 입력한 숫자를 각 자리수별로 나누어 저장할 배열
		String[] gs1Arr = new String[3]; // 플레이어 2가 추측한 플레이어 1의 숫자를 각 자리수별로 나누어 저장할 배열
		String[] gs2Arr = new String[3]; // 플레이어 1이 추측한 플레이어 2의 숫자를 각 자리수별로 나누어 저장할 배열
		String[] print = {"player1", "player2", "숫자를 정해보세요!", "숫자를 맞혀보세요!", "(ex. 123) (단, 숫자는 0~9 사이)"};
		
		// 플레이어1과 플레이어2의 숫자를 각각 string 타입으로 입력 받아서 
		// 1) 세자리수이고, 
		// 2) 중복되는 숫자가 없을 경우 string 배열에 저장한다.
		p1Arr = inputNumber(p1, p1Arr, print[0], print[0], print[2], print[4]);
		p2Arr = inputNumber(p2, p2Arr, print[1], print[1], print[2], print[4]);
		
		System.out.println(Arrays.toString(p1Arr));
		
		System.out.println("=============================================================");
		System.out.println(print[1] + "부터 시작합니다!");
		boolean start = true; // 프로그램 시작
		int playing = 0; // 시도 횟수
		while(start) {
			playing++;
			if(playing%2==1) { // 시도 횟수가 홀수일 때 플레이어 2 차례
				int p2Strike = 0; // 플레이어 2의 스트라이크 횟수
				int p2Ball = 0; // 플레이어 2의 볼 횟수
				
				// 플레이어 2가 추측한 플레이어 1의 숫자를 각각 string 타입으로 입력 받아서 
				// 1) 세자리수이고, 
				// 2) 중복되는 숫자가 없을 경우 string 배열에 저장한다.
				gs1Arr = inputNumber(gs1, gs1Arr, print[1], print[0], print[3], print[4]);
				
				// 플레이어 2가 추측한 숫자와 플레이어 1이 입력한 숫자가 일치하는지 확인
				start = match(gs1Arr, p1Arr, p2Strike, p2Ball, start, print[1], print[0]);
			}
			else { // 시도 횟수가 짝수일 때 플레이어 1 차례
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
						p2Strike+=1; // 플레이어가 추측한 숫자가 상대 플레이어가 입력한 숫자와 자리까지 모두 같을 때 strike 횟수가 증가
					} else { 
						p2Ball+=1; // 플레이어가 추측한 숫자가 상대 플레이어가 입력한 숫자와 같지만 자리가 다를 경우 ball 횟수가 증가
					}
					
				}
			}
		}
		if(p2Strike!=3) { // 스트라이크 횟수가 3이 아닐 경우 스트라이크 횟수와 볼 횟수를 출력하고, 상대 플레이어에게 차례를 넘김
			System.out.println("[" + print + "] " + p2Strike + "s" + p2Ball + "b!");
			System.out.println(">> " + print2 + " 차례에요!");
			System.out.println("=============================================================");
		} else { // 스트라이크 횟수가 3일 경우 승리하고, 프로그램 종료
			System.out.println("=============================================================");
			System.out.println("3 strike~! " + print + "님이 승리하셨습니다!");
			start = false;
		}
		return start;
	}

	
	private static String[] inputNumber(String p1, String[] p1Arr, String print, String print2, String print3, String print4) {
		boolean check = true; // 경계값 설정 (플레이어는 숫자를 1) 세 자리 수로, 2) 중복되지 않게 입력해야 함)
		while (check) {
			System.out.println("[" + print + "] " + print2 + "의 " + print3 + " " + print4);
			System.out.print(">> ");
			p1 = scan.next();
			int count = 0; // 중복되는 숫자 개수를 저장
			if (p1.length() == 3) { // 입력 받은 문자열의 길이값이 3일 경우 (숫자 세자리를 입력한 경우)
				p1Arr = strToArr(p1); // 입력 받은 문자열을 각 자리수별로 나누어 배열에 저장
				for (int i = 0; i < p1Arr.length; i++) {
					for (int j = 0; j < p1Arr.length; j++) {
						if (p1Arr[i].equals(p1Arr[j])) {
								count++; // 세 자리 수 중 중복된 숫자가 있을 경우 그 수만큼 카운트 증가
						}
					}
				}
				if (count>3) { // 중복 숫자 개수가 3보다 클 경우 재입력 요청 (상기 for문이 돌아갈 때 자기 자신도 검사하기 때문에 세 자리수끼리는 서로 중복되는 숫자가 없더라도 기본적으로 3회 중복됨)
					System.out.println("숫자가 중복되지 않게 다시 입력해주세요!");
				} else { // 중복 숫자 개수가 3보다 작을 경우 문자열 검사 종료
					check = false;
				}
			} else { // 입력 받은 문자열의 길이값이 3이 아닐 경우 (숫자를 세자리로 입력하지 않은 경우) 재입력 요청
				System.out.println("숫자를 세 자리 수로 다시 입력해주세요!");
			}
		}
		return p1Arr;
	}

	
	private static String[] strToArr(String p1) { // 매개변수의 문자열을 각 자리수별로 나누어 임의 배열 tmpArr에 저장 후 리턴
		String[] tmpArr = new String[3];
		for(int i=0; i<tmpArr.length; i++) {
			tmpArr[i] = Character.toString(p1.charAt(i));
		}
		return tmpArr; // 메인에서 리턴 받을 때 매개변수와 연결되는 배열에 그 값을 저장
	}

}
