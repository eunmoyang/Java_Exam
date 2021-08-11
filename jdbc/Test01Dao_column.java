package kr.co.job.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01Dao_column {
	Scanner scan = new Scanner(System.in);

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	int result;
	Test01_column t;
	Test01_column check;
	List<Test01_column> tmp;

	public Test01Dao_column() { // constructor
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/jdbctest?serverTimezone=UTC";
			String id = "root";
			String pw = "123456";

			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("Database connected!");
						
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public int printMenu() {
		System.out.println("=====================MENU=====================");
		System.out.println("1. View 2. Insert 3. Update 4. Delete 5. Exit");
		System.out.print("Select number : ");
		int num = Integer.parseInt(scan.next());
		
		return num;
	}
	
	public void viewMode() {
		System.out.println("======================VIEW MENU======================");
		System.out.println("1. View all 2. Search by No. 3. Deleted list 4. Exit");
		System.out.print("Select number : ");
		int num = Integer.parseInt(scan.next());
		
		switch(num) {
		case 1:
			viewAll();
			break;
		case 2:
			search();
			break;
		case 3:
			viewDelList();
			break;
		case 4:
			System.out.println("Exit View Mode");
			break;
		default:
			System.out.println("Invalid input, please try again.");
		}
	}
	
	public void viewAll() {
		String sql = "SELECT * FROM test01 where del=?";
		viewMulti(sql, 0);
	}
	
	public void search() {
		System.out.print("Enter the No. to search : ");
		int tno = Integer.parseInt(scan.next());
		
		String sql = "SELECT * FROM test01 where tno=? and del=0";
		viewSpecific(sql, tno);
	}
	
	public void viewDelList() {
		String sql = "SELECT * FROM test01 where del=?";
		viewMulti(sql, 1);
	}
	
	public void viewSpecific(String sql, int tno) { // search
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, tno);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				t = new Test01_column(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5));
				listingAndShow(t);
			} else {
				System.out.println("No results were found.");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void viewMulti(String sql, int del) { // viewAll, delList
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, del);
			rs = pstmt.executeQuery();
			
			tmp = new ArrayList<Test01_column>();
			while (rs.next()) {
				tmp.add(new Test01_column(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5)));
			}
			
			for (Test01_column t : tmp) {
				System.out.println(t);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Test01_column checkAvailability(int tno) {
		try {
			String sql = "SELECT * FROM test01 where tno=? and del=0";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, tno);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				check = new Test01_column(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5));	
			} else {
				check = new Test01_column();
				check.setTno(99);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return check;
	}
	
	public Test01_column searchInsert(int tno) {
		try {
			String sql = "SELECT * FROM test01 where tno=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, tno);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				check = new Test01_column(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5));	
			} else {
				check = new Test01_column();
				check.setTno(99);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return check;
	}

	public void insert() {
		t = input(1);
		check = searchInsert(t.getTno());
		
		if(check.getTno()!=99) {
			if(check.getDel()==1) {
				System.out.println("Deleted number, please try another number.");
			} else if(check.getDel()==0) {
				System.out.println("Number in use, please try another number.");				
			}
		} else {
			String sql = "INSERT INTO test01(pname,age,etc,del,tno) values(?,?,?,0,?)";
			set(t, sql);
		}
	
	}

	public void update() {
		t = input(2);
		check = checkAvailability(t.getTno());
		
		if(check.getTno()!=99) {
			String sql = "UPDATE test01 SET pname=?, age=?, etc=?, del=0 where tno=?";
			set(t, sql);
		} else {
			System.out.println("Number not exists, please try existed number.");
		}
	}

	public void delete(){
		viewAll();
		System.out.print("Enter tno to delete : ");
		int tno = Integer.parseInt(scan.next());
		
		check = checkAvailability(tno);
		// delete 해서 없는 번호 입력했기 때문에 check를 true로 받았는데 else문으로 안 가고 if문으로 가서 오류 발생
		
		if(check.getTno()!=99) {
			String sql = "UPDATE test01 SET del=1 where tno=?";
			delUpdate(sql, tno);
		} else {
			System.out.println("Number not exists, please try existed number.");
		}
		
	}

	private void delUpdate(String sql, int tno) { // delete
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, tno);
			result = pstmt.executeUpdate();
			
			if (result == 0) {
				System.out.println("Failed :(");
			} else {
				System.out.println("Completed!");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void close() {
		try {
			if(conn!=null && !conn.isClosed()) {
				conn.close();
			} 
			if(pstmt!=null && !pstmt.isClosed()) {
				pstmt.close();
			} 
			if(rs!=null && !rs.isClosed()) {
				rs.close();
			} 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Test01_column input(int check) { // insert, update
		viewAll();
		System.out.println("===========================================");
	
		if (check == 1) {
			System.out.println("* Enter the information below to insert : ");
		} else if (check == 2) {
			System.out.println("* Enter the information below to update : ");
		}
	
		System.out.print("No. : ");
		int tno = Integer.parseInt(scan.next());
		System.out.print("Name : ");
		String pname = scan.next();
		System.out.print("Age : ");
		int age = Integer.parseInt(scan.next());
		System.out.print("Remarks : ");
		String etc = scan.next();
	
		t = new Test01_column(tno, pname, age, etc, 0);
	
		return t;
	}

	public void set(Test01_column t, String sql) { // insert, update
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, t.getPname());
			pstmt.setInt(2, t.getAge());
			pstmt.setString(3, t.getEtc());
			pstmt.setInt(4, t.getTno());
			result = pstmt.executeUpdate();
	
			if (result == 0) {
				System.out.println("Failed :(");
			} else {
				System.out.println("Completed!");
				listingAndShow(t);
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	

	public void listingAndShow(Test01_column t) { // insert, update
		tmp = new ArrayList<Test01_column>();
		tmp.add(t);

		for (Test01_column tt : tmp) {
			System.out.println(tt);
		}
	}


} // eoc
