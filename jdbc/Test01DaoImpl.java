package kr.co.job.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test01DaoImpl implements Test01Dao {
	
	jdbctestConnection dbConn;
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
				list.add(new Test01VO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getInt(5)));
				System.out.println(list.get(0));
			}
			System.out.println(list.get(0));
			System.out.println(list.get(1));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public Test01VO selectOne(int tno) {
		return null;
	}

	@Override
	public int insert(Test01VO tvo) {
		return 0;
	}

	@Override
	public int update(Test01VO tvo) {
		return 0;
	}

	@Override
	public int delete(int tno) {
		return 0;
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
