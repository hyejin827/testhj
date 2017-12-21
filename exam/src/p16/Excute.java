package p16;

public class Excute {
	
	public void printAction(Action act) {
		//eat호출시 누구누구가 먹습니다.
		act.eat();
		//sleep호출시 누구누구가 잡니다.
		act.sleep();
		//walk호출시 누구누구가 걷습니다.
		act.walk();
		
//		act.eat("asf"); //cat이 파라매터값이 있는게 없기때문에 쓸수없음
	}

	public static void main(String[] args) {
////		Person p = new Hong("Hong",10,130,"hong@gmail.com");
//		Action p = new Hong("Hong",10,130,"hong@gmail.com");
//		System.out.println(p);
////		((Hong)p).eat("스팸!!!"); //오버로딩 가능
////		((Person)p).eat("스팸!!!"); //이렇게 쓰더라도 아들을 마지막으로 생성하기 때문에 아들꺼를 불러옴
////		Hong은 Hong, Action, Person, (Object)로 불릴 수 있음
//		p.eat();
//		p.sleep();
//		p.walk();
		
		Hong hong = new Hong("Hong",10,130,"hong@gmail.com");
		Excute e = new Excute();
		e.printAction(hong);
		//동물도 이름, 나이, 몸길이를 가지게 만들고
		//Cat생성자 호출시 이름 나이 몸길이를 저장하게 만들어주세요.
		Cat a = new Cat("야옹이", 1, 15);
		e.printAction(a);
	}
}
