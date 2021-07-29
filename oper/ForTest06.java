package kr.co.job.oper;

public class ForTest06 {

	public static void main(String[] args) {
		System.out.println("===== 줄칸 또는 행열에 대하여 =====");
		for(int i=1; i<=4; i++) { // i가 1부터 4까지 *을 한 줄씩 출력
			
			for(int j=1; j<=i; j++) { // j는 1부터 i가 끝날 때까지 *을 한 칸(개수)씩 출력
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 난수 발생 : Math.random() - 0~0.9999의 임의의 수를 하나 발생시킴
		// 자주 쓰는 클래스들은 import 안 해도 이미 메모리에 올라와있어서 (내장되어있어서) new 생성 안해도 됨
		// 원래 객체 지향은 new 해서 불러들여서 쓰는게 기본 방식임
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		
		int num = 0;
//		num = Math.random()*10; // Math.random()이 double이라서 type mismatch
		num = (int)(Math.random()*10); // 0부터 9까지의 수 발생
		System.out.println(num);
		
		// 1부터 10 사이의 수 발생
		num = (int)(Math.random()*10) +1;
		System.out.println(num);
		
		// 1부터 45 사이의 수 발생
//		for(int i=1; i<=45; i++) {
//			num = (int)(Math.random()*10);			
//		}
//		System.out.println(num);

		num = (int)(Math.random()*45) + 1;
		System.out.println(num);
		
		// 11부터 13 사이의 수 발생
		for(int i=11; i<=13; i++) {
			num = (int)(Math.random()*3) +11;
			// (int)(Math.random() * 경우의 수/개수/범위)) + 0부터 시작하니까 11부터 시작하기 위해 +11
			System.out.println(num);
		}
		
		
		
	}

}
