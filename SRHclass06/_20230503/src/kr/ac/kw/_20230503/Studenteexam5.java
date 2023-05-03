package kr.ac.kw._20230503;

public class Studenteexam5 {
	public static void main(String[] args) {
		StudentExam5 kim = new StudentExam5();
		kim.setName("김현우");
		kim.setGrade(2);
		
		StudentExam5 jang = new StudentExam5();
		jang.setName("장민재");
		jang.setGrade(3);
		
		System.out.println("학생의 이름은 " + kim.getName() + "이고, " + kim.getGrade() + "학년입니다.");
		System.out.println("학생의 이름은 " + jang.getName() + "이고, " + jang.getGrade() + "학년입니다.");
	}
}
