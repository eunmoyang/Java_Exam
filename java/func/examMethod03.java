package kr.co.job.func;

import java.util.Scanner;

public class examMethod03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 두 수를 키보드로 입력 받아서 합 메소드에 결과값을 받아 출력하기
		int sum=0, n1=0, n2=0;
		
		System.out.print("첫 번째 수 : ");
		n1 = scan.nextInt();
		System.out.print("두 번째 수 : ");
		n2 = scan.nextInt();
		
		sum = sumTwo(n1, n2);
		System.out.print("두 수의 합 : " + sum);

	}

	static int sumTwo(int n1, int n2) {
		return n1+n2;
	}
}
