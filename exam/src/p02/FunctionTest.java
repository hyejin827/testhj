package p02;

public class FunctionTest {
	
	static void add(int num1, int num2) { //void는 데이터타입이 없다는 뜻, return값 없음 / num1,2는 인자값
		System.out.println(num1+num2);
	}
	static String add2(int num1, int num2) {
		return num1+ "+" +num2+ "의 결과값은 " + (num1+num2) + "입니다.";
		
		
	}
	public static void main(String[] args) {
		add(1,2);
		String result = add2(1,3);
		System.out.println(result);
	}

}
