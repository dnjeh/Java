package kr.ac.kw._20230412;
public class Exam02 {
	public static void main(String[] args) {
		int i, j;
		for(i=0;i<3;i++) {
			for(j=1;j<=4;j++) {
				System.out.print(j);
			}
			System.out.print('\n');
		}
		System.out.println("\n-------\n");
		for(i=1;i<=4;i++) {
			for(j=0;j<3;j++) {
				System.out.print(i);
			}
			System.out.print('\n');
		}
		System.out.println("\n-------\n");
		for(i=1;i<=4;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.print('\n');
		}
		System.out.println("\n-------\n");
		for(i=3;i>=1;i--) {
			for(j=0;j<i;j++) {
				System.out.print('*');
			}
			System.out.print('\n');
		}
		System.out.println("\n-------\n");
		for(i=3;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.print('\n');
		}
		System.out.println("\n-------\n");
		for(i=3;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(4-i);
			}
			System.out.print('\n');
		}
		System.out.println("\n-------\n");
	} 
}
