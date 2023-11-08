package lottoExam;

import java.util.HashSet;

public class LottoHashSet {
	public void getRandomBall() {
		int t;
		HashSet<Integer> set = new HashSet<>();
		while(set.size()<6) {
			t=(int)(Math.random()*45)+1;
			set.add(t);
		}
		for (Integer i : set) {
			System.out.print(i + " ");
		} System.out.println();
	}
}
