package kr.co.job.exercise;

public class Chapter03 {

	public static void main(String[] args) {
		// 3-10 다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다.
		// 문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를 들어 'A'의 코드는 65이고 'a'의 코드는 97이다.
		// 알맞은 코드를 넣으시오. (실행 결과 : ch:A / ch to lowerCase:a)
//		char ch = 'A';
//		
//		char lowerCase = ch >= 'A' && ch <= 'Z' ? (char)(ch + 32) : ch;
//		
//		System.out.println("ch:"+ch);
//		System.out.println("ch to lowerCase:"+lowerCase);
		
		// 3-9 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드이다.
		// 알맞은 코드를 넣으시오. (실행 결과 : true)
//		char ch = 'z';
//		boolean b = true;
		// if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= 0) { // 내꺼
//			if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') { // 정답
		//     ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122 || ch >= 48 && ch <= 57 이렇게 써도 처리됨
		// 밑에 안 써줘도 됨
//				b = true;
//				System.out.println(b);
//			}
//			else {
//				b = false;
//				System.out.println(b);
//			}
		
		// 3-8 아래 코드의 문제점을 수정해서 실행 결과와 같은 결과를 얻도록 하시오.
		// 실행 결과 :	
		// c=30
		// ch=C
		// f=1.5
		// l=27000000000
		// result=true
		
//		byte a = 10; // 1byte = 8bit (0~255) // 아스키 코드 7bit (0~127)
//		byte b = 20;
//		byte c = (byte)(a + b);
//		
//		char ch = 'A';
//		ch = (char)(ch + 2); // 형변환 = 캐스트 연산자
//		
//		float f = 3f / 2;
//		long l = 3000 * 3000 * 3000L;
//		
//		float f2 = 0.1f;
//		double d = 0.1f; // 내꺼
//		double d = 0.1; // 정답
//		
//		boolean result = d==f2;
//		
//		System.out.println("c="+c);
//		System.out.println("ch="+ch);
//		System.out.println("f="+f);
//		System.out.println("l="+l);
//		System.out.println("result="+result);
		
		// 3-7 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
		// 변환 공식이 'C = 5/9 x (F -32)'라고 할 때, 알맞은 코드를 넣으시오.
		// 단, 변환 결과값은 소수점 셋 째 자리에서 반올림 해야 한다. (Math.round()를 사용하지 않고 처리할 것)
		// (실행 결과 : Fahrenheit 100, Celcius 37.78)
//		int fahrenheit = 100;		
//		float celcius = (int)(float)5/9*(fahrenheit-32) * 1000/ 1000f; // 내꺼
//		float celcius = (int)((5/9f*(fahrenheit-32)) * 100 + 0.5) / 100f; // 정답 (결국 자릿수 버리기 개념)
//				
//		System.out.println("Fahrenheit:" + fahrenheit);
//		System.out.println("Celcius:" + celcius);
		
		// 3-6 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드이다.
		// 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이다. 19의 경우 20이고, 81의 경우 90이 된다.
		// 30에서 24를 뺀 나머지가 6이기 때문에 변수 num의 값이 24라면 6을 결과로 얻어야 한다. 
		// 알맞은 코드를 넣으시오. (실행 결과 : 6) [힌트 : 나머지 연산자를 사용하라.]
//		int num = 24;
//		System.out.println(10 - num%10);
		
		// 3-5 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 
		// 만일 변수 num의 값이 333이라면 331이 되고, 777이라면 771이 된다. 
		// 알맞은 코드를 넣으시오. (실행 결과 : 331)
//		int num = 333;
//		System.out.println(num/10*10+1); // 십의 자리 수로 나눠서 십의 자리만 남기고 일의 자리를 바꿔줌
		
		// 3-4 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다.
		// 만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다. 
		// 알맞은 코드를 넣으시오. (실행 결과 : 400)
//		int num = 456;
//		System.out.println(num/100*100); // 백의 자리 수로 나눠서 백의 자리만 남김
		
		// 3-3 아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다.
		// 삼항 연산자를 이용해서 알맞은 코드를 넣으시오. (실행 결과 : [힌트 : 삼항 연산자를 2번 사용하라.]
//		int num = 10;
//		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));
		
		// 3-2 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
		// 만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다.
		// 알맞는 코드를 넣으시오. (실행 결과 : 13)
//		int numOfApples = 123; // 사과의 개수
//		int sizeOfBucket = 10; // 바구니의 크기 (바구니에 사과를 담을 수 있는 사과의 개수)
//		int numOfBucket = 0; // 모든 사과를 담는데 필요한 바구니의 수
//		
//		System.out.println("필요한 바구니의 수 : " +(numOfApples%sizeOfBucket > 0 ? (numOfApples/sizeOfBucket)+1 : "")); // 내꺼
		// numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0); // 정답 (더 간단하게 쓸 수 있음)
		// 삼항 연산자 대신 if 써도 됨 (if 쓸 때는 else 필요한지 고민해보기)
		// ====================================================
//		if(numOfApples%sizeOfBucket > 0) {
//			numOfBucket = (numOfApples/sizeOfBucket)+1;
//		}
//		System.out.println("필요한 바구니의 수 : " + numOfBucket);
		
		// 3-1 다음 연산의 결과를 적으시오.
//		int x = 2;
//		int y = 5;
//		char c = 'A'; // 'A'의 문자 코드는 65
//		
//		System.out.println(1 + x << 33);
//		System.out.println(y >= 5 || x < 0 && x > 2); 	// true		(&& || 중 &&가 우선순위 / && : 둘 다 true 여야 true / || : 하나만 true여도 true)
//		System.out.println(y += 10 - x++); 				// 13 		(y = (y + 10) - x++ = 15-2 = 13 (x++은 출력 후 계산되어 3))
//		System.out.println(x += 2); 					// 5 	 	(x = x+2 = 3+2 = 5)
//		System.out.println(!('A' <= c && c <= 'z')); 	// false	(z = 122, !(true && true) = false)
//		System.out.println('C'-c); 						// 2 		(C 아스키 코드 = 67 / 67-65 = 2)
//		System.out.println('5'-'0'); 					// 5 		(문자를 정수로 바꿀 때 / 53-48 = 5)
//		System.out.println(c+1); 						// 66 		("문자에 산술 연산자가 들어오면 무조건 숫자로 본다" 65+1 = 66)
//		System.out.println(++c); 						// B 		("문자 자기 자체를 증가시키면 기본 타입 그대로" // 전처리 ++A = B)
//		System.out.println(c++); 						// B 		(A++ = B 후처리)
//		System.out.println(c); 							// C 		(윗 문장 출력 후 계산되어 B 증가 = C)
		
	}
	
}
