package kr.ac.kw._20230607;

public class TruckExam22 extends CarExam22 {
	int ton;
	void speedUp() {
		velocity += 10;
		System.out.println("속도 " + velocity + " 증가");
	}
}
