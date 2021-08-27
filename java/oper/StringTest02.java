package kr.co.job.oper;

public class StringTest02 {

	public static void main(String[] args) {
		// page 469
		int n1 = 0;
		int n2 = 0;
		String str = new String("");
		Object obj;
		
		charAt(2,3);
		compartTo("aaa");
		concat(" world");
		contains("af");
		endsWith("txt");
		

		
	} // main

	private static void endsWith(String str) {
		String file = "Hello.txt";
		boolean b = file.endsWith(str);
		System.out.println(b);
	}

	private static void contains(String str) {
		String s = "abcdefg";
		boolean b = s.contains(str);
		System.out.println(b);
	}

	private static void concat(String str) {
		String s = "Hello";
		String s2 = s.concat(str);
		System.out.println(s2);
	}

	private static void compartTo(String str) {
		int i = str.compareTo("aaa");
		int i2 = str.compareTo("bbb");
		int i3 = str.compareTo("000");
		System.out.println("i = " + i + ", i2 = " + i2 + ", i3 = " + i3);
	}

	private static void charAt(int n1, int n2) {
		String s = "Hello";
		String n = "0123456";
		char c = s.charAt(n1);
		char c2 = n.charAt(n2);
		System.out.println("c = " + c + ", c2 = " + c2);
	}

} // class
