package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.StringTokenizer;

public class DBconnTest {

	public static void main(String[] args) {

		BufferedReader br = null;
		StringTokenizer st = null;
		
		String url = null;
		String id = null;
		String pw = null;
		
		try {
			br = new BufferedReader(new FileReader("src/files/DBconn.property"));
			String str = br.readLine(); 
			
			st = new StringTokenizer(str, ",");
			
			url = st.nextToken();
			id = st.nextToken();
			pw = st.nextToken();
			
//			System.out.println(url);
//			System.out.println(id);
//			System.out.println(pw);
			
//			String[] d = new String[3];
//			d = str.split(",");
//			System.out.println(d[0]);
//			System.out.println(d[1]);
//			System.out.println(d[2]);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
//		System.out.println("url : " + url);
//		System.out.println("id  : " + id);
//		System.out.println("pw  : " + pw);
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("[연결 성공]");
	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null && !conn.isClosed())
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
