package kr.co.job.tcp;

public class MethodTest01 {

	public static void main(String[] args) {
		// 33) 재귀호출
		int result = recursiveSum(4);
		System.out.println(result);

	}
	
	static int recursiveSum(int n) {
	    if (n == 1) {                 // n이 1이면, 그냥 1을 반환함.
	        return 1;
	    }
	    return n + recursiveSum(n-1); // n이 1이 아니면, n을 1부터 (n-1)까지의 합과 더한 값을 반환함.

	}

}
