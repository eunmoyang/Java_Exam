/*
 * 실행문1
 * while(조건) {
 * 		실행문2 => 조건이 참이면 실행
 * }
 * 실행문3
 */
package kr.co.job.oper;

public class WhileTest01 {

	public static void main(String[] args) {
		// 1부터 10까지의 합
		int i = 1;
		int sum = 0;
		
		while(i<=10) {
			sum += i;
			System.out.print(i);
			i++;
		}
		System.out.println("\nsum = " + sum);
		// while문 특징 : 조건이 참이면 돌아간다.
		// ex. 책의 맨 끝이 아닐 때까지 읽으면 됨 / for문일 경우 시작부터 끝까지 다 읽어야 함

	}

}
