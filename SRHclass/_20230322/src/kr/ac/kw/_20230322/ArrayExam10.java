package kr.ac.kw._20230322;
import java.util.Scanner;

public class ArrayExam10 {
	public static void main(String[] args) {
		int[] score = new int[5];
		int sum = 0;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<5; i++) {
			System.out.println("input score : " );
			score[i]=sc.nextInt();
			sum+=score[i];
		}
		
		System.out.println("sum : " + sum);
		avg = sum/5.0;
		System.out.println("avg : " + avg);
	}
}