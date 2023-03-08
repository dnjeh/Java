package kr.ac.kw._20230308;
import java.util.Scanner;
public class ScanTest3 {
	public static void main(String[] args) {
		int num1, num2, num3;
		int sum;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("First number is : ");
		num1 = sc.nextInt();
		System.out.print("Second number is : ");
		num2 = sc.nextInt();
		System.out.print("Thrid number is : ");
		num3 = sc.nextInt();
		sum = num1 + num2 + num3;
		avg = sum / 3.0;
		System.out.printf("Sum : %d Averge : %.1f", sum, avg);
	}
}
