package kr.ac.kw._20230614.Exam2;

public class Cartoon extends Book {
	boolean webtoon;
	@Override
	void printBook() {
		super.printBook();
		System.out.println("이 만화는 "+ (webtoon?"웹툰입":"웹툰이 아닙") +"니다");
	}
}
