package p03;

import java.util.Scanner;

public class ObjectExam {
	int num1; //멤버변수: 클래스 안에는 있지만 다른 영역에는 포함되지 않는 변수
	int num2; //정해져있는 타입  default값 = 0, 정해져있지 않는 타입 = null
	
	//ObjectExam(){ //기본생성자는 생략가능, 얘는 함수아님. 메모리 생성하는 역할, 생성자는 무조건 클래스랑 이름 같아야함
	//	System.out.println("기본 생성자를 호출하셨군요!");
	//}
	
	void add() {
		//num1 = 3; //멤버변수 호출가능
		System.out.println("ObjectExam의 num1 = " + num1);
		System.out.println("add() 함수 호출했구나");
	}
	
	int getNum2(int num2) { //여기의 num2는 여기서만 사용됨
		return num2;
	}
	
	void inputNums() {
		Scanner s = new Scanner(System.in); //얘도 생성자, (파라매터)가 있기때문에 기본생성자 ㄴㄴ
		System.out.println("첫번째 숫자를 입력해주세요");
		num1 = s.nextInt();
		System.out.println("두번째 숫자를 입력해주세요");
		num2 = s.nextInt();
	}
	
	void printLoop() {
		for(int i=num1;i<num2;i++) {
			System.out.print(i+",");
			if(i%10==0) {
				System.out.println("");
			}
		}
		System.out.println(num2);
	}
	
	public static void main(String[] args) {
		ObjectExam o;
		o = new ObjectExam(); //new로 태어났쪙 얘는 생성자!
		
		//o.add(); //()사용할때: 함수 선언, 함수호출
		//o.num2 = 4;
		//System.out.println(o.num1); //add함수에서 3으로 선언했기때문에 3이 호출됨
		
		//o.num1 = 4;
		//System.out.println(o.num1);
		//o.add(); //이것도 값은 4지롱
		
		//o.num1 = 1;
		//o.num2 = 10;
		
		//ObjectExam o2;
		//o2 = new ObjectExam();
		//o2.num1 = 2;
		//o2.num2 = 20;
		
		//o.printLoop();
		//o2.printLoop();
		
		o.inputNums();
		o.printLoop();
		o.inputNums();
		o.printLoop();
	}

}
