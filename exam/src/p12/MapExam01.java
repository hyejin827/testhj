package p12;

import java.util.HashMap;

public class MapExam01 {
HashMap<Integer,String> hm = new HashMap<Integer,String>();
	
	void add(String str) {
//		System.out.println(hm);
		hm.put(hm.size(), str);
	}
	public static void main(String[] args) {
		MapExam01 me = new MapExam01();
		for(int i=0;i<10;i++) {
			me.add((i+1)+"번째 값");
		}
		System.out.println(me.hm);
	}
}
