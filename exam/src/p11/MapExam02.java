package p11;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExam02 {
	public static void setHm(HashMap<String, String> hm) {
		hm.put("name", "박혜진");
		hm.put("age", "김혜진");
		hm = new HashMap<String, String>();
	}

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		ArrayList<HashMap<String, String>> alMap = new ArrayList<HashMap<String, String>>();
		for(int i=0;i<4;i++) {
			hm = new HashMap<String, String>();
			hm.put("age",i+"");
			alMap.add(hm);
		}
		for(HashMap<String, String> h : alMap) {
			System.out.println(h.get("age"));
		}
		
	}
}
