package jacom.execute;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jacom.value.FreeBoardVO;
import jacom.value.VarCtrl;

public class Searching {

	public static FreeBoardVO bnoSearch(int n) {
		
		Statement stmt = null;
		ResultSet rs = null;

		FreeBoardVO fb = null;
		
		String sql = "select * from freeboard where bno = " + n;
		
		try {
			stmt = VarCtrl.dbc.conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				fb = new FreeBoardVO();
				fb.setFB(rs);

			}else
				System.out.println("[입력한 번호의 데이터가 없습니다.]");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null && !stmt.isClosed())
					stmt.close();
				if(rs != null && !rs.isClosed())
					rs.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return fb;
	}

	public static int searchBname(String bname) {
		int count = 0;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		FreeBoardVO fb = new FreeBoardVO();
		String sql = "select * from freeboard where bname = ?";
		
		try {
			pstmt = VarCtrl.dbc.conn.prepareStatement(sql);
			pstmt.setString(1, bname);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				fb.setFB(rs);
				System.out.println(fb);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return count;
	}
	
}
