package kr.ac.kw._20230531;

public class TruckMainExam15 {
	public static void main(String[] args) {
		TruckExam15 mytruck = new TruckExam15();
		mytruck.carname = "프론티어";
		mytruck.ton = 3;
		
		System.out.println("나의 트럭은 " + mytruck.color + "이다.");
		System.out.println(mytruck.carname + "는 " + mytruck.ton + "톤을 실을 수 있다.");
	}
}
