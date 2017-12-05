package p11;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExam {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>(); //key,value 두가지 데이터타입 사용가능
		hm.put("name", "박혜진");
		hm.put("name", "김혜진");
		hm.put("age", "김혜진");
		//key값은 중복이 될 수 없음. 중복될 경우 value값이 바꿔치기?ㅎ 됨
		//value값은 중복 가능
		System.out.println(hm.get("name"));
		System.out.println(hm.get("age"));
		ArrayList<HashMap<String,String>> alMap = new ArrayList<HashMap<String,String>>();
		alMap.add(hm);
		hm.put("age", "박혜진");
		
		System.out.println(alMap.get(0).get("age"));
	}
}
