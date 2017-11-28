package p05;

import java.util.Scanner;

public class ArrayExam2 {

	public static void main(String[] args) {
		//스캐너 클래스로 구구단의 최대값을 입력받아 주세요
		//입력받은 각각의 단 만큼 구구단을 출력하는 프로그램을 작성해 주세요
		//배열말고해봐연
		Scanner s = new Scanner(System.in);
		int num1;
		int num2;
		
		num1=s.nextInt();
		num2=s.nextInt();
		
		int numArr[][] = new int[num1][num2];
		for(int i=0;i<numArr.length;i++) {
			for(int j=0;j<numArr[i].length;j++) {
				numArr[i][j] = i*j;
			}
		}
		
		for(int i=1;i<numArr.length;i++) {
			for(int j=1;j<numArr[i].length;j++) {
				System.out.print(i+"X"+j+"="+numArr[i][j]);
				if(j!=numArr[i].length-1) {
					System.out.print(",");
				}else {
					System.out.println();
				}
			}
		}
	}
}
