package kr.ac.kw._20230614.Exam2;

public class Student extends Person {
	boolean online;
	@Override
	void printInfo() {
		super.printInfo();
		System.out.println(name+"은 학생이며 현재 "+(online?"온라인":"등교")+" 수업 중입니다.");
	}
}
