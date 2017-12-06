package p12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExam {
	private ArrayList<String> alStr = new ArrayList<String>(); //여기에 만들던지 생성자에 만들던지 해야됨.
//	private이기 때문에 Excute에는 쓸 수 없음	
//	ListExam(){
//		alStr = new ArrayList<String>();
//	}
	
	void inputAlStr() {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 스트링을 넣어주세요. 구분자는 ,입니다.");
		String str = s.nextLine();
//		str = "132,212,42343";
//		String[] strs = str.split(",");
//		for(String ss:strs) {
//			System.out.println(ss);
//		}
		String[] strs = str.split(",");
		for(int i=0;i<strs.length;i++) {
			alStr.add(strs[i]);
		}
	}
	//처음 alStr변수에 값을 add했을때는 '처음 값을 추가했네여'
	//처음이 아니라면 바로 전에 입력한 값을 출력해주세요.
	void add(String str) {
//		if(alStr.size()==0) { //if(alStr.isEmpty())
//			System.out.println("처음 추가해쪄");
//		}else {
//			System.out.println(alStr.get(alStr.size()-1));
//		}
		alStr.add(str);
	}
	
	String get(int idx) {
		return alStr.get(idx);
	}
	
	void remove(int idx) {
		alStr.remove(idx); //remove하면 사이즈도 변함
	}
	
	void printAlStr() {
//		for(int i=0;i<alStr.size();i++) {
//			System.out.println(i+"번째 방에 있는 "+alStr.get(i)); //return이 되기 때문에 sysout에 쓸수있음.
//		}
//		for(String s : alStr) {
//			System.out.println(s);
//		}
		for(int i=0;i<alStr.size();i++) {
			if(Integer.parseInt(alStr.get(i))%2==0) {
				remove(i); 
				i--;
			}else {
				System.out.println(i+"번째 값 : "+alStr.get(i)); //적어줘야됨
			}
		}
	}
	
	void printAlStr2() {
		int sum = 0;
		for(int i=0;i<alStr.size();i++) {
			String numStr = alStr.get(i);
			int num = Integer.parseInt(numStr);
			sum +=num;
			System.out.println(i+"번째 값 : "+numStr);
		}
		System.out.println("입력하신 숫자의 총 합은 : "+sum);
	}
}
