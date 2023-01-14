package TY_prac;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class ReadDataBase2 {

	public static void main(String[] args) throws SQLException {
		Connection connect = null;
		try {
			Driver driveRef = new Driver();
			DriverManager.registerDriver(driveRef);
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
			System.out.println("----------db linked------------- ");
			Statement ststemnt = connect.createStatement();
			String query = "select * from project";
			ResultSet reslt = ststemnt.executeQuery(query);
			while (reslt.next()) {
				System.out.println(reslt.getString(1) + "\t" + reslt.getString(2) + "\t" + reslt.getString(3) + "\t"
						+ reslt.getString(4) + "\t" + reslt.getString(5) + "\t" + reslt.getString(6));
			}
		} catch (Exception e) {

		} finally {
			connect.close();
			System.out.println("------------db delinked---------------");
		}

	}

}
