package kr.ac.kw._20230614.Exam2;

public class Major extends Book {
	String subject;
	@Override
	void printBook() {
		super.printBook();
		System.out.println("전공 분야는 "+ subject +"입니다");
	}
}
