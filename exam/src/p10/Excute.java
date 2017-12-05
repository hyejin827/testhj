package p10;

public class Excute  {
	// 오버라이딩:무조건 상속이 되어있어야됨. 아빠꺼 말고 내꺼 출력할랭!!!!/데이터타입 같아야함./접근제어자 확장은 가능하지만 줄어들순없음
	// \t \r \n
	// default 같은 패키지만
	// protected 같은 패키지+자식
	// private 나만!!!
	// public 모두다
	//
	// 컨트롤 클릭/커서두고 f3

//	Excute(int num1, int num2) {
//		super(num1, num2);
//	}
//	
//	public void print() {
//		System.out.println("내꺼 프린트");
//	}
//	
//	public void print(int a) {
//		if(a==0) {
//			this.print();
//		}else {
//			super.print();
//		}
//	}
	/*public void print() {

		for (int i = minNum; i < maxNum; i++) {
			String str = i + "";
			str = str.replace("3", "짝");
			str = str.replace("6", "짝");
			str = str.replace("9", "짝");
			if (str.indexOf("짝") > -1) {
				System.out.print("짝,");
			} else {
				System.out.print(str + ",");
			}
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}*/

//	public static void main(String[] args) {
//		//Excute e = new Excute(1, 100);
//		//Father e = new Excute(1,1000); // -> 가능해여
//		// Object e = new Excute(1,1000); // -> 가능해여
//		//Excute e2 =(Excute)e;
//		//e2.print(1); 
//		Father f = new Father(1,2);
//		Father f1 = new Son();
//		Father f2 = new Excute(1,2);
//		System.out.println(f2 instanceof Excute); //f2를 Excute라고 불러도돼?
//		System.out.println(f2 instanceof Father);
//		System.out.println(f instanceof Excute);
//		
//		if(f2 instanceof Excute) {
//			Excute e = (Excute)f2;
//			e.print(1);
//		}
//		if(f1 instanceof Excute) {
//			Excute e = (Excute)f2;
//			e.print(1);
//		}
//		Father[] fs = new Father[3];
//		fs[0] = new Father(1,2);
//		fs[1] = new Son();
//		fs[2] = new Excute(1,2);
//		
//	}
	public void print(Father f) {
		System.out.println(f.toString());
	}
	
	public static void main(String[] args) {
		Father f = new Father(1,2);
		Excute e = new Excute();
		e.print(f);
	}
}
