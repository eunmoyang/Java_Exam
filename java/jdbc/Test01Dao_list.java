package kr.co.job.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01Dao_list {
	Scanner scan = new Scanner(System.in);

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	int result;
	Test01_list t;
	List<Test01_list> tmp;
	List<Test01_list> delList;

	public Test01Dao_list() { // constructor
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/jdbctest?serverTimezone=UTC";
			String id = "root";
			String pw = "123456";

			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("Connected!");
			
			delList = new ArrayList<Test01_list>();
						
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
	
	public void ViewMode() {
		System.out.println("======================VIEW MENU======================");
		System.out.println("1. View all 2. Search by No. 3. Deleted list 4. Exit");
		System.out.print("Select number : ");
		int num = Integer.parseInt(scan.next());
		
		switch(num) {
		case 1:
			ViewAll();
			break;
		case 2:
			Search();
			break;
		case 3:
			DelList();
			break;
		case 4:
			System.out.println("Exit View Mode");
			break;
		default:
			System.out.println("Invalid input, please try again.");
		}
	}
	
	public void ViewAll() {
		String sql = "SELECT * FROM test01";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			tmp = new ArrayList<Test01_list>();
			while (rs.next()) {
				tmp.add(new Test01_list(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
			}
			
			for (Test01_list t : tmp) {
				System.out.println(t);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void Search() {
		System.out.print("* Enter the No. to search : ");
		int tno = Integer.parseInt(scan.next());
		String sql = "SELECT * FROM test01 where tno=?";
	
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, tno);
			rs = pstmt.executeQuery();
	
			if (rs.next()) {
				System.out.println("Results found : ");
				t = new Test01_list(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
				ListingAndShow(t);
			} else {
				System.out.println("No results for the No. you entered :(");
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void DelList() {
		for (Test01_list t : delList) {
			System.out.println(t);
		}
	}

	public void Insert() {
		t = Enter(1);
		String sql = "INSERT INTO test01(pname,age,etc,tno) values(?,?,?,?)";
	
		Set(t, sql);
	}

	public void Update() {
		t = Enter(2);
		String sql = "UPDATE test01 SET pname=?, age=?, etc=? where tno=?";
	
		Set(t, sql);
	}

	public void Delete() {
		ViewAll();
		System.out.print("* Enter the No. to delete : ");
		int tno = Integer.parseInt(scan.next());
		SaveDel(tno);
	
		String sql = "DELETE FROM test01 where tno=?";
	
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, tno);
			result = pstmt.executeUpdate();
	
			if (result == 0) {
				System.out.println("Deletion Failed :(");
			} else {
				System.out.println("Deletion Succeded :)");
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public void Close() {
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

	public Test01_list Enter(int check) { // insert, update
		ViewAll();
		System.out.println("===========================================");
	
		if (check == 1) {
			System.out.println("* Enter the informations below to insert : ");
		} else if (check == 2) {
			System.out.println("* Enter the informations below to update : ");
		}
	
		System.out.print("No. : ");
		int tno = Integer.parseInt(scan.next());
		System.out.print("Name : ");
		String pname = scan.next();
		System.out.print("Age : ");
		int age = Integer.parseInt(scan.next());
		System.out.print("Remarks : ");
		String etc = scan.next();
	
		t = new Test01_list(tno, pname, age, etc);
	
		return t;
	}

	public void Set(Test01_list t, String sql) { // insert, update
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
				System.out.println("Succeded :)");
				ListingAndShow(t);
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public void ListingAndShow(Test01_list t) { // insert, update
		tmp = new ArrayList<Test01_list>();
		tmp.add(t);

		for (Test01_list tt : tmp) {
			System.out.println(tt);
		}
	}

	public void SaveDel(int tno) {
		String sql = "SELECT * FROM test01 where tno=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, tno);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				t = new Test01_list(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
				System.out.println("The information below will be deleted : ");
				System.out.println(t);
				delList.add(t);
			} else {
				System.out.println("No results for the No. you entered :(");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

} // eoc
