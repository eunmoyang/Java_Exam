package jacom.conn;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.StringTokenizer;

import jacom.value.Prints;

public class DBConnect {

	public Connection conn;

	private String url;
	private String id;
	private String pw;

	/*
	 *  connect / disconnect
	 */
	public void connect() {		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, id, pw);
			
			Prints.printEmpty(2);
			System.out.println("[ [ [DB 연결 성공] ] ]");
			Prints.printEmpty(2);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void disconnect() {
		try {
			if(conn != null && !conn.isClosed())
				conn.close();
			Prints.printEmpty(2);
			System.out.println("[ [ [DB 연결 해제] ] ]");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * 	Constructor / read
	 */
	public DBConnect() {
		read();
	}

	// DBconn.property 에 있는 url, id, pw 를 읽어온다
	public void read() {

		BufferedReader br = null;
		String dir = "src/files/DBconn.property";

		try {
			br = new BufferedReader(new FileReader(dir));
			StringTokenizer st = new StringTokenizer(br.readLine(), ",");

			url = st.nextToken();
			id = st.nextToken();
			pw = st.nextToken();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
