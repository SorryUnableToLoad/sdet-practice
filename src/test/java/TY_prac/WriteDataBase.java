package TY_prac;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WriteDataBase {
	public static void main(String[] args) throws SQLException {
		Driver driverref = new Driver();
		DriverManager.registerDriver(driverref);
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		Statement statement = connect.createStatement();
		String query = "insert into project values('TY_PROJ_004','Sun','12/01/2022','Bank of ammerica','on going',9)";
		int update = statement.executeUpdate(query);

		if (update == 1) {
			System.out.println("updated");
		} else {
			System.out.println("not updated");
		}
	}

}
