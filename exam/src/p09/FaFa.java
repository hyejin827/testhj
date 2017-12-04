package p09;

public class FaFa {
	protected int a = 3;
	
	public FaFa() { //기본생성자이기 때문에 p10 excute에서 아빠 생성자 호출이 출력됨.
		System.out.println("아빠 생성자 호출");
	}
	
	public FaFa(String str) {
		System.out.println("아빠 생성자 호출:"+str);
	}
	
	public FaFa(String str, String str2) {
		System.out.println("아빠 생성자 호출:"+str2);
	}
	
	public void print() {
		System.out.println("내가 니 애비다!");
	}
	
	protected void print(String str) {
		System.out.println(str+":아빠함수");
	}
}
