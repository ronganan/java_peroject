package intermediate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
	public static void main(String[] args) {
		
		try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hero?characterEncoding=utf-8&serverTimezone=GMT", "root", "123456"); Statement s = c.createStatement();){
			String sql = "select * from heros where id =2";
			ResultSet res = s.executeQuery(sql);
			while (res.next()) {
				int id = res.getInt("id");
				String name = res.getString("name");
				float hp = res.getFloat("hp");
				int damage = res.getInt("damage");
				System.out.printf("%d\t%s\t%f\t%d%n", id, name, hp, damage);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
//	public static void main(String[] args) {
//		Statement s = null;
//		Connection con = null;
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			con = DriverManager.getConnection(
//					"jdbc:mysql://127.0.0.1:3306/hero?characterEncoding=utf-8&serverTimezone=GMT", "root", "123456");
//			s = con.createStatement();
//			String sql = "insert into heros values(null," + "'明明'" + "," + 222 + "," + 11 + ")";
//			s.execute(sql);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			// 数据库的连接时有限资源，相关操作结束后，养成关闭数据库的好习惯
//			// 先关闭Statement
//			if (s != null)
//				try {
//					s.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			// 后关闭Connection
//			if (con != null)
//				try {
//					con.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//		}
//	}

}