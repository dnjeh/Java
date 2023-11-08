package kr.ac.kw._20230517;

public class StudentExam13 {
	private String name;
	private int grade;
	public StudentExam13() {}
	public StudentExam13(String name) {
		this.name=name;
	}
	public StudentExam13(String name, int grade) {
		this(name);
		this.grade=grade;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public int getGrade() {
		return this.grade;
	}
}
