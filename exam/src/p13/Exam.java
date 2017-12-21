package p13;

import java.util.ArrayList;

public class Exam {
	
	static void tt(ArrayList<Person> al) {
		al = new ArrayList<Person>();
		al.add(new Person());
	}
	
	public static void main(String[] args) {
		ArrayList<Person> al = new ArrayList<Person>();
//		al.add(new Person());
//		System.out.println(al.get(0));
//		Person p = al.get(0);
//		p = new Person();
//		p.setAge(3);
//		System.out.println(p);
		
		
//		Person pp = new Person();
//		al.add(pp);
//		Person pp2 = al.get(0);
//		System.out.println(pp==pp2);
//		pp2 = new Person();
//		System.out.println(pp==pp2);
		
//		Person ppp = new Person();
//		al.add(ppp);
//		ppp.setAge(3);
//		tt(al);
//		System.out.println(al.get(0).getAge());
		
//		Person ps = new Person();
//		ps.setAge(3);
//		al.add(ps);
//		System.out.println(al.get(0).getAge());
//		//ps = new Person(); //이거 없이 출력하면 둘다 값은 4가됨.
//		ps.setAge(4);
//		al.add(ps);
//		System.out.println(al.get(0).getAge());
//		al = new ArrayList<Person>();
//		System.out.println(al.get(0)); //오류
//		System.out.println(ps.getAge());
		
		Person pss = new Person();
		al.add(pss);
		pss.setAge(1);
		
		al.add(pss);
		pss.setAge(2);
		
		al.add(pss);
		pss.setAge(3);
		
		al.add(pss);
		pss.setAge(4);
		
		for(int i=0;i<al.size();i++) {
			Person p = al.get(i);
			System.out.println(p.getAge());
		}
	}
}
