package kr.co.job.jdbc;

public class Test01VO {
	private int tno;
	private String pname;
	private int age;
	private String etc;
	private int del;
	
	public Test01VO() {}
	
	public Test01VO(int tno, String pname, int age, String etc, int del) {
		super();
		this.tno = tno;
		this.pname = pname;
		this.age = age;
		this.etc = etc;
		this.del = del;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	@Override
	public String toString() {
		return "[tno=" + tno + ", pname=" + pname + ", age=" + age + ", etc=" + etc + "]";
	}
}
