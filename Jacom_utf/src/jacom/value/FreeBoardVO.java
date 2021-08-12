package jacom.value;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FreeBoardVO {

	private int bno;		// 게시글 번호
	private String title;	// 글 제목
	private String content;	// 글 내용
	private String bname;	// 작성자
	private int del = 0;	// 삭제 여부 (0 / 1 : 삭제)
	private String etc;		// 기타	
	
	/*
	 *  set
	 */
	public void setFB(ResultSet rs) throws SQLException {
		this.setBno(rs.getInt(1));
		this.setTitle(rs.getString(2));
		this.setContent(rs.getString(3));
		this.setBname(rs.getString(4));
		this.setDel(rs.getInt(5));
		this.setEtc(rs.getString(6));
	}
	
	/*
	 *  Constructor
	 */
	public FreeBoardVO() {}
	
	public FreeBoardVO(int bno, String title, String content, String bname, String etc) {
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.bname = bname;
		this.etc = etc;
	}
	
	
	/*
	 *  toString
	 */
	@Override
	public String toString() {
		return "번호 : " + bno + ", 작성자 : " + bname + "\n"
			  +"제목 : " + title + "\n"
			  +"내용 : " + content + "\n"
			  +"기타 : " + etc + "\n"
			  +(del == 1 ? "[삭제된 데이터]\n" : "");
	}
	
	
	/*
	 * 	getter setter
	 */
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getDel() {
		return del;
	}
	public void setDel(int del) {
		this.del = del;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}

	
	
}
