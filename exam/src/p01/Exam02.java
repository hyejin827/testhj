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
		}else if(op.equals("-")){
			result = a-b;
		}else if(op.equals("*")){
			result = a*b;
		}else if(op.equals("/")){
			result = a/b;
		}else if(op.equals("%")) {
			result = a%b;
		}else {
			System.out.println("연산자는 +,-,*,/ 만 입력가능합니다.");
			System.exit(0); //result값 안나오고 강제종료
		}
		
		//System.out.printf("a와 b를 더한 값은 %d", a+b);
		//System.out.println("a와 b를 더한 값은 ", (a+b));
		//System.out.println("a = " + a + ", b = " + b +", op = " + op);
		System.out.println("result = " + result);
		s.close(); //(System.in) in을 썼으면 꺼야됨 안써도됨
	}

}
