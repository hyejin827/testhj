package p07;

import java.util.Scanner;

public class Exam011 {
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;

	void inputNums() {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째");
		num1 = s.nextInt();
		System.out.println("두번째");
		num2 = s.nextInt();
		System.out.println("세번째");
		num3 = s.nextInt();
		System.out.println("네번째");
		num4 = s.nextInt();
		System.out.println("다섯번째");
		num5 = s.nextInt();
	}

	void print() {
		for (int i = num1; i > num2; i--) {
			for (int j = num3; j > num4; j--) {
				String str = i + "X" + j + "= " + i * j;
				if (i * j % num5 == 0) {
					str = num5 + "의 배수";
				}
				System.out.print(str);
				if (j != 1) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Exam011 e = new Exam011();
		e.inputNums();
		e.print();
	}
}
