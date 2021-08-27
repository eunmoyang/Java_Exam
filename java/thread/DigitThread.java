package kr.co.job.thread;

public class DigitThread extends Thread {
	/*
	 * 0~9까지 숫자 출력하는 스레드 : Thread 클래스 확장
	 */
	public void run() {
		System.out.println("스레드 시작합니다.");
		for(int cnt=0; cnt<10; cnt++) {
			System.out.println(cnt);
		}
//		printDigit();
	}

//	private void printDigit() {
//		for(int cnt=0; cnt<10; cnt++) {
//			System.out.println(cnt);
//		}
//		
//	}

}
