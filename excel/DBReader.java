package excel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBReader {
	public static void main(String[] args) throws Exception{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT username, password FROM users");
		while(rs.next()) {
			System.out.println(rs.getString("username") + " | "+ rs.getString("password"));
		}
		con.close();
	}
}
