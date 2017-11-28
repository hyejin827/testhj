package p05;

import java.util.Scanner;

public class HomeWork02 {
	// Scanner Ŭ������ 2���� ���ڸ� �Է¹ް� ���������� +,-�� �Է¹�������
	// +�ϰ�� �տ� �Է¹��� 2���� ���ڸ�ŭ �ݺ��ϴ� �ݺ����� ����� ��� ���ϰ�
	// -�ϰ�쿡�� ���� ������ ����� ������ּ���
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1;
		int num2;
		String str;
		
		System.out.println("첫번째");
		num1 = s.nextInt();
		System.out.println("두번째");
		num2 = s.nextInt();
		System.out.println("+,-");
		str = s.next();
		
		int sum=0;
		if(str.equals("+")) {
			for(int i=num1;i<=num2;i++) {
				sum += i;
			}
		}else if(str.equals("-")) {
			for(int i=num1;i<=num2;i++) {
				sum -= i;
			}
		}else {
			System.out.println("+,-");
		}
		System.out.println(sum);
	}
}
