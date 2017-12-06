package p12;

import java.util.LinkedHashMap;
import java.util.Random;

public class MapExam01 {
LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
	
	void add(String str) {
		hm.put(hm.size(), str);
	}
	
	void add(int idx) {
		if(hm.get(idx)==null) {
			hm.put(idx, (hm.size()+1)+"번째 값");
		}
	}
	
//	public static void main(String[] args) {
//		MapExam01 me = new MapExam01();
//		for(int i=0;i<10;i++) {
//			me.add((i+1)+"번째 값");
//		}
//		System.out.println(me.hm);
//	}
	
	public static void main(String[] args) {
		MapExam01 me = new MapExam01();
		Random r = new Random();
		
		for(int i=0;i<10;i++) {
			int n = r.nextInt(10);
			if(me.hm.get(n)==null) { //me.hm.get/me.add 이런거 헷갈령..
				me.add(n);
			}else {
				i--;
			}
		}
		System.out.println(me.hm);
	}
}
