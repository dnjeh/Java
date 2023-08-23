package lottoExam;

import java.util.ArrayList;

public class LottoArrayList {
	public void getRandomBall() {
		int t;
		ArrayList<Integer> list = new ArrayList<>();
		while(list.size()<6) {
			t=(int)(Math.random()*45)+1;
			if(list.contains(t)) continue;
			list.add(t);
		}
		for (Integer i : list) {
			System.out.print(i + " ");
		} System.out.println();
	}
}
