package p11;

import java.util.ArrayList;

public class ListExam031 {
	public static void main(String[] args) {
//		ArrayList alInt = new ArrayList();
//		alInt.add("1");
//		alInt.add(1);
//		alInt.add(true);
//		
//		for (Object i : alInt) {
//			System.out.print(i + ",");
//		} // 이렇게 쓰지마여 차라리
		
		ArrayList<String> alInt = new ArrayList<String>();
		alInt.add("1");
		alInt.add(1+"");
		alInt.add(true+"");
		
		for (String i : alInt) {
			System.out.print(i + ",");
		}
		// 이렇게 쓰세여
	}
}
