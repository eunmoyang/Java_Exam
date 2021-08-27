/*
 * 함수, 즉 메소드에 대해 이해해보기
 * 메소드 : "하나의" 기능, 행위, 동작
 * 
 * 실제 동작할 때는 (객체 지향에서 클래스에 있는 메소드를 사용할 수 있는 방법) 
 * 1. static(정적)으로 정의되어있을 때 (메모리에 로드/고정됨/import 하지 않아도 쓸 수 있음)
 * 	ex) Math.random();
 * 2. 포함한 클래스가 new 생성되었을 때 (import한 후에 new 생성해서 사용)
 * 	ex) Scanner(클래스 타입) scan(객체명/이름) = new Scanner();
 * 		scan.next();
 * 
 * [리턴이 있는 경우] 동작해서 뭔가 값을 뱉어내는 것
 * f = Math.random(); - mathrandom이 값을 뱉어내면 f에 대입 - 뱉어내는 값이 float이기 때문에 대입 받는 변수의 자료형도 float
 * str = scan.next();
 * 
 * 메소드는 4가지의 종류가 존재
 *    A    메소드명(B)  {}
 * 1)없음(void)   없음
 * 2)없음(void)   있음
 * 3)있음         없음
 * 4)있음         있음(승인/처리된걸 확인하는 용도/밖에서 만든 값을 메인에서 써야할때 리턴받아서 쓰는 용도)  
 * A : 리턴의 타입/유무 (리턴이 없으면 void - 생략 가능)
 * B : 매개변수
 */
package kr.co.job.func;

import java.util.Scanner;

public class SwitchTest02 {
	// 3) Scanner scan = new Scanner(System.in);
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 1;
		boolean done = true; // done이 참이면 실행, 거짓이면 종료
		// isXX(); hasXX(); : true/false
		
		while(done) {
			// 1) 메뉴 출력
			// menuPrint();
			// num = scan.nextInt();
			
			// 2) 메뉴 출력 및 메뉴 입력
			num = menuPrint();
			
				switch(num) {
				case 1: // 두 수의 합
					sumTest();			
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
		
		
		
		
	} 
	
	

	// 조건으로 바로 써먹는 경우 빼고는 리턴값이 무조건 있음
	// 조건으로 바로 써먹는 경우 = is/has 등 true/false가 값인 경우 (조건 확인 후 대입 연산자 없이 넘어갈 수 있음)
	
	private static void sumTest() {
		System.out.println("1입니다. : 두 수의 합");
		int n1=3, n2=5, sum=0;
		sum = n1 + n2;
		System.out.println("합 구하기 끝");
		
	}

	// menuPrint() : 메뉴 출력하는 함수(함수의 쓰임새 정의)
	// 1) private static void menuPrint() { // 메소드 종류 1번 타입 (리턴 타입 없음+매개변수 없음)
	private static int menuPrint() {
	// private : 이 클래스 안에서만 사용 가능
	// public : 누구든지 불러서 사용 가능
		System.out.println("===== [ Menu ] =====");
		System.out.println("1. 2. 3.     99. 종료");
		System.out.println("====================");
		System.out.println("숫자 입력 : ");
		
		return scan.nextInt();
		// 2) 이 경우 돌아가는 타입이 int니까 void를 int로 바꿔줌
		// 근데 scanner를 메인 안에 선언해서 지역(local) 클래스가 됨 -> 메인 밖에다 선언해줌
		// 메인 밖에 뺐더니 static이 아니라서 cannot make a static reference to the non-static 오류 뜸
		// 3) 메인 밖에 뺀 스캐너 앞에 static 달아줌
		
	}

}
