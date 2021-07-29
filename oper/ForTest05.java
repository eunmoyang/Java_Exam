/*
 * 다양한 for문들
 * 1. 시작값 끝값까지 입력 받아 모든 홀수의 합
 * 2. 1+2+3...+10 = 55 출력해보기
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		// 선언
//		Scanner scan = new Scanner(System.in); // new 스캐너을 생성해라 (사용할 객체 scan)
//		int startValue, lastValue;
//		
//		// 입력
//		System.out.print("시작값 입력 : ");
//		startValue = scan.nextInt();
//				
//		System.out.print("끝값 입력 : ");
//		lastValue = scan.nextInt();
//		
//		// 처리
//		for(int i=startValue; i<=lastValue; i++) { // 초반에는 조건 일단 <=으로 잡고 안 맞으면 +1, -1 붙이기
//			if(i%2 == 1) {  // 홀수 (i를 2로 나눴을 때 나머지가 1과 같다)
////			if(i%2 != 0)    // 홀수 (i를 2로 나눴을 때 나머지가 0과 같지 않다)
//				// 처음부터 안되는 조건을 넣어서 break 걸어버리면 해야되는 것만 실행하면 됨 - else 쓸 필요도 없어짐
//				System.out.print(i + " ");
//			}
//			// 입력 받은 값과 처리하는 값을 철저히 구분하기 (이미 시작값, 끝값을 i한테 줬으니까 이제 i만 신경쓰기)
//		}
//		
//		================================================
		
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum = sum + i;
			System.out.print(i);
				if(i==10) {
					continue;
				}
			System.out.print("+");
		}
		System.out.println("=" + sum);
		
//		================================================
		
//		int sum = 0;
//		
//		for(int i=1; i<=10; i++) {
//			sum = sum + i;
//				if(i!=10) {
//					System.out.print(i + "+");
//				}
//				else {
//					System.out.print(i + "");					
//				}
//		}
//		System.out.println("=" + sum);

//		================================================
		
//		int sum = 0;
//		
//		for(int i=1; i<=10; i++) {
//			sum = sum + i;
//				System.out.print("+");
//					if(i!=10) {
//						System.out.print("+");
//					}
//					else {
//						System.out.print("");					
//					}
//		}
//		System.out.println("=" + sum);
		
		
		
		
		
		
	} // end of main()

}
