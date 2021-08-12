package kr.co.job.jdbc;

public class Test01Control {

	public static void main(String[] args) {
		
		jdbctestConnection dbConn = new jdbctestConnection();
		Test01DaoImpl impl = new Test01DaoImpl();
		
		impl.listAll();

	}

}
