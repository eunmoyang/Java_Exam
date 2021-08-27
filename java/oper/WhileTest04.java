/*
 * while문과 Math.random() 메소드를 이용
 * 1~6의 눈을 갖는 두개의 주사위를 던졌을 때
 * 주사의 눈의 값을 (1주사위눈, 2주사위눈) 형태로 출력하고
 * 두개의 눈이 서로 다른 값이면 계속 주사위를 던지고
 * 두개의 눈이 같으면 멈추는 코드를 작성
 */
package kr.co.job.oper;

public class WhileTest04 {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		boolean done = true;
		
		while(done) {
			num1 = (int)(Math.random()*6)+1;
			num2 = (int)(Math.random()*6)+1;
			System.out.println(num1 + "주사위눈 & " + num2 + "주사위눈");
			if(num1==num2) {
				System.out.println(num1 + "주사위눈 & " + num2 + "주사위눈 => 값이 같아 종료합니다.");
				break;
			}
		}
		

	}

}
