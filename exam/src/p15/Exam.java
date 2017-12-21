package p15;

public class Exam {
	String str = "123";
	public static void main(String[] args) {
		Exam e = new Exam();
		String str = new String("123");
		System.out.println(str == e.str);
		System.out.println(e.str=="123");
		
		e.str = new String("123");
		System.out.println(str == e.str);
	}
}
