package kr.ac.kw._20230315;

public class StringTest4 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		if (str1==str2)
			System.out.println("same");
		else
			System.out.println("different");
	}

}