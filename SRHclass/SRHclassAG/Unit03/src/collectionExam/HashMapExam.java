package collectionExam;

import java.util.HashMap;

public class HashMapExam {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("유재석", 10);
		map.put("박명수", 5);
		map.put("김종국", 3);
		System.out.println(map.size());
		map.get("유재석");
		map.get("박명수");
		map.get("김종국");
		int num=1;
		if(map.containsKey("서장훈")) 
			num += map.get("서장훈");
		map.put("서장훈", num);
		map.remove("유재석");
		for (String s : map.keySet()) {
			System.out.print(s + ' ');
		} System.out.println();
		for (int i : map.values()) {
			System.out.print(i + " ");
		} System.out.println();
		for (String s : map.keySet()) {
			System.out.println("key : " + s + ", value : " + map.get(s) );
		} System.out.println();
		map.clear();
		System.out.println(map.size());
	}
}

