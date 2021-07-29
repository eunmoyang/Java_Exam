package kr.co.job.oper;

import java.util.Scanner;

public class ForTest04 {

	public static void main(String[] args) {
		// 단수를 입력 받아서 해당 단을 출력하세요.
		int dan = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("구할 단 입력 : ");
		dan = scan.nextInt();
				
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}

	}

}
