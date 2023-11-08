package kr.ac.kw._20230531;

public class StudentExam16 {
	String name;
	String hakbun;
	String phone;
	String juso;
	String major;
	
	public StudentExam16() { }
	public StudentExam16(String name, String hakbun) {
		this.name=name;
		this.hakbun=hakbun;
	}
	
	public void study() {
		System.out.println("공부하다."); }	
	public void eat() {
		System.out.println("식사하다."); }
	public void test() {
		System.out.println("시험보다."); }
	public void extra_act() {
		System.out.println("동아리 활동 하다."); }
}
