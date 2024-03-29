package review;

public class Circle extends Shape {
	private int radius;
	public Circle() {
		super();
	}
	public Circle(String name, int radius) {
		super(name);
		this.radius=radius;
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("반지름 " + radius + "인 원으로 그립니다.");
	}

	@Override
	public void calculateArea() {
		System.out.println("반지름 " + radius + "인 원의 넓이는 " + PI * radius * radius + "입니다.");
	}

	@Override
	public void calculateRound() {
		System.out.println("반지름 " + radius + "인 원의 둘레는 " + PI *   2   *  radius + "입니다.");
	}

}
