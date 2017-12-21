package p14;

import java.util.ArrayList;
import java.util.Scanner;

public class Cal02 {

	int num1;
	int num2;
	String op;
	
	void init(){
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째");
		num1 = s.nextInt();
		System.out.println("연산자");
		op = s.next();
		System.out.println("두번째");
		num2 = s.nextInt();
		
		if(num2>num1) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
	}
	
	int add() {
		return num1+num2;
	}
	
	int minus() {
		return num1-num2;
	}
	
	int multiple() {
		return num1*num2;
	}
	
	int divide() {
		return num1/num2;
	}
	
	int cal() {
		if(op.equals("+")) {
			return add();
		}else if(op.equals("-")) {
			return minus();
		}else if(op.equals("*")) {
			return multiple();
		}else if(op.equals("/")) {
			return divide();
		}
		System.out.println("잘못입력함");
		return 0;
	}
	public static void main(String[] args) {
		Cal02 c = new Cal02();
		ArrayList<Cal02> al = new ArrayList<Cal02>();
		for(int i=0;i<2;i++) {
			c = new Cal02();
			c.init();
			al.add(c);
		}
		for(int i=al.size()-1;i>=0;i--){
			c=al.get(i);
			System.out.println(c.cal());
		}
	}
}
