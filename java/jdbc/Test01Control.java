package kr.co.job.jdbc;

import java.util.List;
import java.util.Scanner;

public class Test01Control {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		Test01DaoImpl impl = new Test01DaoImpl();
		boolean start = true;
		
		while(start) {
			System.out.println("==============================MENU==============================");
			System.out.println("1. listAll 2. SelectOne 3. Insert 4. Update 5. Delete 6. Exit");
			System.out.println("================================================================");
			System.out.print("Select number : ");
			int num = Integer.parseInt(scan.next());
			
			switch(num) {
			case 1:
				List<Test01VO> list = impl.listAll();
				break;
			case 2:
				System.out.print("Enter tno to see : ");
				int tno = Integer.parseInt(scan.next());
				Test01VO tvo2 = impl.selectOne(tno);
				break;
			case 3:
				System.out.print("Enter pname : ");
				String pname3 = scan.next();
				System.out.print("Enter age : ");
				int age3 = Integer.parseInt(scan.next());
				System.out.print("Enter etc : ");
				String etc3 = scan.next();
				Test01VO tvo3 = new Test01VO(pname3, age3, etc3);
				int insert = impl.insert(tvo3);
				break;
			case 4:
				impl.listAll();
				System.out.print("Enter tno to update : ");
				int tno4 = Integer.parseInt(scan.next());
				System.out.print("Enter pname : ");
				String pname4 = scan.next();
				System.out.print("Enter age : ");
				int age4 = Integer.parseInt(scan.next());
				System.out.print("Enter etc : ");
				String etc4 = scan.next();
				Test01VO tvo4 = new Test01VO(tno4, pname4, age4, etc4);
				int update = impl.update(tvo4);
				break;
			case 5:
				impl.listAll();
				System.out.print("Enter tno to delete : ");
				int tno5 = Integer.parseInt(scan.next());
				int delete = impl.delete(tno5);
				break;
			case 6:
				System.out.println("Exit the program");
				impl.close();
				start = false;
				break;
			default:
				System.out.println("Please choose from the numbers on the menu.");
				
			}
		}
				
		

	}

}
