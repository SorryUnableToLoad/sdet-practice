package bp.TY_prac;

import com.mysql.jdbc.Driver;
import org.testng.annotations.Test;

import java.sql.*;

public class UnitTest {
	@Test
	public void update() throws SQLException {
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		Statement stat = connect.createStatement();
		String query = "select * from project";

		ResultSet resultset = stat.executeQuery(query);
		String reqreslt = "ammerica";
		boolean flag = false;
		while (resultset.next()) {
			String actreslt = resultset.getString(4);
			if (actreslt.contains(reqreslt)) {
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("not present");
		}
		if (flag == true) {
			System.out.println("present");
		}
		connect.close();
		System.out.println("-----db delinked----------");
	}
}
