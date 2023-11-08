package kr.ac.kw._20230614.Exam2;

public class BookMain {
	public static void main(String[] args) {
		Cartoon c1 = new Cartoon();
		Major m1 = new Major();
		c1.title = "순정만화";
		c1.Writer = "강풀";
		c1.webtoon = true;
		m1.title = "자바의정석";
		m1.Writer = "남궁성";
		m1.subject = "프로그래밍";
		c1.printBook();
		m1.printBook();
	}
}
