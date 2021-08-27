/*
 * 두 수를 입력 받아서 더하기, 빼기, 곱하기, 나누기를 구하는 메소드 만들기
 * void plusV(int i, int j);
 * minusV(), mulV(), divV() ==> 메소드 이름
 */
package kr.co.job.func;

public class examMethod02 {
	// 클래스(생성자) = 변수(속성) + 함수(기능/메소드)
	// scan. 해서 메소드 쭉 나왔을 때 object라고 돼있는건 대빵이라서 어떤 클래스에서든 쓸 수 있음

	public static void main(String[] args) {
		// 3,5의 합 구하기
		// 1) plusV(3, 5);
		int sum = plusV(3, 5);
		System.out.println("3과 5의 합 : " + sum);
		// 3,10의 뺄셈
		int result = minusV(3, 10);
		System.out.println("3과 10의 뺄셈 : " + result);
		// 5,4의 곱셈
		int result2 = mulV(5, 4);
		System.out.println("5와 4의 곱셈 : " + result2);
		// 2,8의 나눗셈
		int result3 = divV(2, 8);
		System.out.println("2과 8의 나눗셈 : " + result3);
	}

	// 1) private static void plusV(int i, int j) { 
	private static int plusV(int i, int j) {
		// 1) System.out.println(i+j);
		return i+j;
	}

	private static int minusV(int i, int j) {
		return i-j;
	}

	private static int mulV(int i, int j) {
		return i*j;
	}

	private static int divV(int i, int j) {
		return i/j;
	}

	

}
