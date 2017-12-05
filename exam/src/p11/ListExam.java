package p11;

import java.util.ArrayList;
import java.util.Random;

public class ListExam {
	public static void main(String[] args) {
//		ArrayList<String> al = new ArrayList<String>(); //String만 넣을수있는 ArrayList
//		정해져 있는 않은 데이터 타입은 선언 안됨.
//		ArrayList<int> al = new ArrayList<int>(); //Integer로 써줘야함
//		al.add("test");
//		al.add("냐"); //방개수 가변형
//		al.add(true); //String빼고 다 안됨
//		al.add(1);
//		al.add(1,3);
//		al.add('c');
//		System.out.println(al.get(1)); 
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
//		for(int i=0;i<10;i++) {
//			Random r = new Random();
//			int n = r.nextInt(10)+1;
//			al.add(n);
//			System.out.println(al.indexOf(n));
//		} //여기서 중복 제거 하고 싶으면 밑에 껄로!
		
		for(int i=0;i<10;i++) {
			Random r = new Random();
			int n = r.nextInt(10)+1;
			if(al.indexOf(n)==-1) {
			al.add(n);
			}else {
				i--;
			}
		}
		
		for(Integer i : al) {
			System.out.println(i);
		}
	}
}
