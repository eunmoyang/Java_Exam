package kr.co.job.jdbc;

import java.util.Scanner;

public class Test01Control_list {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Test01Dao_list dao = new Test01Dao_list();
				
		boolean start = true;
		while(start) {
			int num = dao.printMenu();
			
			switch(num) {
			case 1:
				dao.ViewMode();
				break;
			case 2:
				dao.Insert();
				break;
			case 3:
				dao.Update();
				break;
			case 4:
				dao.Delete();
				break;
			case 5:
				dao.Close();
				scan.close();
				System.out.println("Completly exited!");
				start = false;
				break;
			default:
				System.out.println("Invalid input, please try again.");
			}
		}

	}

}
