package jacom.execute;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jacom.value.FreeBoardVO;
import jacom.value.Prints;
import jacom.value.VarCtrl;

public class BoardView {

	// 데이터 조회
	public void run() {
		
		Prints.printBViewMenu();

		int sel = VarCtrl.inputSel(0, 3);
		
		switch(sel) {
		case 0:
			return;
			
		// 전체 조회
		case 1:
			entryView();
			return;
			
		// 번호 조회
		case 2:
			numSearch();
			return;
			
		// 삭제 조회
		case 3:
			deleteView();
			return;
		}
		
	}


	private static void entryView() {	
		
		if(view(0) == 0)
			System.out.println("[데이터가 없습니다.]");
		
	}
	
	private static void numSearch() {		
		int idx = VarCtrl.inputSel();
		
		FreeBoardVO fb = Searching.bnoSearch(idx);
		
		if(VarCtrl.fbCheck(fb)) 		
			return;
		
		System.out.println(fb);
	}
	
	private static void deleteView() {
		
		if(view(1) == 0)
			System.out.println("[데이터가 없습니다.]");
		
	}
	
	private static int view(int n) {
		int count = 0;
		
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "select * from freeboard where del = " + n;
		
		try {
			stmt = VarCtrl.dbc.conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			FreeBoardVO fb = new FreeBoardVO();
			while(rs.next()) {
				count++;
				
				fb.setBno(rs.getInt(1));
				fb.setTitle(rs.getString(2));
				fb.setContent(rs.getString(3));
				fb.setBname(rs.getString(4));
				fb.setDel(rs.getInt(5));
				fb.setEtc(rs.getString(6));
				
				System.out.println(fb);
			}
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
		
		
		return count;
	}
	
}
