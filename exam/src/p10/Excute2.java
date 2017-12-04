package p10;

public class Excute2 {

	public static void main(String[] args) {
		Object p1 = new Person();
		Object p2 = new P2();
		//p1.print(); //object는 print없쪙 그래서 오류남
		
		// System.out.println(p1.toString());
		// System.out.println(p2.toString());
		// 아빠(Person)는 toString이 있기때문에 P2는 없어도됨
		
		
		//P3클래스 생성 후, P2상속
		//P4클래스 생성 후, P3상속
		//toString() 함수 모두 선언
		//각각의 클래스들을 모두다 object 데이터 타입으로 변수 선언 및 생성자 호출하여 초기화
		//오브젝트 배열에 넣어주세요
		//반복문 사용해서 오브젝트 베열에 있는 각각의 방에 있는 변수를 system.out.println();
		Object p3 = new P3();
		Object p4 = new P4();
		Object[] oj = new Object[3];
		oj[0] = p2;
		oj[1] = p3;
		oj[2] = p4;
		
		for(int i=0;i<oj.length;i++) {
			System.out.println(oj[i]);
		}
		
		for(Object o : oj) {
			System.out.println(o);
		}
	}
}
