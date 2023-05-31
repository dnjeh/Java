package kr.ac.kw._20230531;

public class LeaderMainExam16 {
	public static void main(String[] args) {
		LeaderExam16 hong = new LeaderExam16("홍길동", "30130", true);
		LeaderExam16 kim = new LeaderExam16("김로봇", "20100", false);
		
		hong.isLeader();
		kim.isLeader();
	}
}

