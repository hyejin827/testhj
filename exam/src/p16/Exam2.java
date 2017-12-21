package p16;

public final class Exam2 { //이제 상속안됨.
	//상수
	final int a;
	//선언 시점, 생성자가 호출된 시점에 초기화됨.
	//Exam2 가 죽을 때까지 a는 2!
	//변수에 final을 붙이면 상수가 됨.
	//변수,함수,클래스에 final 사용 가능
	//변수:상수 함수:오버로딩x 클래스:상속x
	Exam2(){
		a=3;
	}
	public static void main(String[] args) {
		Exam2 e = new Exam2();
//		e.a = 4; //에러나여
		System.out.println(new Exam2().a);
	}
}
