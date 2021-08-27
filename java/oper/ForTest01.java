/*
 * 기본적은 for문
 * for(초기값; 조건; 증감치) {
 *     실행문
 * }
 * 순서도 : 1) 초기값 2) 조건 3) 실행문 4) 증감치
 * 2) 조건이 참이면 3) 실행문 실행 - 실행되고 나면 4) 증감치로 가서 증가되거나 감소되고 - 다시 2) 조건으로 가서 반복
 * 조건이 거짓일 때를 만나면 빠져나옴(종료)
 */
package kr.co.job.oper;

public class ForTest01 {

	public static void main(String[] args) {
		// 
//		int i = 0;
//		for(i=1; i<3; i++) {
//			System.out.println("반복변수 i값 : " + i);
//		}
//		System.out.println("for문 종료 후 반복변수 i값 : " + i);
		
//		// i가 1일 때 i가 3보다 작다 -> true -> for문 실행 -> i +1 증가 -> i=2
//		// -> i가 2일 때 i가 3보다 작다 -> true -> for문 실행 -> i +1 증가 -> i=3
//		// -> i가 3일 때 i가 3보다 작다 -> false -> for문 빠져나옴(종료) -> for문 종료 후 반복변수 i값 출력
//		// 해당 부등식으로는 초기값이 "부터", 조건이 "까지"
		
		int i = 0;
		int sum = 0;
		for(i=1; i<=10; i++) { 
			sum = sum + i; // 합을 누적 sum += i
			System.out.println("i=" + i + "일 때 " + "sum = " + sum); // 반복할 때는 for문 안에 실행문 넣어야함
		}
		System.out.println("for문 종료 후 반복변수 i값 : " + i + ", sum = " + sum); // 반복 끝나고 보여줄거면 for문 밖에 실행문
		
		// i가 1일 때 i가 10보다 작거나 같다 -> true -> sum 0+1 = 1 출력 -> i++ -> i=2
		// -> i가 2일 때 i가 10보다 작거나 같다 -> true -> sum 1+2 = 3 출력 -> i++ -> i=3
		// -> i가 3일 때 i가 10보다 작거나 같다 -> true -> sum 3+3 = 6 출력 -> i++ -> i=4
		// -> i가 4일 때 i가 10보다 작거나 같다 -> true -> sum 6+4 = 10 출력 -> i++ -> i=5
		// -> i가 5일 때 i가 10보다 작거나 같다 -> true -> sum 10+5 = 15 출력 -> i++ -> i=6
		// -> i가 6일 때 i가 10보다 작거나 같다 -> true -> sum 15+6 = 21 출력 -> i++ -> i=7
		// -> i가 7일 때 i가 10보다 작거나 같다 -> true -> sum 21+7 = 28 출력 -> i++ -> i=8
		// -> i가 8일 때 i가 10보다 작거나 같다 -> true -> sum 28+8 = 36 출력 -> i++ -> i=9
		// -> i가 9일 때 i가 10보다 작거나 같다 -> true -> sum 36+9 = 45 출력 -> i++ -> i=10
		// -> i가 10일 때 i가 10보다 작거나 같다 -> true -> sum 45+10 = 55 출력 -> i++ -> i=11
		// -> i가 11일 때 i가 10보다 작거나 같다 -> false -> for문 종료 -> for문 종료 후 반복변수 i,sum값 출력
 
	} // end of main()

}
