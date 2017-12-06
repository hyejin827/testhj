package p12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//초기값 맥스값 받고 반복문
//랜덤 함수로 값 받음
//ArrayList<Integer> 사용해서 반만큼 사이즈 변수 넣어주세요
public class Quiz {
	ArrayList<Integer> al;
	int minNum;
	int maxNum;
	
	Quiz() {
		al = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);		
		System.out.println("초기값?");
		minNum = s.nextInt();
		System.out.println("최대값?");
		maxNum = s.nextInt();

	}
	
	void initNum() {
		Random r = new Random();
		for(int i=minNum;i<maxNum;i++) {
			int n = (r.nextInt(maxNum-minNum)+1)/2;
			if(al.size()==(maxNum-minNum)/2) {
				i=maxNum;
			}
			if(n%2==0) {
				al.add(n);
			}else {
				i--;
			}
		}
	}
	
	void printAl() {
		System.out.println(al);
	}

	public static void main(String[] args) {
		Quiz q = new Quiz();
		q.initNum();
		q.printAl();
		System.out.println(q.al.size());
	}
}
