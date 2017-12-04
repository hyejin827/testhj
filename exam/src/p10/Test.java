package p10;

public class Test {
	public static void main(String[] args) {
		String str = "1234가나다";
		int a = str.indexOf("라");
		System.out.println(a);
		//str안에 없는 글자를 넣으면 -1이 출력됨.
	}
}
