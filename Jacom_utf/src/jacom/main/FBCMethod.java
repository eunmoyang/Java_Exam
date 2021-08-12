package jacom.main;

import jacom.execute.BoardView;
import jacom.execute.BoardWritingAdd;
import jacom.execute.BoardWritingDelete;
import jacom.execute.BoardWritingUpdate;
import jacom.value.VarCtrl;

public class FBCMethod {

	BoardView bv = new BoardView();
	BoardWritingAdd ba = new BoardWritingAdd();
	BoardWritingUpdate bu = new BoardWritingUpdate();
	BoardWritingDelete bd = new BoardWritingDelete();
	
	public void run(int sel) {

		VarCtrl.dbc.connect();
		
		switch(sel) {
		// 조회
		case 1:
			bv.run();	break;
		
		// 추가
		case 2:
			ba.run();	break;
			
		// 수정
		case 3:
			bu.run();	break;
			
		// 삭제
		case 4:
			bd.run();	break;
		}
		
		VarCtrl.dbc.disconnect();
		
	}

}
