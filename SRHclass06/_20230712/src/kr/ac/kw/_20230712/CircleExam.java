package kr.ac.kw._20230712;

public class CircleExam extends Shape {
	int r;
	
	public CircleExam(int r) {
		this.r = r;
	}
	
	public double getCircum() {
		return 3.14 * 2 * r;
	}
	
	public double getArea() {
		return 3.14 * r * r;
	}
	
	public static void main(String[] args) {
		CircleExam c1 = new CircleExam(20);
		
		System.out.println("원의 둘레 : " + c1.getCircum());
		System.out.println("원의 면적 : " + c1.getArea());
	}
}
