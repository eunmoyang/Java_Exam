package kr.co.job.exercise;

public class review {

	public static void main(String[] args) {
		// 3-2
//		int numberOfApples = 123;
//		int sizeOfBucket = 10;
//		int numOfBucket = (numberOfApples/sizeOfBucket) + ((numberOfApples%sizeOfBucket>1) ? 1 : 0);
//		System.out.println(numOfBucket);
		
		// 3-3
//		int num = 10;
//		System.out.println(num>0 ? "양수" : (num<0 ? "음수" : "0"));
		
		// 3-4
//		int num = 456;
//		System.out.println(num/100*100);
		
		// 3-5
//		int num = 333;
//		System.out.println(num/10*10+1);
		
		// 3-6
//		int num = 24;
//		System.out.println(10 - num%10);
		
		// 3-7
//		int fahrenheit = 100;
//		float celcius = (int)((5f/9 * (fahrenheit-32)) * 100 + 0.5) /100f;
//		
//		System.out.println("Fahrenheit:"+fahrenheit);		
//		System.out.println("Celcius:"+celcius);
		
		// 3-8
//		byte a = 10;
//		byte b = 20;
//		byte c = (byte)(a + b);
//		
//		char ch = 'A';
//		ch = (char)(ch+2);
//		
//		float f = 3/2f;
//		long l = 3000 * 3000 * 3000l;
//		
//		float f2 = 0.1f;
//		double d = 0.1f;
//		
//		boolean result = d==f2;
//		
//		System.out.println("c="+c);
//		System.out.println("ch="+ch);
//		System.out.println("f="+f);
//		System.out.println("l="+l);
//		System.out.println("f2="+f2);
//		System.out.println("d="+d);
//		System.out.println("result="+result);
		
		// 3-9
//		char ch = 'z';
//		boolean b = ch>='a' && ch<='z' || ch>='A' && ch<='Z';
//		System.out.println(b);
		
		// 3-10
//		char ch = 'A';
//		char lowerCase = (ch>='A' && ch<='Z') ? (char)(ch+32) : ch;
//		System.out.println("ch:"+ch);
//		System.out.println("ch to lowerCase:"+lowerCase);
		
		// 4-2
//		int sum = 0;
//		for(int i=1; i<=20; i++) {
//			if(i%2!=0 && i%3!=0) {
//				sum = sum+i;
//			}
//		}
//		System.out.println(sum);
		
		// 4-3
//		int sum = 0;
//		int totalSum = 0;
//		for(int i=1; i<=10; i++) {
//				sum += i;
//				totalSum += sum;
//		}
//		System.out.println(totalSum);
		
		// 4-4
		int sum = 0;
		int i = 0;
		while(sum<100) {
			i++;
			if(i%2==1) {
				sum += i;
			}
			else {
				sum -= i;
			}
		}
		System.out.println("i=" + i + ", sum =" + sum);
	
		// 4-9
//		String str = "12345";
//		int sum = 0;
//		for(int i=0; i<str.length(); i++) {
//			sum += str.charAt(i)-'0';
//		}
//		System.out.println(sum);
	
	}

}
