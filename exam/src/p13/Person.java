package p13;

public class Person {
	private String name; //은닉화
	private int age;
	
	public String getName() { //캡슐화
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString1() {
		return "이름은  : "+name+", 나이는 : "+age+"살";
	}
}
