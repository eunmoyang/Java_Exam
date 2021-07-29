/*
 * 나이를 입력 받아서 60세 이상이면 "노인"
 * 30세~59세이면 "중장년"
 * 29세 미만이면 "청소년"을 표현하세요.
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam04 {

	public static void main(String[] args) {
		// 선언
		int age = 0;
		Scanner scan = new Scanner(System.in);
		String result = null;
		
		// 입력
		System.out.print("Enter your age : ");
		age = Integer.parseInt(scan.next());
		
		// 처리
		if(age >= 60) {
			result = "senior";
		}
		else if(age <= 29) {
			result = "youth";
		}
		else {
			result = "middle-aged";
		}
		
		// 출력
		System.out.println("You are " + result + ".");
		System.out.println("\nProgram End!");
		scan.close();
	}

}
