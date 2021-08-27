/*
 * 점수가
 * 97 이상이면 A+, 96~94이면 A0, 93 이하이면 A-
 * 87 이상이면 B+, 86~84이면 B0, 83 이하이면 B-
 * 77 이상이면 C+, 76~74이면 C0, 73 이하이면 C-
 * 67 이상이면 D+, 66~64이면 D0, 63 이하이면 D-
 * 로 성적을 출력하세요.
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam03_1 {

	public static void main(String[] args) {
		// 선언
		int score = 0;
		Scanner scan = new Scanner(System.in);
		char ch = 'Z';
		char buho = '0';
		
		// 입력
		System.out.print("Input score : ");
		score = Integer.parseInt(scan.next());
		
		// 처리
		if(score >= 90 && score <= 100) {
			ch = 'A'; 
			if(score >= 97) {
				buho = '+';
			}
			else if(score >= 94) {
				buho = '0';
			}
			else {
				buho = '-';
			}
		}
//			94~96점 입력 x : buho 초기값이 0이기 때문에 아래 if/else if문에 해당 안되는 점수는 자동으로 0
//  		if(score >= 90 && score <= 100) {
//			ch = 'A';
//			if(score >= 97) {
//				buho = '+';
//			}
//			else if(score <=93) {
//				buho = '-';
//			}
//		}
		else if(score >= 80) {
			ch = 'B';
			if(score >=87) {
				buho = '+';
			}
			else if(score >= 84) {
				buho = '0';
			}
			else {
				buho = '-';
			}
		}
		else if(score >= 70) {
			ch = 'C';
			if(score >= 77) {
				buho = '+';
			}
			else if(score >= 74) {
				buho = '0';
			}
			else {
				buho = '-';
			}
		}
		else if(score >= 63) {
			ch = 'D';
			if(score >= 67) {
				buho = '+';
			}
			else if(score >= 64) {
				buho = '0';
			}
			else {
				buho = '-';
			}
		}
		else {
			ch = 'F';
				buho = 0;
		}
		
		// 출력
		System.out.println("Your score is " + score + ", and your grade is " + ch + buho);
		System.out.println("\nGood luck!");
		scan.close();
		
	} // end of main()

} // end of class
