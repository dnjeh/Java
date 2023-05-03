package kr.ac.kw._20230503;

public class StaticVariExam3 {
	public static void main(String[] args) {
		StudentExam3 kim = new StudentExam3();
		StudentExam3 jang = new StudentExam3();
		StudentExam3 bak = new StudentExam3();
		System.out.println("생성된 학생 객체 수는 " + StudentExam3.count + "입니다.");
	}
}
