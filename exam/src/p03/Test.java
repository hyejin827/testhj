package p03;

public class Test {
	
	String str;
	
	Test(String str){ 
		this.str = str;
	}
	void print() {
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		Test t = new Test("가나다ABC123");
		t.print();
		
		
//파라매터와 리턴값 타입은 같지 않아도됨... 나 커피셔틀
	}
}
