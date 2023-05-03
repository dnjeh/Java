package kr.ac.kw._20230419;
import java.util.Scanner;
public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5], i, max=0;
		System.out.println("정수 5개를 입력하세요.");
		for(i=0;i<5;i++) {
			System.out.printf("%d번째 정수 : ", i+1);
			num[i]=sc.nextInt();
			if(i==0||max<num[i]) max=num[i];
		}
		System.out.println("입력한 값들 중 최대값은 " +max +" 입니다.");
	}
}
