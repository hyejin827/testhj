package p04;

import java.util.Scanner;

public class MyTest {
	
	void plusNums(int num1, int num2) {
		int sum = 0;
		for(int i=num1;i<=num2;i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	void oddNums(int num1, int num2) {
		System.out.println("==========홀수만==========");
		for(int i=num1;i<(num2-1);i++) {
			if(i%2==1) {
				System.out.print(i+",");
			}
			if(i%10==0) {
				System.out.println();
			}
		}
		
		if(num2%2==1) {
			System.out.println(num2);
		}else {
			System.out.println(num2-1);
		}
	}
	
	void evenNums(int num1, int num2) {
		System.out.println("==========짝수만==========");
		for(int i=num1;i<(num2-1);i++) {
			if(i%2==0) {
				System.out.print(i+",");
			}
			if(i%10==0) {
				System.out.println();
			}
		}
		
		if(num2%2==0) {
			System.out.println(num2);
		}else {
			System.out.println(num2-1);
		}
	}
	
	public static void main(String[] args) {
		MyTest lt = new MyTest();
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 값을 입력해주세요");
		int num1=s.nextInt();
		System.out.println("두번째 값을 입력해주세요");
		int num2=s.nextInt();
		//1~100까지 더한 값을 출력해주세요
		lt.plusNums(num1,num2);
		
		//1~100까지 홀수만 출력해주세요
		lt.oddNums(num1,num2);
		System.out.println();
		
		//1~100까지 짝수만 출력해주세요
		lt.evenNums(num1,num2);
			
		}
	}
