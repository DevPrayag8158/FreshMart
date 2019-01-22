package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.crudconn.CreateConn;

public class RegDao {
	public static void insertData(String nm) {

		Connection con = CreateConn.getCon();
		try {
			PreparedStatement st = con.prepareStatement("insert into detail (name) values(?)");
			st.setString(1, nm);
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
