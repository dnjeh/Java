package kr.ac.kw._20230607;

public class CarExam22 {
	String carname;
	String color;
	int velocity;
	void speedUp() {
		velocity += 5;
		System.out.println("속도 " + velocity + " 증가");
	}
	void speedDown() {
		velocity -= 5;
		System.out.println("속도 " + velocity + " 감소");
	}
}
