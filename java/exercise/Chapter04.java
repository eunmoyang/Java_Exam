package kr.co.job.exercise;

import java.util.Scanner;

public class Chapter04 {

	public static void main(String[] args) {
		// 4-15. 다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다.
		// 예를 들면 '12321'이나 '13531' 같은 수를 말한다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		// [hint : 나머지 연산자를 이용하시오.]
//		int number = 12321;
//		int tmp = number;
//		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
//		String reverse = "";
//		
//		while(tmp!=0) {
//			result = tmp%10;
//			tmp = tmp/10;
//			reverse = reverse + result;
//			if(tmp==0) {
//				result = Integer.parseInt(reverse);
//				break;
//			}
//		}
//		
//		if(number==result) {
//			System.out.println(number + "는 회문수입니다.");
//		}
//		else {
//			System.out.println(number + "는 회문수가 아닙니다.");
//		}
//		========================================================
		int number = 12321;
		String str = "";
		String str2 = "";
		// number => 문자열로 변경한다. str
		str = Integer.toString(number);
		// 변경한 문자열을 역순으로 저장(대입)한다. str2
		for(int i=str.length()-1; i>=0; i--) {
			str2 += str.charAt(i);
		}
//		System.out.println(str2);
		
		if(str.equals(str2)) {
			System.out.println(number + "는 회문수입니다.");
		}else {
			System.out.println(number + "는 회문수가 아닙니다.");
		}
//		========================================================
//		int number = 12321;
//		String str = "";
//		String str2 = "";
//		
//		str = Integer.toString(number);
//		StringBuffer sb = new StringBuffer(str);
//		str2 = sb.reverse().toString();
//		
//		if(str.equals(str2)) {
//			System.out.println(number + "는 회문수입니다.");
//		}else {
//			System.out.println(number + "는 회문수가 아닙니다.");
//		}
		
		// 4-14. 다음은 숫자 맞추기 게임을 작성한 것이다. 1과 100 사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다.
		// 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다. 
		// 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 안에 숫자를 맞췄는지 알려준다.
		// (1)~(2)에 알맞은 코드를 넣어 프로그램을 완성하시오.
		
		// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
//		int answer = (int)(Math.random()*100)+1;
//		int input = 0; // 사용자 입력을 저장할 공간
//		int count = 0; // 시도 횟수를 세기 위한 변수
//		
//		// 화면으로부터 사용자 입력을 받기 위해서 Scanner 클래스 사용
//		Scanner s = new Scanner(System.in);
//		
//		do {
//			count++;
//			System.out.print("1과 100 사이의 값을 입력하세요 : ");
//			input = s.nextInt(); // 입력 받은 값을 변수 input에 저장한다.
//			if(input>answer) {
//				System.out.println("더 작은 수를 입력하세요 : ");
//			} else if(input<answer) {
//				System.out.println("더 큰 수를 입력하세요 : ");
//			} else {
//				System.out.println("맞혔습니다.\n시도 횟수는 " + count + "번입니다.");
//				break;
//			}
//		}
//		while(true); // 무한 반복문
		// 조건에 1~100 사이가 맞으면 실행문 돌아가는걸로 하면 좀 더 정확함
		
		
		// 4-13. 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		// (실행 결과 : 12o34는 숫자가 아닙니다.)
//		String value = "12o34";
//		char ch = ' ';
//		boolean isNumber = true;
//		
//		//반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
//		for(int i=0; i<value.length(); i++) {
//			ch = value.charAt(i);
//			if(ch-48>=9) {
//				isNumber = false;
//			}
//		}
//		
//		if(isNumber) {
//			System.out.println(value+"는 숫자입니다.");
//		}
//		else {
//			System.out.println(value+"는 숫자가 아닙니다.");
//		}
		
		// 4-12. 구구단의 일부분을 다음과 같이 출력하시오.
		// (실행 결과 : 2~9단까지 3까지만)
//		int result = 0;
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=3; j++) {
//				result = i * j;
//				System.out.println(i + "*" + j + "=" + result);
//			}
//			System.out.println("===============");
//		}
		
		// 4-11. 파보나치(Fibonnaci) 수열은 앞의 두 수를 더해서 다음 수를 만들어 나가는 수열이다.
		// 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21...과 같은 식으로 진행된다.
		// 1과 1부터 시작하는 피보나치 수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오. (실행 결과 : 1,1,2,3,5,8,13,21,34,55)
//		int num1 = 1;
//		int num2 = 1;
//		int num3 = 0;
//		System.out.print(num1 + "," + num2);
//		
//		for(int i=0; i<8; i++) {
//			num3 = num1 + num2;
//			System.out.print("," + num3);
//			num1 = num2;
//			num2 = num3;
//			num3 = num1 + num2;
//		}
		
		// 4-10. int 타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
		// 만일 변수 num의 값이 12345라면, '1+2+3+4+5'의 결과인 15를 출력하라.
		// (1)에 알맞은 코드를 넣으시오. [hint : 문자열을 변환하지 말고 숫자로만 처리해야 한다.] (실행 결과 : 15)
//		int num = 12345;
//		int sum = 0;
//		for(int i=0; i<5; i++) {
//			sum += num%10;
//			num /= 10;
//		}
//		System.out.println("sum=" + sum);
		
		// ======================================= 초기 데이터값 살리기
		
//		int num = 12345;
//		int temp = num;
//		int sum = 0;
//		while(temp!=0) {
//			sum += temp%10;
//			temp /= 10;
//		}
//		System.out.println("num = " + num + "일 때, sum = " + sum);
		
		// 4-9. 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
		// 만일 문자열이 "12345"라면, '1+2+3+4+5'의 결과인 15를 출력해야 한다. (1)에 알맞은 코드를 넣으시오.
		// [hint] String 클래스의 charAt(int i)을 사용 (실행 결과 : 15)
//		String str = "12345";
//		String result = "";
//		int sum = 0;
//		for (int i=0; i<str.length(); i++) {
//			int c = str.charAt(i)-'0';  // 문자열 숫자로 '1' - '0' = 49-48 = 1 // str.charAt(i)-48로 해도 똑같이 나옴
//			sum += c;
//			result = result + (c + "+");
//		}
//		for(int i=0; i<result.length()-1; i++) {
//			System.out.print(result.charAt(i));
//		}
//		System.out.println("=" + sum);
		
		
		// 4-8. 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10이다.
		// (실행 결과 : x=1, y=2 / x=3, y=1 / x=5, y=0)
//		int x = 0;
//		int y = 0;
//		int sum = 0;
//		for(x=0; x<=10; x++) {
//			for(y=0; y<=10; y++) {
//				sum = (2*x) + (4*y);
//				if(sum==10) {
//					System.out.println("x=" + x + ", y=" + y);
//				}
//			}
//		}
//		========================================================
//		for(int x=0; x<=10; x++) {
//			for(int y=0; y<=10; y++) {
//				if((2*x)+(4*y)==10) {
//					System.out.println(x + ", " + y);
//				}
//			}
//		}
		
		// 4-7. Math.random()을 이용해서 1부터 6 사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라.
		// (1)에 알맞은 코드를 넣으시오.
//		int value=(int)(Math.random()*6)+1;
//		System.out.println("value:"+value);
		
		// 4-6. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
//		int dice1 = 0;
//		int dice2 = 0;
//		int sum = 0;
//		for(dice1=1; dice1<=6; dice1++) {
//			for(dice2=1; dice2<=6; dice2++) {
//				sum = dice1+dice2;
//				if(sum==6) {
//					System.out.println(dice1 + " & " + dice2);
//				}
//			}
//		}
//		========================================================상수를 없애주는 작업
//		int dice1 = 0;
//		int dice2 = 0;
//		int sum = 0;
//		int diceSize = 6; // 주사위 눈의 개수
//		int result = 6;	  // 구하고자 하는 합
//		for(dice1=1; dice1<=diceSize; dice1++) {
//			for(dice2=1; dice2<=diceSize; dice2++) {
//				sum = dice1+dice2;
//				if(sum==result) {
//					System.out.println(dice1 + " & " + dice2);
//				}
//			}
//		}
		
		// 4-5. 다음의 for문을 while문으로 변경하시오.
		// for(int=0; i<=10; i++) {
		//for(int j=0; j<=i; j++) 
		//System.out.println("*");
		//System.out.println();
		//}
		
//		int i=0;
//		int j=0;
//		while(i<=10) {
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//			j=0;
//		}
		
		// 4-4. 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
//		int sum = 0;
//		int i = 1;
//		boolean done = true;
//		while(done) {
//			sum += i;
//			i = ++i*-1;
//			sum += i;
//			i--;
//			i = i*-1;
//			sum += i;
//			if(sum>=100) {
//				System.out.println("=" + sum);
//				done = false;
//			}
//		}
//		======================================================================================정답
//		int sum = 0;
//		int i = 0;
//		
//		while(sum<100) {
//			if(i%2==1) {
//				sum += i;
//			}
//			else {
//				sum -= i;
//			}
//			i++;
//		}
//		System.out.println("i=" + i + ", sum=" + sum);
//		// 근데 이렇게 하면 처리 후 i가 증가해서 200으로 나옴 -> 증가 후 처리하면 됨
//		======================================================================================
//		int sum = 0;
//		int i = 0;
//		int s = -1;
//		for(i=1; true; i++) {
//			sum = sum + i * (s * (-1));
//			if(sum>100) {
//				break;
//			}
//		}
//		System.out.println("i=" + i + ", sum=" + sum);
//		======================================================================================
//		int sum = 0;
//		int i = 0;
//		while(sum<100) {
//			i++;
//			if(i%2==1) {		 // i가 홀수라면 +
//				sum += i; 
//			}
//			else {				 // i가 짝수라면 -
//				sum -= i;
//			}
//		}
//		System.out.println("i=" + i + ", sum=" + sum);
		
		// 4-3. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
//		"1"+"+2" => "1+2"
//		int sum = 0;
//		String str = "";
//		for(int i=1; i<=10; i++) {
////			System.out.print("(");
//			str += "(";
//			for(int j=1; j<=i; j++) {
//				sum += j;
//				if(i==j) {
//					str = str + (j);
//				}					
//				else { 
//					str = str + (j + "+");
//				}
////				System.out.print(str);
//			}
////			System.out.print(")+");
//			str += ")+";
//		}
		
//		str = str.substring(0, str.length()-1);
////		for(int i=0; i<str.length()-1;i++) {
////			System.out.print(str.charAt(i));
////		}
//		System.out.println(str + "=" + sum);
		
//		==================================================정답
//		int sum = 0;
//		int totalSum = 0; 		 
//		for(int i=1; i<=9; i++) {
//			sum += i; 				// 각각의 sum을 누적시켜서
//			totalSum += sum;		// totalSum에 누적
//		}
//		System.out.println("sum=" + sum + ", totalSum=" + totalSum);
		
		// 4-2. 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
//		int sum = 0;
//		for(int i=1; i<=20; i++) { 
//			if(i%2!=0 && i%3!=0) { // !(i%2==0 || i%3==0)
//				sum += i;
//			}
//		}
//		System.out.println("Total sum : " + sum);
		
		// =================================
		
//		int sum = 0;
//		String str = "";
//		for(int i=1; i<=20; i++) {
//			if(i%2!=0 && i%3!=0) {
//				sum += i;
//				str = str +(i +"+");
//				System.out.println(str);
//			}
//		}
//		for(int i=0; i<str.length()-1;i++) {
//			System.out.print(str.charAt(i));
//		}
//		System.out.println("=" + sum);
		
		// 4-1. 다음의 문장들을 조건식으로 표현하라.
		// 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
//		x>10 && x<20
		
		// 2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
//		ch!=' ' && ch!='\t' // 내꺼 (이것도 맞음)
//		!(ch==' ' || ch=='\t') // 정답
		
		//==================================
		
//		String name = "";
//		System.out.println("문자열 입력 : ");
//		name = scan.nextLine();
//		if(!name.equals("홍길동")) {
//			System.out.println("통과");
//		}
//		else {
//			System.out.println("탈락");
//		}
		
		// 3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
//		ch=='x' || ch=='X' ? "true" : "false"
		
		// 4. char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
//		ch>'0' && ch<'9'
		
		// 5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
//		ch>='a' && ch<='z' || ch>='A' && ch<='Z'
		
		// 6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식
//		year%400==0 || year%4==0 && year%100!=0
		
		// 7. boolean형 변수 powerOn가 false일 때 true인 조건식
//		powerOn==false
//		!powerOn
		
		// 8. 문자열 참조변수 str이 "yes"일 때 true인 조건식
//		str=="yes"
// 		str.equals("yes"), "yes".equals(str) // 함수 이후에는 equlas 쓰는 연습

	}

}
