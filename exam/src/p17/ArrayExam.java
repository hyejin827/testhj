package p17;

import java.util.ArrayList;

//아래의 ArrayExam2클래스를 실행하게 되면 다음과 같은 결과가 나옵니다.
//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//위에 결과가 올바르게 나올 수 있도록 대괄호[]안에 알맞은 답을 적어주세요.

public class ArrayExam {
	private ArrayList list;

	ArrayExam() {
		list = new ArrayList();
	}

	public ArrayList getArrayList(int a, int b) {
		return list;
	}
}
