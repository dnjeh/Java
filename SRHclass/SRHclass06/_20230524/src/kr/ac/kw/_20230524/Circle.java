package kr.ac.kw._20230524;

public class Circle {
	private double radius;
	private static final double PI = 3.14;
	
	public Circle() {
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double computeArea() {
		return radius*radius*PI;
	}
	public double computePerimeter() {
		return 2*PI*radius;
	}
}
