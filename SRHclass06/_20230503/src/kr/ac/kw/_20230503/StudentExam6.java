package kr.ac.kw._20230503;

class StudentExam6 {
	private String name;
	private int grade;
	
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	}
	public void setGrade(int g) {
		grade=g;
	}
	public int getGrade() {
		return grade;
	}
	
	public void print() {
		System.out.println("학생의 이름은 " + name + "이고, " + grade + "학년입니다.");
	}
}
