package kr.ac.kw._20230614.Exam2;

public class SoccerPlayer extends Person {
	String teamName;
	@Override
	void printInfo() {
		super.printInfo();
		System.out.println(name+"은 " + teamName + "팀 축구 선수입니다.");
	}
}
