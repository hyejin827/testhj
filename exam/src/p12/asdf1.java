package p12;

public class asdf1 {
	private static void swap(Integer a, Integer b) {
		Integer temp =a;
		a=b;
		b=temp;
	}
	public static void main(String[] args) {
		Integer a = new Integer(1);
		Integer b = new Integer(2);
		
		System.out.println("a : "+a.intValue());
		System.out.println("b : "+b.intValue());
		
		swap(a,b);
		
		System.out.println("a : "+a.intValue());
		System.out.println("b : "+b.intValue());
	}
}
