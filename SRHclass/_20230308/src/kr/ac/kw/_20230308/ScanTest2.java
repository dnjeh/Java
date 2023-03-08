package kr.ac.kw._20230308;
import java.util.Scanner;
public class ScanTest2 {
	public static void main(String[] args) {
		String major, num, name;
		Scanner sc = new Scanner(System.in);
		System.out.print("major : ");
		major = sc.nextLine();
		System.out.print("number : ");
		num = sc.nextLine();
		System.out.print("name : ");
		name = sc.nextLine();
		System.out.println("I'm " + major + " " + num + " " + name + ".");
	}
}
