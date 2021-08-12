package jacom.execute;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import jacom.value.VarCtrl;

public class BoardWritingAdd {

	static String[] str = {
			"제목", "내용", "이름", "기타"
	};

	public void run() {

		String[] str = inputs();

		add(str);

	}

	public static String[] inputs() {
		String[] str = new String[4];

		VarCtrl.scan.nextLine();

		for(int i=0; i<4; i++)
			str[i] = input(i);

		return str;
	}

	static String input(int n) {
		String result = null;
		String print = "[" + str[n] + "] >> ";

		do {
			System.out.print(print);
			result = VarCtrl.scan.nextLine();
		}while(result == null || result.equals("") 
				|| result.equals("\n") || result.equals("\r") 
				|| result.equals("\r\n"));

		return result;
	}

	private void add(String[] str) {
		String sql = "INSERT INTO freeboard(title, content, bname, etc, del) VALUES(?, ?, ?, ?, ?)";

		PreparedStatement pstmt = null;

		try {
			pstmt = VarCtrl.dbc.conn.prepareStatement(sql);

			for(int i=0; i<4; i++)
				pstmt.setString(i+1, str[i]);
			
			pstmt.setInt(5, 0);

			if(pstmt.executeUpdate() == 0) 
				System.out.println("[데이터 입력 실패]");
			else {
				System.out.println("[데이터 입력 성공]");

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
