package kr.ac.kw._20230412;
import java.util.*;
public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5], max=0, i;
		System.out.println("정수 5개를 입력해주세요.");
		i=0;
		while(i<5) {
			System.out.print((i+1)+"번째 정수 : ");
			num[i++]=sc.nextInt();
		}
		i=0;
		while(i<5) {
			if(max<num[i]) max=num[i];
			i++;
		}
		System.out.println("입력한 값들 중 최대값은 "+max+"입니다.");
	} 
}
