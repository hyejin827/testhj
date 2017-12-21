package p16;

import java.util.ArrayList;

public class ArrayExam {

	private ArrayList<Integer> list;
	ArrayExam(){
		list = new ArrayList<Integer>(); //이거 안하면 그냥 null인 상태
	}
	public ArrayList<Integer> getArrayList(int a, int b) {
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		return list;
	}
}
