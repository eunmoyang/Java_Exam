package kr.co.job.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01DaoImpl implements Test01Dao {
	
	Scanner scan = new Scanner(System.in);
	jdbctestConnection dbConn = new jdbctestConnection();
	PreparedStatement pstmt;
	ResultSet rs;
	Test01VO tvo;
	List<Test01VO> list = new ArrayList<Test01VO>();

	@Override
	public List<Test01VO> listAll() {
		String sql = "SELECT tno, pname, age, etc FROM test01 WHERE del=0";
		
		try {
			pstmt = dbConn.conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				list.add(new Test01VO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
			}
			
			for(Test01VO t : list) {
				System.out.println(t);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public Test01VO selectOne(int tno) {
		String sql = "SELECT tno, pname, age, etc FROM test01 WHERE del=0 and tno=?";
		
		try {
			pstmt = dbConn.conn.prepareStatement(sql);
			pstmt.setInt(1, tno);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				tvo = new Test01VO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
			}
			
			System.out.println(tvo);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return tvo;
	}

	@Override
	public int insert(Test01VO tvo) {
		String sql = "INSERT INTO test01(pname, age, etc) VALUES(?, ?, ?)";
		int result = 0;
		
		try {
			pstmt = dbConn.conn.prepareStatement(sql);
			pstmt.setString(1, tvo.getPname());
			pstmt.setInt(2, tvo.getAge());
			pstmt.setString(3, tvo.getEtc());
			result = pstmt.executeUpdate();
			
			if(result!=0) {
				System.out.println("Insert completed!");
			} else {
				System.out.println("Insert failed");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}

	@Override
	public int update(Test01VO tvo) {
		String sql = "UPDATE test01 SET pname=?, age=?, etc=? WHERE tno=?";
		int result = 0;
		
		try {
			pstmt = dbConn.conn.prepareStatement(sql);
			pstmt.setString(1, tvo.getPname());
			pstmt.setInt(2, tvo.getAge());
			pstmt.setString(3, tvo.getEtc());
			pstmt.setInt(4, tvo.getTno());
			result = pstmt.executeUpdate();
			
			if(result!=0) {
				System.out.println("Update completed!");
			} else {
				System.out.println("Update failed");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int delete(int tno) {
		String sql = "UPDATE test01 SET del=1 WHERE tno=?";
		int result = 0;
		
		try {
			pstmt = dbConn.conn.prepareStatement(sql);
			pstmt.setInt(1, tno);
			result = pstmt.executeUpdate();
			
			if(result!=0) {
				System.out.println("Delete completed!");
			} else {
				System.out.println("Delete failed");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void close() {
		try {
			if(dbConn.conn!=null && !dbConn.conn.isClosed())
				dbConn.conn.close();
			if(pstmt!=null && !pstmt.isClosed())
				pstmt.close();
			if(rs!=null && !rs.isClosed())
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	
	
	
}
