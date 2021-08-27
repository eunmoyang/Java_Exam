package kr.co.job.oper;

import java.util.Scanner;

public class SwitchTest01 {

	public static void main(String[] args) {
		
		int num = 1;
		Scanner scan = new Scanner(System.in);
		boolean done = true; // done이 참이면 실행, 거짓이면 종료
		// isXX(); hasXX(); : true/false
		
		while(done) {
			System.out.println("===== [ Menu ] =====");
			System.out.println("1. 2. 3.     99. 종료");
			System.out.println("====================");
			System.out.println("숫자 입력 : ");
			num = scan.nextInt();
			
				switch(num) {
				case 1:
					System.out.println("1입니다.");
					break;
				case 2:
					System.out.println("2입니다.");				
					break;
				case 3:
					System.out.println("3입니다.");
					break;
				case 99:
					System.out.println("반복을 종료합니다.");
					done = false;
					break;
				default : // 위의 경우를 제외한 나머지 모두
					System.out.println("???");
				}
		}
		
		
		
		
	} //

}
