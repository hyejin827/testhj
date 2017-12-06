package p12;

import java.util.ArrayList;
import java.util.Scanner;

//class는 접근제어자 public, default밖에 못씀
public class ListExam03 {
	ArrayList<String> al = new ArrayList<String>();
	ListExam03() {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 몇개?");
		int max = s.nextInt();
		for(int i=1;i<=max;i++) {
			System.out.println(i+"번째 숫자를 입력해주세요");
			int n = s.nextInt();
			if(al.indexOf(n+"")!=-1) {
				System.out.println(n+"값은 중복 되었습니다. 다시 입력바랍니다.");
				i--;
			}else {
				al.add(n+"");
			}
		}
	}
	
	void printOdd() {
		for(String s : al) {
			int num = Integer.parseInt(s);
			if(num%2==1) {
				System.out.println(num);
			}
		}
	}
	
	void prinEven() {
		for(String s : al) {
			int num = Integer.parseInt(s);
			if(num%2==0) {
				System.out.println(num);
			}
		}
	}
	
	void printOddOrEven(int checkNum) {
		for(String s : al) {
			int num = Integer.parseInt(s);
			if(num%2==checkNum) {
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args) {
		ListExam03 le = new ListExam03();
		le.printOdd();
		le.prinEven();
		le.printOddOrEven(0);
		le.printOddOrEven(1);
	}
}
