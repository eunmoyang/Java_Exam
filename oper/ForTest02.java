/*
 * 1. 정수를 입력 받고
 * 2. 1부터 입력 받은 수까지 순서대로 출력
 * 
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		// 선언
		int num = 0;
		
		// 입력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		num = scan.nextInt();
		
		// 처리 및 출력
		for(int i = 1; i <= num; i++) {  // for문에서만 쓰기 위해 for문 안에 선언 (for문 밖에서 선언하면 main 전체에 영향)
			System.out.println(i);
		}
		
	}

}
