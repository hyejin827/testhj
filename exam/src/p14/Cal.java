package p14;

import java.util.ArrayList;
import java.util.Scanner;

public class Cal {

	//더하기 빼기 곱하기 나누기를 각각 실행 해주는 인트형 함수 네개를 만들고
	//피연산자 두개와 연산자 하나를 입력받아
	//입력받을 연산자에 맞는 함수를 실행하여 리턴받은 값을 어레이 리스트에 저장
	//저장 한 어레이리스트를 거꾸로 출력하는 프로그램을 작성하시오
	//나누기와 빼기는 자동으로 큰값에서 작은값을 나누거나 빼야됨.
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	public int sum(int num1, int num2) {
		return num1+num2;
	}
	
	public int minus(int num1, int num2) {
		if(num2>num1) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		return num1-num2;
	}

	public int multiple(int num1, int num2) {
		return num1*num2;
	}
	
	public int divicion(int num1, int num2) {
		if(num2>num1) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		return num1/num2;
	}
	public static void main(String[] args) {
		Cal c = new Cal();
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 피연산자 값을 입력해주세요");
		int num1 = s.nextInt();
		System.out.println("두번째 피연산자 값을 입력해주세요");
		int num2 = s.nextInt();
		System.out.println("연산자를 입력해주세요");
		String str = s.next();
		
		if(str.equals("+")) {
			System.out.println(c.sum(num1, num2));
		}else if(str.equals("-")) {
			System.out.println(c.minus(num1, num2));
		}else if(str.equals("*")) {
			System.out.println(c.multiple(num1, num2));
		}else if(str.equals("/")) {
			System.out.println(c.divicion(num1, num2));
		}else {
			System.out.println("잘못입력함");
		}
	}
}
