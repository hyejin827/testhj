package p13;

import java.util.ArrayList;

public class Excute02 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("메롱롱");
		p.setAge(20);
		ArrayList<Person> alPerson = new ArrayList<Person>();
		alPerson.add(p);
		p = new Person();
		p.setName("메롱롱롱");
		p.setAge(30);
		alPerson.add(p);
		for (int i = 0; i < alPerson.size(); i++) {
			Person pr = alPerson.get(i);
			for (int j = i + 1; j < alPerson.size(); j++) {
				Person pr2 = alPerson.get(j);
				if (pr.getAge() < pr2.getAge()) {
					Person tmpP = pr;
					pr = pr2;
					pr2 = tmpP;
					alPerson.set(i, pr); // i자리에 pr을 넣고
					alPerson.set(j, pr2);// j자리에 pr2를 넣어주세요
//					alPerson.set(i, pr2); 
//					alPerson.set(j, pr);
				}
			}
		}
		for (Person pr : alPerson) {
			System.out.println(pr); // pr.toString()을 부르는거
		}
	}
}
