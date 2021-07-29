package kr.co.job;

import java.util.Scanner;

public class BasicTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 선언 (두 수와 결과값)
		int num1=0;
		int num2=0;
		int result;
		
		Scanner scan = new Scanner(System.in);
		
		//Scanner scan;                    // 선언
		scan = new Scanner(System.in);     // 생성
		
		// 입력 (두 수를 각각 키보드로 입력 받기)
		
		System.out.println("첫 번째 숫자를 입력하세요.");
		num1 = scan.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요.");
		num2 = scan.nextInt();
		
		// 처리 (결과값 = 두 수의 합 구하기)
		result = num1 + num2;
		
		// 출력 (결과값 출력하기)
		System.out.println("답 : " + result);
		scan.close();		
		
	}

}
