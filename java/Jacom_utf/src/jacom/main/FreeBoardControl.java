package jacom.main;

import jacom.value.Prints;
import jacom.value.VarCtrl;

public class FreeBoardControl {

	VarCtrl vc = new VarCtrl();
	FBCMethod fcm = new FBCMethod();
	
	int sel = 0;
	boolean done = true;
	
	/*
	 * run
	 */
	public void run() {
		while(done) {
			Prints.printMainMenu();
			inputSel();
			switchMenu();
			Prints.printEmpty(5);
		}
	}
	
	void inputSel() {
		sel = VarCtrl.inputSel(0, 4);
	}
	
	// sel 값에 따른 mode 선택
	void switchMenu() {
		switch(sel) {
		// 종료
		case 0 :
			done(); break;
			
		default :
			fcm.run(sel); break;		
		}
	}
	
	// done 반전
	void done() {
		done = !done;
	}
	
	/*
	 *  end
	 */
	public void end() {
		vc.end();
	}
	
}
