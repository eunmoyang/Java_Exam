package kr.co.job;

import java.util.Scanner;

public class projectChp02_1 {
	/*
	자판기 설계하여 구현해보기
	====================[MENU]===================
	1. 동전투입 [0]
	2. 음료수 선택
	   - 1. 사이다(500) 2. 콜라(500) 3.커피(1000) 4.취소
	3. 음료 남은 개수
	4. 반환(거스름돈 주세요)
	99. 자판기 종료(프로그램종료)
	=============================================
	1차원 배열로 작성 : drinkName[3],drinkPrice[3],drinkGa[3] 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String drinkName[] = {"사이다", "콜라", "커피"};
		int drinkPrice[] = {500, 500, 1000};
		int numOfDrink[] = {10, 10, 10};
		boolean powerOn = true;
		boolean admOn = false;
		String admDrinkName[] = {"스프라이트", "펩시", "생수"};
		int num = 0;
		int coin = 0;
		int drinkNo = 0;
		int totalCoin = 0;
		
		
		while(powerOn) {
			System.out.println("=======MENU=======");
			System.out.println("1. 동전 투입\n2. 음료수 선택\n3. 음료 남은 개수\n4. 거스름돈 반환\n99. 자판기 종료");
			System.out.println("==================");
			System.out.println("현재 잔액은 " + totalCoin + "원입니다.");
			System.out.println("가격표 : " + drinkName[0] + "(" + drinkPrice[0] + "원) / " + drinkName[1] + "(" + drinkPrice[1] + "원) / " + drinkName[2] + "(" + drinkPrice[2] + "원)");
			System.out.println("==================");
			System.out.print("번호 입력 : ");
			num = scan.nextInt();
			
			if (num==0) {
				admOn = true;
				while(admOn) {
					System.out.println("=====관리자모드=====");
					System.out.println("1. 음료 이름 변경\n2. 음료 가격 변경\n3. 음료 재고 변경\n4. 종료");
					System.out.println("==================");
					System.out.print("번호 입력 : ");
					int admNo = scan.nextInt();
					if(admNo==1) {
						System.out.println("==================");
						System.out.println("1. " + drinkName[0] + "\n2. " + drinkName[1] + "\n3. " + drinkName[2] + "\n4. 취소");
						System.out.println("==================");
						System.out.print("변경할 음료 선택 : ");
						int admDrinkNo = scan.nextInt();
						if(admDrinkNo==4) {
							System.out.println("취소하셨습니다.");
						}
						else if(admDrinkNo>=1 && admDrinkNo<=3) {
							System.out.println(drinkName[admDrinkNo-1] + "을(를) 무엇으로 변경하시겠습니까?");
							System.out.println("==================");
							System.out.println("1. " + admDrinkName[0] + "\n2. " + admDrinkName[1] + "\n3. " + admDrinkName[2]);
							System.out.println("==================");
							System.out.print("변경될 음료 선택 : ");
							int admDrinkNo2 = scan.nextInt();
							if(admDrinkNo2>=1 && admDrinkNo2<=3) {
								drinkName[admDrinkNo-1] = admDrinkName[admDrinkNo2-1];
								System.out.println("변경되었습니다.");
								System.out.println("출력");
								continue;
							}
							else {
								System.out.println("다시 입력하세요.");
							}
						}
						else {
							System.out.println("다시 입력하세요.");
						}
					}
					else if(admNo==2) {
					
					}
					else if(admNo==3) {
					
					}
					else if(admNo==4) {
						System.out.println("관리자 모드를 종료합니다.");
						admOn = false;
					}
				}
			}




			else if(num==1) {
				System.out.println("==================");
				System.out.print("동전 투입 : ");
				coin = scan.nextInt();
				totalCoin += coin;
			}
			else if(num==2) {
				System.out.println("==================");
				System.out.println("1. 사이다(500원)\n2. 콜라(500원)\n3. 커피(1,000원)\n4. 취소");
				System.out.println("==================");
				System.out.print("음료 번호 선택 : ");
				drinkNo = scan.nextInt();
				if(drinkNo==4) {
					System.out.println("취소하셨습니다.");
				}
				else if(drinkNo==1||drinkNo==2||drinkNo==3) {
					if(totalCoin>=drinkPrice[drinkNo-1]) {
						System.out.println(drinkName[drinkNo-1] + "을(를) 선택하셨습니다.");
						numOfDrink[drinkNo-1] -= 1;
						totalCoin -= drinkPrice[drinkNo-1];
						if(numOfDrink[drinkNo-1]<=0) {
							System.out.println(drinkName[drinkNo-1] + "은(는) 품절입니다.");
						}
					}
					else {
						System.out.println("잔액이 부족합니다.");						
					}
				}
				else {
					System.out.println("다시 입력하세요.");
				}
			}
			else if(num==3) {
				System.out.println("사이다가 " + numOfDrink[0] + "개 남았습니다.");
				System.out.println("콜라가 " + numOfDrink[1] + "개 남았습니다.");
				System.out.println("커피가 " + numOfDrink[2] + "개 남았습니다.");
			}
			else if(num==4) {
				if(totalCoin<=0) {
					System.out.println("거스름돈이 없습니다.");
				}
				else {
					System.out.println("거스름돈 " + totalCoin + "원을 가져가세요.");					
					totalCoin = 0;					
				}	
			}
			else if(num==99) {
			
				if(totalCoin>0) {
					System.out.println("거스름돈을 반환 받으세요.");
				}
				else {
					System.out.println("자판기를 종료합니다.");
					powerOn = false;					
				}
			}
			else {
				System.out.println("다시 입력하세요.");
			}
			
			
		}//while
		
	}//main
	
}//class


