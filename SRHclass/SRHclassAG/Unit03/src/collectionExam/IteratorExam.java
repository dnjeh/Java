package collectionExam;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("유재석");
		list.add("아무개");
		list.add("지석진");
		list.add("아무개");
		list.add("김종국");
		list.add("아무개");
		list.add("송지효");
		list.add("아무개");
		list.add("하하");
		
		Iterator<String> it = list.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		
		it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() + " ");
		}
		it = list.iterator();
		while(it.hasNext()) {
			if(it.next().contains("아무개")) {
				it.remove();
			}
		}
	}
}


