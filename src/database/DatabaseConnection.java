/**
 * Program Name: DatabaseConnection.java
 * Purpose: put something here
 * Coder: Libo Chen
 * Date: Aug. 20, 2020
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Libo
 *
 */
public class DatabaseConnection
{
	private static Connection getConnection()
	{
		Connection connection = null;
		try
		{
			connection = DriverManager.getConnection();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return connection;
	}
	
	
}
