package p11;

import java.util.ArrayList;

public class ListExam02 {
	ArrayList<String> alStr;
	ListExam02(){
		alStr = new ArrayList<String>(); //기본생성자 먼저 읽기때문에 여기에 초기화해도됨.
	}
	
	public static void main(String[] args) {
		ListExam02 le = new ListExam02();
		System.out.println(le.alStr.size());
	}
}
