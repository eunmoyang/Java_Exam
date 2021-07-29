/* [메소드 호출]
 * 기능 : 특정 문자를 횟수만큼 출력하는 메소드 만들기
 * void printCharacter(char ch, int num); 메소드 원형이기 때문에 세미콜론으로 끝냄
 * 
 */
package kr.co.job.func;

public class examMethod01 {

	public static void main(String[] args) {
		printCharacter('*', 3);
		printCharacter('$', 10);
		printCharacter("hello", 10);
		// 이름이 같아도 타입이 달라서 쓸 수 있음 - 다형성
		// printC까지 쓰고 ctrl+space bar 하면 타입별로 메소드 내역 2개 나오고 선택할 수 있음 (private이라서 앞에 아이콘 s=시크릿) 
		
	} // main

	// 특정 문자열을 횟수만큼 출력하는 메소드
	private static void printCharacter(String str, int num) {
		System.out.println("반복 출력 임무 시작");
		for(int i=0; i<num; i++) {
			System.out.print(str);
		}
		System.out.println("\n반복 출력 임무 종료");
	} // pC

	// 특정 문자를 횟수만큼 출력하는 메소드
	private static void printCharacter(char ch, int num) {
		System.out.println("반복 출력 임무 시작");
		for(int i=0; i<num; i++) {
			System.out.print(ch);
		}
		System.out.println("\n반복 출력 임무 종료");
	} // pC

}
