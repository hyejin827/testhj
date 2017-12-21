package p15;

import java.util.ArrayList;

public class Excute2 {
	public static void main(String[] args) {
//		DAO dao = new DAO();
//		ArrayList<User> userList = dao.getUserList(""); 
//		dao를 직접적으로 건드리지 않기 위해 밑에처럼 씀
		
		Controller c = new Controller();
		for(int i =1;i<=5;i++) {
			User user = new User("이름"+i,i,i);
			c.get("add",user);
		}
		
		ArrayList<User> userList = c.get("List",null);
		for(User user : userList) {
			System.out.println(user);
		}
		User ru = new User(3);
		c.get("remove", ru);
		for(User user : userList) {
			System.out.println(user);
		}
		
		ru.setName("이름1");
		userList = c.get("search", ru);
		c.get("add", ru);
		System.out.println("검색결과");
		for(User user : userList) {
			System.out.println(user);
		}
		
		User user = new User("모모",20,2);
		c.get("update", user);
		userList = c.get("List",null); //이걸 하지 않으면 search 검색결과가 나옴
		for(User u : userList) {
			System.out.println(u);
		}
	}
}
