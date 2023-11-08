package kr.ac.kw._20230503;

public class StaticMethodExam7 {
	public static void main(String[] args) {
		StudentExam7 kim = new StudentExam7();
		StudentExam7 jang = new StudentExam7();
		StudentExam7 bak = new StudentExam7();
		System.out.println("생성된 학생 객체 수는 " + StudentExam7.getCount() + "입니다.");
	}
}
