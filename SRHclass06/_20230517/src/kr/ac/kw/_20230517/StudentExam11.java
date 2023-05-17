package kr.ac.kw._20230517;

public class StudentExam11 {
	private String name;
	private int grade;
	public StudentExam11() {}
	public StudentExam11(String name) {
		this.name=name;
	}
	public StudentExam11(String name, int grade) {
		this.name=name;
		this.grade=grade;
	}
	public void print() {
		System.out.println("학생의 이름은 " + name + "이고, " + grade + "학년입니다.");
	}
}
