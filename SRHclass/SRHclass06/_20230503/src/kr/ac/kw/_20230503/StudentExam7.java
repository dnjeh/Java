package kr.ac.kw._20230503;
public class StudentExam7 {
	String name;
	int grade;
	static int count = 0;
	public StudentExam7() {
		count++;
	}
	public static int getCount() {
		return count;
	}
}
