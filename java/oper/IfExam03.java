/*
 * 점수를 입력 받아서 성적(A~F)을 출력하세요.
 * 성적을 보관할 때 : 문자 1개인 것 확인
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam03 {

	public static void main(String[] args) {
		// 선언
		int score = 0;
		Scanner scan = new Scanner(System.in);
//		String result = null;
		char ch ='Z';  // 결과값이 문자 1개니까 String 안 쓰고 char로 씀 / 처리가 안 되면 Z로 출력
		
		// 입력
		System.out.print("Input score : ");
		score = Integer.parseInt(scan.next());
		
		// 처리
		if(score >= 90) {		// if를 반복하면 계속 새로 비교하는거라서 else if 써야 함
								// && score >= 100 쓰지 않는 이유는 
//			result = "your score is \"A\"";
			ch = 'A';  // 문자 1개라서 char 썼기 때문에 문자열 쓸 수 없음 (type mismatch 오류)
		}
//		else if(score >= 80 && score < 90) {   // && 쓰지 않아도 됨 (첫 if문에서 이미 걸렀기 때문에)
		else if(score >= 80) {
			ch = 'B';
		}
		else if(score >= 80) {
			ch = 'C';
		}
		else if(score >= 70) {
			ch = 'D';
		}
		else {
			ch = 'F';
		}
		
		// 부호 처리를 위한 실행문
		char buho = 0;
		
		if(score >= 60 && score <= 100) {
			if(score%10 >= 7) {
				buho = '+';
			}
			else if(score%10 <=3) {
				buho = '-';
			}
		}
		
		// 출력
//		System.out.println(result);
		// 당신의 점수는 x점이고, 성적은 y입니다.
		System.out.println("Your score is " + score + ", and your grade is " + ch + "!");
		System.out.println("\nGood luck!");
		scan.close();
		
	} // end of main()

} // end of class
