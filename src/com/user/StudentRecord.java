package com.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.Connections;

public class StudentRecord {
 public static void allRecordOfStudent()
 {
	 Connections connect=new Connections();
	Connection con= connect.getConnection();
	 try {
		Statement stmt=con.createStatement();
		ResultSet result=stmt.executeQuery("select * from students");
		System.out.println("\t\t\t****************************************************************************************************************************\n");
		System.out.println("\t\t\t\t\t---------------------------------------------------------------------------------------------\t\t\t");
		System.out.println("\t\t\t\t\t---------------------------------------------------------------------------------------------\t\t\t");
		System.out.println("\t\t\t\t\tstd_ld\t\tFirst_Name\tLast_Name\t\tEmail\t\t\tScore\tGrade");
		System.out.println("\t\t\t\t\t---------------------------------------------------------------------------------------------\t\t\t");
		while(result.next())
		{//System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "+result.getInt(5));
			System.out.println("\t\t\t\t\t| "+result.getString(1)+"\t\t"+result.getString(2)+"\t\t "+result.getString(3)+"\t\t "+result.getString(4)+" \t\t"+result.getInt(5)+"\t"+result.getString(6));
		System.out.println("\t\t\t\t\t---------------------------------------------------------------------------------------------\t\t\t");
		}
		MainOne.mainn();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
 }
}
