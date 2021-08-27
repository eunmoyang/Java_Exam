/*
 * 키보드로 두 수를 입력 받아서 
 * 큰지 작은지 비교하는 프로그램을 작성해보자
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		// 선언
		int num1;
		int num2;
		String result = null;
		
		Scanner scan = new Scanner(System.in);
		
		// 입력
		System.out.println("첫 번째 숫자를 입력하세요.");
		num1 = Integer.parseInt(scan.next());
		
		System.out.println("두 번째 숫자를 입력하세요.");
		num2 = Integer.parseInt(scan.next());
		
		// 처리 및 출력
		if(num1 > num2) {
			result = "첫 번째 숫자는 두 번째 숫자보다 큽니다.";
		}
		else {
			result = "첫 번째 숫자는 두 번째 숫자보다 작습니다.";
		}
		
		System.out.println(result);
		System.out.println("끝");
		scan.close();
		
	} // end of main()

} // end of class
