package jacom.value;

import java.util.Scanner;
import jacom.conn.DBConnect;

public class VarCtrl {

	public static Scanner scan = new Scanner(System.in);
	public static DBConnect dbc = new DBConnect();
	
	// min ~ max 까지 값을 입력 받아 리턴하는 메소드
	public static int inputSel(int min, int max) {
		int sel = 0;
		
		if(min > max) {
			int temp = min; min = max; max = temp;
		}
		
		do {
			System.out.print("[ "+min+" ~ "+max+" ] >> ");
			try {
				sel = Integer.parseInt(scan.next());				
			} catch (Exception e) {
				System.err.println("[Error : 잘못된 입력입니다.]");
			}
		}while(sel < min || sel > max);
		
		return sel;
	}
	
	public static int inputSel() {
		int sel = 0;
		do {
			System.out.print(">>> ");
			try {
				sel = Integer.parseInt(scan.next());				
			} catch (Exception e) {
				System.err.println("[Error : 잘못된 입력입니다.]");
			}
		}while(sel <= 0);		
		return sel;
	}
	
	/*
	 * 
	 */
	public static boolean fbCheck(FreeBoardVO fb) {
		if(fb == null) {
			System.out.println("[입력한 번호의 데이터가 없습니다.]");	
			return true;
		}
			
		return false;
	}
	
	
	/*
	 *  end
	 */
	public void end() {
		scan.close();
	}
	
}
