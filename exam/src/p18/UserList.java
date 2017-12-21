package p18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class UserList {

	public static void main(String[] args) {
		Connector c = null;
		try {
			c = new Connector();
			Connection con = c.getConnection();
			String sql = "select * from user_info";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			String[] colNames = new String[rsmd.getColumnCount()];

			for (int i = 0; i < colNames.length; i++) {
				colNames[i] = rsmd.getColumnLabel(i + 1);
			}
			ArrayList<HashMap<String, Object>> objList = new ArrayList<HashMap<String, Object>>();

			while (rs.next()) {
				HashMap<String, Object> hm = new HashMap<String, Object>();
				for (String colName : colNames) {
					hm.put(colName, rs.getString(colName));
				}
				objList.add(hm);
			}
			for (HashMap<String, Object> hm : objList) {
				System.out.println(hm);
			}
		} catch (ClassNotFoundException e) { //"org.mariadb.jdbc.Driver1"라고 쳤을때 에러에 대한 처리를 해야됨 
//			e.printStackTrace();
//			try {
//				Class.forName("org.mariadb.jdbc.Driver");
//			} catch (ClassNotFoundException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			} //에러 한번 더 방지
		} catch (SQLException e) { //"select * from user_info"에 대한 에러 방지
			e.printStackTrace();
		} finally {
			if (c != null) {
				try {
					c.close(); //사고가 나면 연결을 끊어줘야됨
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
