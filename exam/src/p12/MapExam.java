package p12;

import java.util.HashMap;

public class MapExam {
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	
	void add(String str) {
//		System.out.println(hm);
		hm.put(hm.size(), str);
		System.out.println(hm.size());
	}
	
	public static void main(String[] args) {
		MapExam me = new MapExam();
		me.add("asdf"); //얘는 중괄호/ArrayList는 대괄호
		me.add("asdf"); 
		me.add("asdf"); 
		System.out.println(me.hm);
	}
}
