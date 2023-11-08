package kr.ac.kw._20230517;

public class StudentExam10 {
	private String name;
	private int grade;
	public StudentExam10() {}
	public StudentExam10(String n) {
		name=n;
	}
	public StudentExam10(String n, int g) {
		name=n;
		grade=g;
	}
	public void print() {
		System.out.println("학생의 이름은 " + name + "이고, " + grade + "학년입니다.");
	}
}
