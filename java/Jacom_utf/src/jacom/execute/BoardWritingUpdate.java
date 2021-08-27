package jacom.execute;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import jacom.value.FreeBoardVO;
import jacom.value.Prints;
import jacom.value.VarCtrl;

public class BoardWritingUpdate {

	public void run() {
		
		Prints.printBWUpdateMenu();
		int sel = VarCtrl.inputSel(0, 2);
		
		switch(sel) {
		case 0:
			return;
			
		case 1:
			numSearch();
			return;
			
		case 2:
			nameSearch();
			return;
		}
		
	}
	
	private void numSearch() {		
		int idx = VarCtrl.inputSel();
	
		FreeBoardVO fb = Searching.bnoSearch(idx);
		
		if(VarCtrl.fbCheck(fb)) 		
			return;
		
		update(fb);
	}

	private void nameSearch() {
		
		VarCtrl.scan.nextLine();
		String bname = BoardWritingAdd.input(2);
		
		if(Searching.searchBname(bname) == 0)
			System.out.println("[입력한 이름의 데이터가 없습니다.]");
		else
			numSearch();
	}
	
	private void update(FreeBoardVO fb) {
		System.out.println(fb);
		
		PreparedStatement pstmt = null;
		
		String sql = "update freeboard set title = ?, content = ?, bname = ?, etc = ? where bno = ?";
		
		try {
			pstmt = VarCtrl.dbc.conn.prepareStatement(sql);
			
			String[] str = BoardWritingAdd.inputs();
			
			for(int i=0; i<4; i++)
				pstmt.setString(i+1, str[i]);
				
			pstmt.setInt(5, fb.getBno());
			
			if(pstmt.executeUpdate() == 0)
				System.out.println("[데이터 수정 실패]");
			else {
				System.out.println("[데이터 수정 성공]");				
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
	}
	
}
