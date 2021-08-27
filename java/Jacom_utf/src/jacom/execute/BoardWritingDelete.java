package jacom.execute;

import java.sql.SQLException;
import java.sql.Statement;

import jacom.value.FreeBoardVO;
import jacom.value.VarCtrl;

public class BoardWritingDelete {

	public void run() {
		
		int idx = VarCtrl.inputSel();
		
		FreeBoardVO fb = Searching.bnoSearch(idx);

		if(VarCtrl.fbCheck(fb)) 		
			return;
		
		if(fb.getDel() == 1) {
			System.out.println("[삭제된 데이터 입니다.]");	return;
		}
		
		Statement stmt = null;
		String sql = "update freeboard set del = 1 where bno = " + fb.getBno();
		
		try {
			stmt = VarCtrl.dbc.conn.createStatement();
				
			if(stmt.executeUpdate(sql) == 0 )
				System.out.println("[데이터 삭제 실패]");		
			else
				System.out.println("[데이터 삭제 성공]");		
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[입력한 번호의 데이터가 없습니다.]");
		} finally {
			try {
				if(stmt != null && !stmt.isClosed())
					stmt.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		
	}
	
}
