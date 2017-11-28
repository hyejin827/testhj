package p04;

import java.util.Scanner;

public class LoopTest {
	
	void plusNums(int num1, int num2) {
		int sum = 0;
		for(int i=num1;i<=num2;i++) {
			sum += i;
		}
		System.out.println(sum);
//		int nums = (num1+num2)*(num2/2);
//		System.out.println("1~100을 더한 값은: "+nums);
	}
	
	void oddNums(int num1, int num2) {
		System.out.println("==========홀수만==========");
//		for(int i=1;i<=100;i+=2) {
//			System.out.print(i+",");
//			if(i%10==1) {
//				System.out.println();
//			}
//		}
		for(int i=num1;i<=num2;i++) {
			if(i%2==1) {
				System.out.print(i+",");
			}
			if(i%10==0) {
				System.out.println();
			}
		}
	}
	
	void evenNums(int num1, int num2, int num3) {
		System.out.println("==========짝수만==========");
//		for(int i=2;i<=100;i+=2) {
//		System.out.print(i+",");
//		if(i%10==0) {
//			System.out.println();
//		}
//	}
		if(num1>num2) {
			int tmp=num1;
			num1=num2;
			num2=tmp;
		}
		for(int i=num1;i<=num2;i++) {
			if(i%num3==0) {
				System.out.print(i+",");
			}
			if(i%10==0) {
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		LoopTest lt = new LoopTest();
		
		System.out.println("첫번째 값을 입력해주세요");
		System.out.println("두번째 값을 입력해주세요");
		
		//1~100까지 더한 값을 출력해주세요
//		lt.plusNums(num1,num2);
		
		//1~100까지 홀수만 출력해주세요
//		lt.oddNums(num1,num2);
		System.out.println();
		
		//1~100까지 짝수만 출력해주세요
		lt.evenNums(1,100,7);
		
		//위의 3가지 출력을 함수로 정의하여
		//LoopTest라는 데이터 타입의 변수를 선언하여 호출해주시기 바랍니다.
		
		
			
		}
	}
