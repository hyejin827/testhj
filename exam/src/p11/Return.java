package p11;

public class Return {
	public String getStr() {
		return "123";
	}
	public void getInt() {
		System.out.println("123");
	}
	public static void main(String[] args) {
		Return r = new Return();
		System.out.println(r.getStr());
		r.getInt();
		//System.out.println(r.getInt()); // -> 얘는 getInt함수 데이터타입이 void이기 때문에 sysout안에 쓸수 없음
	}
}
