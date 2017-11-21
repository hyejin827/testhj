package p01;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		String op = s.nextLine().trim(); // trim:양쪽 공백 문자를 없앰, nextLine때문에 실행하고 b값 옆에 적어야됨
		int result = 0;
		
		if(op.equals("+")) {
			result = a+b;
		}
		
		//System.out.printf("a와 b를 더한 값은 %d", a+b);
		//System.out.println("a와 b를 더한 값은 ", (a+b));
		//System.out.println("a = " + a + ", b = " + b +", op = " + op);
		System.out.println("result = " + result);
	}

}
