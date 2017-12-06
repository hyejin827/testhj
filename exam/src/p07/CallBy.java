package p07;

public class CallBy {
	
	void doFunc(int[] a, int[] b) {
		a = new int[4];
		a[0] = 3;
		
		
		//a = new int[4];
		//a[0] = 3; //순서를 바꾸면 밑에 main에서 sysout값이 바뀜ㅎ 나자신은 바꿀수 없지만 안에있는 내용은 바꿀 수 있음.
	}
	public static void main(String[] args) {
		int[] a = new int[1];
		int[] b = new int[2];
		//a=b;		
		//System.out.println(a==b);
		
		CallBy cb = new CallBy();
		cb.doFunc(a, b);
		System.out.println(a[0]);
		System.out.println(a.length);
	}
}
