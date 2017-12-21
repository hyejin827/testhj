package p14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Exam {

	public HashMap<Integer, ArrayList<Integer>> getAl(int num){
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i <= num; i++) {
			if(num%i==0) {
				al.add(i);
			}
		}
		HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
		hm.put(num, al);
		return hm;
	}
	
	public static void main(String[] args) {
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		int num = 30;
//		for (int i = 1; i < num; i++) {
//			if(num%i==0) {
//				al.add(i);
//			}
//		}
//		
//		HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
//		al.add(num);
//		hm.put(num,al);
//		System.out.println(hm); //al이 toString을 가지고 있기때문에 주소값이 나오지 않음.
	
		Exam e = new Exam();
		HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
		Random r = new Random();
		for(int i =0;i<5;i++) {
			int n = r.nextInt(51)+50;
			hm.putAll(e.getAl(n)); //key,value를 모두다 집어넣겠다!
		}
//		System.out.println(hm);
		Iterator<Integer> it = hm.keySet().iterator();
		while(it.hasNext()) { //()안에 있는게 참일 경우에 {}실행/hasNext:몇개든 상관없이 있는 키만큼 반복하겠다
			Integer key = it.next();
			System.out.println(hm.get(key).size());
		}
	}
}
