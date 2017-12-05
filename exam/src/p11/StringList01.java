package p11;

import java.util.ArrayList;

public class StringList01 extends ArrayList{
//	public String toString() {
//		return "난 내가 뭘 찍어야 할지 모르겠다.";
//	}
	public static void main(String[] args) {
		ArrayList sl = new StringList01();
		sl.add("asdf");
		sl.add("asdf");
		sl.add("asdf");
		sl.add("asdf");
		System.out.println(sl);
	}
}
