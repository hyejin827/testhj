package p12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExam02 {
	//String으로 구성된 ArrayList를 선언해주세요.
	//스캐너 클래스를 사용하여 숫자를 입력받아
	//해당 숫자만큼 반복해서 ArrayList의 값을 스캐너 변수로 문자열숫자를 입력받아주세요.
	//중복값은 없어야 합니다.
	//만약 중복값을 입력할 경우 중복값이 있다고 알려구고 다시 돌아야 합니다.
	//ArryaList안에 값을 출력하는 함수를 2개 만들고
	//첫번째 함수는 짝수일때만 출력
	//두번째 함수는 홀수일때만 출력
	ArrayList<String> al = new ArrayList<String>();
	int num1;
	
	void inputAl() {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		num1 = s.nextInt();
		
		for(int i=0;i<num1;i++) {
			System.out.println(i+"번방 숫자를 입력해주세요");
			al.add(s.next());
			for(int j=0;j<i;j++) {
				if(al.get(i).equals(al.get(j))) {
					System.out.println("중복이에요. 다른 숫자를 넣어주세요");
					al.remove(i);
					al.add(s.next());
				}
			}
		}
		for(int i=0;i<num1;i++) {
			System.out.println(i+"번방에 있는 값 "+al.get(i));
		}
	}
	
	void printAl01() {
		for(int i=0;i<num1;i++) {
			if(Integer.parseInt(al.get(i))%2==0) {
				System.out.println(al.get(i));
			}
		}
	}
	
	void printAl02() {
		for(int i=0;i<num1;i++) {
			if(Integer.parseInt(al.get(i))%2!=0) {
				System.out.println(al.get(i));
			}
		}
	}
	public static void main(String[] args) {
		ListExam02 le = new ListExam02();
		le.inputAl();
		System.out.println("==============짝수인 숫자===============");
		le.printAl01();
		System.out.println("==============홀수인 숫자===============");
		le.printAl02();
	}
}
