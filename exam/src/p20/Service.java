package p20;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Service {
	DBCon dbcon;
	Service(){
		dbcon = new DBCon();
	}
	
	public int updateClassInfo(LinkedHashMap<String,Object> hm) {//몇개 업데이트 됬는지 알려죵
		int result = 0;
		String sql = "update class_info\r\n" + 
				"set cidesc=?\r\n" + 
				"where cino=?";
		try { //에러나면 무조건 처리행! try catch 만들어!
			result = dbcon.executeUpdate(sql,hm);
			dbcon.commit();
		} catch (SQLException e) {
			try {
				dbcon.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally { //에러가 나든 안나든 dbcon끊어줘야됨
			try {
				dbcon.closeAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		return result;
	}
	public int updateUserInfo(LinkedHashMap<String,Object> hm) {//몇개 업데이트 됬는지 알려죵
		int result = 0;
		String sql = "update user_info\r\n" + 
				"set uiname=?\r\n" + 
				"where uino=?";
		try { //에러나면 무조건 처리행! try catch 만들어!
			result = dbcon.executeUpdate(sql,hm);
			dbcon.commit();
		} catch (SQLException e) {
			try {
				dbcon.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally { //에러가 나든 안나든 dbcon끊어줘야됨
			try {
				dbcon.closeAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		return result;
	}
	public int insertClassInfo(LinkedHashMap<String,Object> hm){
		int result = 0;
		String sql = "insert into class_info(cino,ciname,cidesc)\r\n"
				+ "values(?,?,?)";
		try { //에러나면 무조건 처리행! try catch 만들어!
			result = dbcon.executeUpdate(sql,hm);
			dbcon.commit();
		} catch (SQLException e) {
			try {
				dbcon.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally { //에러가 나든 안나든 dbcon끊어줘야됨
			try {
				dbcon.closeAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		return result;
	}
	public int insertUserInfo(LinkedHashMap<String,Object> hm){
		int result = 0;
		String sql = "insert into user_info(uiname,uiage,uiid,uipwd,cino,uiregdate,address)\r\n"
				+ "values(?,?,?,?,?,now(),?)";
		try { //에러나면 무조건 처리행! try catch 만들어!
			result = dbcon.executeUpdate(sql,hm);
			dbcon.commit();
		} catch (SQLException e) {
			try {
				dbcon.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally { //에러가 나든 안나든 dbcon끊어줘야됨
			try {
				dbcon.closeAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		return result;
	}
	public int deleteClassInfo(LinkedHashMap<String,Object> hm){
		int result = 0;
		String sql = "delete from class_info where cino=?";
		try { //에러나면 무조건 처리행! try catch 만들어!
			result = dbcon.executeUpdate(sql,hm);
			dbcon.commit();
		} catch (SQLException e) {
			try {
				dbcon.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally { //에러가 나든 안나든 dbcon끊어줘야됨
			try {
				dbcon.closeAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		return result;
	}
	public int deleteUserInfo(LinkedHashMap<String,Object> hm){
		int result = 0;
		String sql = "delete from user_info where uino=?";
		try { //에러나면 무조건 처리행! try catch 만들어!
			result = dbcon.executeUpdate(sql,hm);
			dbcon.commit();
		} catch (SQLException e) {
			try {
				dbcon.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally { //에러가 나든 안나든 dbcon끊어줘야됨
			try {
				dbcon.closeAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		return result;
	}
	public ArrayList<HashMap<String,Object>> selectClassInfo() throws SQLException{
		String sql = "select * from class_info";
		return dbcon.executeQuery(sql,null);
	}
	public ArrayList<HashMap<String,Object>> selectUserInfo() throws SQLException{
		String sql = "select * from user_info";
		return dbcon.executeQuery(sql,null);
	}
}
