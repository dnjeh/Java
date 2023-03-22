package kr.ac.kw._20230322;

public class ArrayExam5 {
	public static void main(String[] args) {
		int[] a = new int[5] ;
		a.length = 3;
		for( int i = 0 ; i < a.length ; i++) 
			System.out.println( "a[" + i + "] = " + a[i] );
	}
}