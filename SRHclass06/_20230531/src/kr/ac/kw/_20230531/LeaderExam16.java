package kr.ac.kw._20230531;

public class LeaderExam16 extends StudentExam16 {
	boolean lead;
	
	public LeaderExam16() { }
	public LeaderExam16(String name, String hakbun, boolean lead) {
		this.name=name;
		this.hakbun=hakbun;
		this.lead=lead;
	}
	
	public void isLeader() {
		if(lead == true)
			System.out.println(name + "은 학급회장이다.");
		else 
			System.out.println(name + "은 학급회장이 아니다.");
	}
}
