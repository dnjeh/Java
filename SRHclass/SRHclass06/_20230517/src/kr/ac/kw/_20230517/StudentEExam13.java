package kr.ac.kw._20230517;

public class StudentEExam13 {

	public static void main(String[] args) {
		StudentExam13 kim = new StudentExam13("김현우");
		kim.setGrade(2);
		StudentExam13 jang = new StudentExam13("장민재", 3);
		System.out.println("학생의 이름은 " + kim.getName() + "이고, " + kim.getGrade() + "학년입니다.");
		System.out.println("학생의 이름은 " + jang.getName() + "이고, " + jang.getGrade() + "학년입니다.");
	}

}
