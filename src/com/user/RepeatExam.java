package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.Connections;
import com.exceptions.RepeatExamException;

public class RepeatExam{

	public void check(Student s1)
	{
	Connections connect=new Connections();
	Connection con=connect.getConnection();
	try {
		PreparedStatement stmt=con.prepareStatement("select * from Students where email=? and fisrt_name=?");
		stmt.setString(1,s1.email_Id);
		
		stmt.setString(2,s1.first_Name);
		ResultSet a1=stmt.executeQuery();
		while(a1.next())
		{
			throw new RepeatExamException(s1.first_Name+" you are not allowed, because you allready give the test....");
			
			//System.out.println(a1.next());
		}
		//MainOne.mainn();
	/*	int  a=0;
	  a=stmt.executeUpdate();
	  if(a>0)
	  {
		  throw new RepeatExamException(" you are allready  bro....");
	  }
	 // System.out.println(a+".................");*/
	
	 
	 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
}
