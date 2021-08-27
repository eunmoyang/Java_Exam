package kr.co.job.oper;

public class WhileTest02 {

	public static void main(String[] args) {
		// 1부터 10까지 합
		int i = 1;
		int sum = 0;
		
		while(true) {
			sum += i;
			i++;
			if(i>10) {
				break;
			}
		}
		System.out.println("sum = " + sum);
		
//		for(i=1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println("sum = " + sum);

	}

}
