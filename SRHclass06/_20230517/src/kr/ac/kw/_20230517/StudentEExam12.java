package kr.ac.kw._20230517;

public class StudentEExam12 {

	public static void main(String[] args) {
		StudentExam11 kim = new StudentExam11();
		StudentExam11 jang = new StudentExam11("장민재");
		StudentExam11 lee = new StudentExam11("이로봇", 1);
		
		kim.print();
		jang.print();
		lee.print();
	}

}
