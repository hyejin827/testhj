package p10;

public class ForEach {
	public static void main(String[] args) {
		//데이터 타입이 확실한 경우 for-each문 사용 가능
		String[] arrStr = { "월", "화", "수", "목", "금", "토", "일" };

		for (int i = 0; i < arrStr.length; i++) {
			String s = arrStr[i];
			System.out.println(s);
		}
		
		for(String s : arrStr) {
			System.out.println(s);
		}
	}
}
