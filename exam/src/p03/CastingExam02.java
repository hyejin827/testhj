package p03;

public class CastingExam02 {
	
	public static void main(String[] args) {
		int i = 10; //데이터타입, 변수명, 값 기억함
		Integer it = 10; 
		int test = it.intValue(); //it은 Integer가 가지고 있는 변수, 함수를 모두 기억함
		
		long l = 10;
		Long ln = new Long(10);
		
		double d = 10.1;
		Double db = 10.1;
		
		boolean b = true;
		Boolean bl = true;
		
		char[] c = {'s','t','r','i','n','g'};
		String str = "string";
	}

}
