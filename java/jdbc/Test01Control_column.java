package kr.co.job.jdbc;

import java.util.Scanner;

public class Test01Control_column {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Test01Dao_column dao = new Test01Dao_column();
				
		boolean start = true;
		while(start) {
			int num = dao.printMenu();
			
			switch(num) {
			case 1:
				dao.viewMode();
				break;
			case 2:
				dao.insert();
				break;
			case 3:
				dao.update();
				break;
			case 4:
				dao.delete();
				break;
			case 5:
				dao.close();
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
