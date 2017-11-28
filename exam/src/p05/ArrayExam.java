package p05;

import java.util.Scanner;

public class ArrayExam {
	int num1;
	int num2;
	
	public static void main(String[] args) {
		ArrayExam ae = new ArrayExam();
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 숫자");
		ae.num1 = s.nextInt();
		System.out.println("두번째 숫자");
		ae.num2 = s.nextInt();
		
		int[][] numArr = new int[ae.num1][ae.num2];
//		System.out.println(numArr.length);
//		System.out.println(numArr[0].length);
/*		numArr[0][0] = 1;
		numArr[0][1] = 2;
		numArr[0][2] = 3;
		
		numArr[1][0] = 1;
		numArr[1][1] = 2;
		numArr[1][2] = 3;
		
		numArr[2][0] = 1;
		numArr[2][1] = 2;
		numArr[2][2] = 3;
		
		for(int i=0;i<3;i++) {
			System.out.print(numArr[i][0]+",");
			System.out.print(numArr[i][1]+",");
			System.out.println(numArr[i][2]);
		}*/
		for(int i=0;i<numArr.length;i++) {
			for(int j=0;j<numArr[i].length;j++) {
				numArr[i][j]=j+1+(i*numArr[i].length);
			}
		}
		
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
}
