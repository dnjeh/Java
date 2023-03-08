package kr.ac.kw._20230308;

import java.util.Scanner;
public class ScanTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input age : ");
		int age = sc.nextInt();
		System.out.printf("My age is %d years old.", age);
	}
}
