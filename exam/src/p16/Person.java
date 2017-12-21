package p16;

public class Person implements Action{
// 사람,동물 공통부분을 묶어놓은것(먹다, 자다, 걷다)
// 인터페이스 구현 받으면 반드시 오버라이딩 해야됨. (action)
// 인터페이스의 접근제어자는 public
// 인터페이스를 가지고 있으면 무조건 구현해줘야됨.
// 인터페이스는 규격(ex.밴딩머신)
	public String name;
	public int age;
	public int height;
	public String email;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", email=" + email + "]";
	}
	@Override
	public void eat() {
		System.out.println(this.name+" eat() 호출!!");
	}
	@Override
	public void sleep() {
		System.out.println(this.name+" sleep() 호출!!");
	}
	@Override
	public void walk() {
		System.out.println(this.name+" walk() 호출!!");
	}
}
