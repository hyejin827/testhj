package p15;

import java.util.ArrayList;

public class DAO {
	ArrayList<User> userList = new ArrayList<User>(); //원래는 getUserList(String str)여기 있었는데 멤버변수로 뺌
	
	public boolean insertUser(User user) {
		return userList.add(user);
	}
	public User getUser(User user) {
		for(User u : userList) {
			if(u.getAge() == user.getAge() && u.getName().equals(user.getName()) && u.getNo() == user.getNo()) {
				return u;
			}
		}
		return null;
	}
	public User getUser(int no) {
		for(User u : userList) {
			if(u.getNo() == no) {
				return u;
			}
		}
		return null;
	}
	public boolean updateUser(User user) {
		User u = getUser(user.getNo());
		if(u==null) {
			return false;
		}else {
			u.setName(user.getName());
			u.setAge(user.getAge());
			return true;
		}
	}
	public ArrayList<User> getUser(String name) {
		ArrayList<User> userList = new ArrayList<User>();
		for(User u : this.userList) { //꼭 this.userList! userList는 방금 윗줄에서 만든거니까
			if(u.getName().indexOf(name)!=-1) {
				userList.add(u);
			}
		}
		return userList;
	}
	public boolean removeUser(User user) {
		User u = getUser(user.getNo());
		if(u==null) {
			return false;
		}
		return userList.remove(u);
	}
	
//	public boolean removeUser(User user) {
//		return userList.remove(user);
//	} //이렇게 쓰면 삭제가 안됨. 메모리 주소 비교하기 때문!
	
	public ArrayList<User> getUserList(String str){
//		User u = new User("나나",30);
//		userList.add(u);
//		u = new User("미미",20);
//		userList.add(u); //insert만들었기 때문에 이제 필요없엉
		if(str == null) {
			return userList;
		}else {
			ArrayList<User> userList = getUser(str);
			return userList;
		}		
	}
}
