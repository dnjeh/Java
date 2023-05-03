package kr.ac.kw._20230503;

public class Studenteexam6 {
	public static void main(String[] args) {
		StudentExam6 kim = new StudentExam6();
		kim.setName("김현우");
		kim.setGrade(2);
		
		StudentExam6 jang = new StudentExam6();
		jang.setName("장민재");
		jang.setGrade(3);
		
		kim.print();
		jang.print();
	}
}
