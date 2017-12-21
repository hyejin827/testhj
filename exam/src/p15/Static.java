package p15;

import java.util.ArrayList;

public class Static {

	ArrayList<String> al = new ArrayList<String>();
	static String str = "123";
	
	Static(){
		al.add(str);
	}
	public static void main(String[] args) {
		System.out.println(str);
		Static s = new Static();
		s.str = "aaa";
		System.out.println(str);
		Static s2 = new Static();
		s2.str = "bbb";
		System.out.println(s.str);
	}
}
