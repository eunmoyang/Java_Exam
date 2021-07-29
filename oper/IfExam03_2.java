/*
 * 점수를 입력 받아서 성적(A~F)을 출력하세요.
 * 성적을 보관할 때 : 문자 1개인 것 확인
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam03_2 {

	public static void main(String[] args) {
		// 선언
		int score = 0;
		Scanner scan = new Scanner(System.in);
		char ch ='Z';
		char buho = 0;								// 부호 처리를 위한 실행문
		
		// 입력
		System.out.print("Input score : ");
		score = Integer.parseInt(scan.next());
		
		// 처리
		if(score >= 90) {		
			ch = 'A';
		}
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

		if(score >= 60 && score <= 100) {			// 부호 처리를 위한 실행문
			if(score%10 >= 7) {
				buho = '+';
			}
			else if(score%10 <=3) {
				buho = '-';
			}
		}
		
		// 출력
		System.out.println("Your score is " + score + ", and your grade is " + ch + buho + "!");
		System.out.println("\nGood luck!");
		scan.close();
		
	} // end of main()

} // end of class
