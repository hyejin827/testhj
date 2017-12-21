package p16;

import java.util.Scanner;

public class ExceptionExam {

//	public void convertAndPrint(String numStr) {
//		try {
//		System.out.println(Integer.parseInt(numStr)+1);
//		}catch(Exception e) {
//			System.out.println("숫자를 적어야지 바뷰야");
//		}
//	}
	public void convertAndPrint(String numStr) throws Exception{
		System.out.println(Integer.parseInt(numStr)+1);
	}
	
	public static void main(String[] args) {
		ExceptionExam ee = new ExceptionExam();
		Scanner s = new Scanner(System.in);
		System.out.println("출력할 숫자");
		String str = s.nextLine();
		try {
			ee.convertAndPrint(str);
		} catch (Exception e) {
			System.out.println("숫자를 적어야지 바뷰야");
			System.out.println("출력할 숫자");
			str = s.nextLine();
			try {
				ee.convertAndPrint(str);
			} catch (Exception e1) {
				System.out.println("숫자를 적어야지 바뷰야");
			}
		}
	}
}
