package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.connection.Connections;

public class Student {
	  public	String first_Name ;
	  public	String last_Name;
	  public    String email_Id;
	  

public void getStudentInformation()
{
	Scanner sc=new Scanner(System.in);
	
	System.out.print("\t\t\tenter First Name =\n\t\t\t");
	this.first_Name=sc.next();
	
	
	System.out.print("\n\t\t\tenter Last Name =\n\t\t\t");
	this.last_Name=sc.next();
	

	System.out.print("\n\t\t\tenter your Email =\n\t\t\t");
	this.email_Id=sc.next();
	System.out.println("\t\t\t***********************************************************************************************************************\n");
	
/*
	Connections C1= new Connections();
	Connection con=C1.getConnection();
	try {
		PreparedStatement stmt=con.prepareStatement("insert into students(fisrt_name,last_name,email)values(?,?,?)");
		stmt.setString(1,first_Name);
		stmt.setString(2,last_Name);
		stmt.setString(3,email_Id);
		stmt.execute();
		System.out.println("executred.....");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/

}

	/*public static void main(String...a)
	{
		QuestionSet m=new QuestionSet();
		m.covertDB(a);
	}*/
}
