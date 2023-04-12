package kr.ac.kw._20230412;
import java.util.*;
public class Exam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, sum=0, i;
		System.out.print("숫자입력:");
		num=sc.nextInt();
		for(i=1;i<=num;i++) {
			System.out.printf("%c%d", i%2==0?'-':'+', i>0?i:i*-1);
			if(i%2==0) {
				sum-=i;
			}
			else {
				sum+=i;
			}
		}
		System.out.println("="+sum);
	}  
}
