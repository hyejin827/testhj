package p05;

import java.util.Scanner;

public class FunctionArrayExam {
	int num1;
	int num2;
	int[][] numArr;
	
	void inputNums() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 숫자");
		num1 = s.nextInt();
		System.out.println("두번째 숫자");
		num2 = s.nextInt();
	}
	
	void initNumArr() {
		numArr = new int [num1][num2];
		int num = 1;
		for(int i=0;i<numArr.length;i++) {
			for(int j=0;j<numArr[i].length;j++) {
				numArr[i][j]=j+1+(i*numArr[i].length); //numArr[i][j]=num++;
			}
		}
	}
	
	void printNumArr() {
		for(int i=0;i<numArr.length;i++) {
			for(int j=0;j<numArr[i].length;j++) {
				System.out.print(numArr[i][j]);
				if(j!=numArr[i].length-1) {
					System.out.print(",");
				}else {
					System.out.println();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		FunctionArrayExam ae = new FunctionArrayExam();
		ae.inputNums();
		ae.initNumArr();
		ae.printNumArr();
	
		
		int a = 1;
		System.out.println(a++);
		System.out.println(a);
		a = 1;
		System.out.println(++a);
	}
}
