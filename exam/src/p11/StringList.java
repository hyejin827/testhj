package p11;

import java.util.ArrayList;

public class StringList {
	
	ArrayList<String> alStr;
	StringList(){
		alStr = new ArrayList<String>();
	}
	
	public void initAlStr() {
		for(int i=0;i<10;i++) {
			alStr.add(i+"");
		}
	}
	
	public void printAlStr() {
		for(int i=0;i<10;i++) {
			System.out.print(alStr.get(i)+",");
		}
	}
	
	public static void main(String[] args) {
		StringList sl = new StringList();
		int len = sl.alStr.size();
		System.out.println(len);
		sl.alStr.add("123");
		System.out.println(len);
		len = sl.alStr.size();
		System.out.println(len);
		
		sl.initAlStr();
		sl.printAlStr();
		
		System.out.println(sl.alStr); //object가 toString을 가지고 있어서 리스트가 오버라이딩함.
	}
}
