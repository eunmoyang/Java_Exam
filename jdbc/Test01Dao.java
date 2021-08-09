package kr.co.job.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01Dao {
	Scanner scan = new Scanner(System.in);
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	int result;
	Test01 t;
	List<Test01> list;
	List<Test01> delList;
	
	public Test01Dao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/jdbctest?serverTimezone=UTC";
			String id = "root";
			String pw = "123456";
			
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("Connected!");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void SelectAll() {
		String sql = "SELECT * FROM test01";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ListingAndShow();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Select(int tno, String check) {
		String sql = "SELECT * FROM test01 where tno=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, tno);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				if(check=="list") {
					ListingAndShow();
				} else if(check=="del") {
					DelListingAndShow();
				}
			} else {
				System.out.println("No results for the No. you entered :(");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void ListingAndShow() {
		try {
			list = new ArrayList<Test01>();

			while (rs.next()) {
				list.add(new Test01(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
			}
			
			for(Test01 t:list) {
				System.out.println(t);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void DelListingAndShow() {
		try {
			delList = new ArrayList<Test01>();

			while (rs.next()) {
				delList.add(new Test01(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
			}
			
			for(Test01 t:delList) {
				System.out.println(t);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public Test01 EnterAll(int check) {
		SelectAll();
		System.out.println("===========================================");
		
		if(check==1) {
			System.out.println("* Enter the informations below to insert : ");
		} else if(check==2) {
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
		
		t = new Test01(tno, pname, age, etc);
		
		return t;
	}
	
	public int EnterNo(int check) {
		SelectAll();
		
		if(check==3) {
			System.out.println("* Enter the No. to delete : ");
		} else if(check==4) {
			System.out.print("* Enter the No. to search : ");
		}
		
		int tno = Integer.parseInt(scan.next());
		
		return tno;
		
	}
	
	public void Set(Test01 t, String sql) {
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, t.getPname());
			pstmt.setInt(2, t.getAge());
			pstmt.setString(3, t.getEtc());
			pstmt.setInt(4, t.getTno());
			result = pstmt.executeUpdate();
			
			if(result==0) {
				System.out.println("Failed");
			} else {
				System.out.println("Succeded");
				int tno = t.getTno();
				Select(tno, "list");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void Insert() {
		t = EnterAll(1);
		String sql = "INSERT INTO test01(pname,age,etc,tno) values(?,?,?,?)";
		
		Set(t, sql);
		
	}
	
	public void Update() {
		t = EnterAll(2);
		String sql = "UPDATE test01 SET pname=?, age=?, etc=? where tno=?";
		
		Set(t, sql);
	}
	
	public void Delete() {
		try {
			int tno = EnterNo(3);
			Select(tno, "del");
		
			String sql = "DELETE FROM test01 where tno=?";
		
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, tno);
			result = pstmt.executeUpdate();
			
			if(result==0) {
				System.out.println("Failed");
			} else {
				System.out.println("Succeded");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void Search() {
		int tno = EnterNo(4);
		
		Select(tno, "list");
	}
	
	

} //eoc
