package kr.co.job.thread;

public class MultiThreadTest {

	public static void main(String[] args) {
		DigitThread t1 = new DigitThread();
		DigitThread t2 = new DigitThread();
		
		t1.start(); // 스레드 : 독립적으로 실행됨
		t2.start();
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
		}
		
		DigitThread2 obj = new DigitThread2();
		Thread t3 = new Thread(obj); // obj를 t3 인스턴스화
		t3.start();

	}

}
