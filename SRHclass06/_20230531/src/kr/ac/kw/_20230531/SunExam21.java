package kr.ac.kw._20230531;

public class SunExam21 extends FatherExam21 {
	public SunExam21(String str) {
		super(str);
		System.out.println("Sun 생성자");
	}
	public static void main(String[] args) {
		SunExam21 s = new SunExam21("홍길동");
	}
}
