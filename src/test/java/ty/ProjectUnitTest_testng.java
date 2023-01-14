package ty;

import com.mysql.cj.jdbc.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.*;

public class ProjectUnitTest_testng
{
	@Test
	
	public void projectUnitTest() throws SQLException
	{
		Connection conn = null;
		try {
			Driver drRef = new Driver();
			
			DriverManager.registerDriver(drRef);
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
			System.out.println("Connection is complete");
			
			Statement stm = conn.createStatement();
			String query = "select * from project";
			
			ResultSet res_set = stm.executeQuery(query);
			
			boolean flag = false;
			while(res_set.next())
			{
				String actProjectName = res_set.getString(4);
				if(actProjectName.equals("Maruti"))
				{
					flag = true;
				}
			}
			Assert.assertTrue(flag);
		}
		catch(Exception e)
		{	
		}
		finally {
			conn.close();
			System.out.println("close connection to database");
		}
	}

}
