package p11;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExam01 {
	public static void setHm(HashMap<String,String> hm) {
		hm.put("name", "박혜진");
		hm.put("age", "김혜진");
		hm = new HashMap<String,String>();
	}
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		ArrayList<HashMap<String,String>> alMap = new ArrayList<HashMap<String,String>>();
		alMap.add(hm);
		setHm(hm);
		System.out.println(alMap.get(0).get("name"));
		System.out.println(alMap.get(0).get("age"));
		System.out.println(hm.get("name"));
		System.out.println(hm.get("age"));
	}
}
