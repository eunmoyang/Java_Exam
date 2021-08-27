/*
 * 자료형 선언, 출력
 */
package kr.co.job;

public class BasicTest04 {

	public static void main(String[] args) {
		
		// boolean done 까지 선언
		// done = true; 가 초기화
		boolean done = true;  // 논리형 true로 초기화
		int num = 11;
		int result = 0;
		
		// num을 3으로 나눈 나머지를 구하세요.
		result = num % 3;
		System.out.println(result);
		
		result = num % 5;
		System.out.println(result);
		
		System.out.println("num : " + num);
		System.out.println("num++ => " + num++);  // ++이 뒤에 있으면 출력하고 나서 계산(후취)
		System.out.println("++num => " + ++num);  // ++이 앞에 있으면 계산하고 나서 출력(전취)
		// 증가 연산자 num = num + 1;
		
		System.out.println(done);
		
		done = false;
		System.out.println(done);
		
		if(!done) {// ! 아니라면, == 같다, != 같지 않다
			System.out.println("여기임 1번 구역");
		}
		else {
			System.out.println("저기임 2번 구역");
		}
		// if문에서 소괄호 안의 값(조건)이 true면 중괄호 실행 / false면 else문의 중괄호 실행
		
		System.out.println("========경계선=======");
		
		done = true;
		
		if(done) {
			System.out.println("여기임 1번 구역");
		}
		else {
			System.out.println("저기임 2번 구역");
		}
		
		
	}
		

}
