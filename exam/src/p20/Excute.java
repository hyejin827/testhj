package p20;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Excute {

	public static void main(String[] args) throws SQLException {
		Service s = new Service();
		LinkedHashMap<String,Object> hm = new LinkedHashMap<String,Object>();
//		hm.put("cidesc", "네트워크보안반");
//		hm.put("cino",3);
//		int result = s.updateClassInfo(hm);
//		if(result==1) {
//			System.out.println("업데이트 잘됐음!!");
//		}
//		hm = new LinkedHashMap<String,Object>();
//		hm.put("uiname", "박혜진");
//		hm.put("uino",11);
//		if(s.updateUserInfo(hm)==1) {
//			System.out.println("user_info 업데이트됨!!");
//		}
//		
//		hm = new LinkedHashMap<String,Object>();
//		hm.put("cino", 4);
//		result=s.deleteClassInfo(hm);
//		if(result==1) {
//			System.out.println("삭제 잘됐음!!");
//		}
		
//		hm = new LinkedHashMap<String,Object>();
//		hm.put("uino",11);
//		if(s.deleteUserInfo(hm)==1) {
//			System.out.println("user_info 삭제됨!!");
//		}
		
//		hm = new LinkedHashMap<String,Object>();
//		hm.put("cino",6);
//		hm.put("ciname","메롱");
//		hm.put("cidesc","메롱");
//		result = s.insertClassInfo(hm);
//		if(result==1) {
//			System.out.println("입력 잘됐음!!");
//		}
		
//		hm = new LinkedHashMap<String,Object>();
//		hm.put("uiname","피카츄");
//		hm.put("uiage",25);
//		hm.put("uiid","아이디");
//		hm.put("uipwd","비밀번호");
//		hm.put("cino",6);
//		hm.put("address","고속터미널");
//		if(s.insertUserInfo(hm)==1) {
//			System.out.println("user_info 입력 잘됐음!!");
//		}
		
		ArrayList<HashMap<String,Object>> classList = s.selectClassInfo();
		System.out.println(classList);
		
		ArrayList<HashMap<String,Object>> userList = s.selectUserInfo();
		System.out.println(userList);
	}
}
