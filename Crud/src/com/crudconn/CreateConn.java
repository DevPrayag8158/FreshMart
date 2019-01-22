package com.crudconn;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConn {
	public static Connection con=null;
	public static Connection getCon()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/crud", "root", "");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
