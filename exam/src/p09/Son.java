package p09;
//"상속"할때만 같은 함수명, 같은 데이터타입 사용가능:오버라이딩
public class Son extends FaFa {

	public Son() {

	}
	public void print() {
		System.out.println("나야!!!!!!!!");
	}
	
	protected void print(String str) {
		System.out.println(str);
	}
	
	void print(String str,String str2) {
		System.out.println(str+","+str2);
	}

	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s.a);
		s.print();
	}
}
