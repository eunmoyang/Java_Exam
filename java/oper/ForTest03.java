/*
 * 두 수를 입력 받아서
 * 작은 수에서 큰 수까지 합을 구하세요.
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ForTest03 {

	public static void main(String[] args) {
		// 선언
//		int num1 = 0;
//		int num2 = 0;
//		int sum = 0;
//		
//		// 입력
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("Enter first number : ");
//		num1 = scan.nextInt();
//		
//		System.out.print("Enter second number : ");
//		num2 = scan.nextInt();
		
		// 처리 및 출력
//		for(int i=num1; i<=num2; i++) {
//			sum = sum + i;
//			System.out.println("i=" + i + "일 때, sum = " + sum);
//			if(i==10) {
////				break;    // for문 자체를 멈추기
//				continue; // 다음 단계 건너뛰고 계속 진행
//			}
//			System.out.println("==============");
//		}
		
		
		// 구구단 3단
//		int dan = 3;
//		int result = 0;
//		for(int i=1; i<=9; i++) {
//			result = dan * i;
//			System.out.println(dan + "*" + i + "=" + result);
//		}
		
		// 구구단 2단~9단까지
		int i = 0;
		int dan = 0;
		int result = 0;
		
		// 1회 실행
		for(dan=2; dan<=9; dan++) {
			// 8번 반복 (for문 처리 전 / 시작 시점)
			for(i=1; i<9; i++) {			
				result = dan * i;
				// 9번 * 8번 = 72번 반복
				System.out.println(dan + "*" + i + "=" + result);
				// 72번 반복
			}
			System.out.println("==========");	
			// 8번 반복 (for문 처리 후 / 종료 시점)
		}
		// 1회 실행
		

	}

}
