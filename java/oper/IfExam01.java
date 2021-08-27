/*
 * 키보드로 숫자를 입력 받아서 
 * 0인지 아닌지 확인하는 프로그램을 작성해보자  
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		// 선언부 : 키보드 입력, 숫자 보관
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String result = null; // 바로 출력하지 않고 출력할 문자열 보관/저장 시킴
		// 결과값을 보존하려고, 이 데이터로 출력할때 더 꾸며서 보여줄 수 있음
		
		// 입력
		System.out.print("Input Number : ");
//		num = scan.nextInt();
		num = Integer.parseInt(scan.next()); // 정수로 변환해주는 메서드
		
		if(num == 0) {
			// 조건이 참일 때
//			System.out.println("num은 0입니다.");
			result = "num은 0입니다.";
		}
		else {
			// 조건이 거짓일 때
//			System.out.println("num은 0이 아닙니다.");
			result = "num은 0이 아닙니다.";
		}
		
		System.out.println(result);
		System.out.println("Program End!");
		scan.close();

	} // end of main()

} // end of class
