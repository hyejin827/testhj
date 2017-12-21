package p14;

import java.util.ArrayList;
import java.util.Random;

public class Excute {

	public static void main(String[] args) {
//		MapExam me = new MapExam();
//		me.put("name", "박혜진");
//		me.put("name", "박혜진2");
//		me.put("name", "박혜진3");
//		me.put("name", "박혜진4");
//		me.remove("name");
//		System.out.println(me.get("name"));
//		System.out.println(me.size());
		
		
			//me.put("age", );
			//랜덤값 최소값 = 1, max = 100;
			//ArrayList<MapExam>에 하나씩 추가
		ArrayList<MapExam> al = new ArrayList<MapExam>();
		MapExam me = new MapExam();
		Random r = new Random();
		
		for(int i=0;i<10;i++) {
			me = new MapExam();
			me.put("name", "n"+i);
			me.put("age", (r.nextInt(100)+1)+"");
			me.put("address", "서울");
			al.add(me);
		}
		for(MapExam m : al) {
//			System.out.print("name : "+m.get("name"));
//			System.out.println(", age : "+m.get("age"));
			System.out.println(m); //toString 오버라이딩 해야됨
		}
	}
}
