package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.connection.Connections;

public class ScoreStore {

	public void storeScore(int score,Student s1,String grade)
	{
		/*Connections c1=new Connections();
		Connection con= c1.getConnection();
		try {
			PreparedStatement stmt=con.prepareStatement("insert into students score=? where std_id=?");
			stmt.setInt(1,score);
			stmt.setString(2,s1.first_Name);
			stmt.executeUpdate();
			System.out.println("successfully store in db............");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		Connections C1= new Connections();
		Connection con=C1.getConnection();
		try {
			PreparedStatement stmt=con.prepareStatement("insert into students(fisrt_name,last_name,email,score,grade)values(?,?,?,?,?)");
			stmt.setString(1,s1.first_Name);
			stmt.setString(2,s1.last_Name);
			stmt.setString(3,s1.email_Id);
			stmt.setInt(4,score);
			stmt.setString(5,grade);
			stmt.execute();
			//System.out.println("executred.....");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
