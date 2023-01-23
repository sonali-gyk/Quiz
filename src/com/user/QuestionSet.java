package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;

import com.connection.Connections;

public class QuestionSet {

	public  void covertDB()
	{
		Connections connect=new Connections();
		Connection con=connect.getConnection();
		HashSet<String> hr=new HashSet<String>();
	
		try {
			PreparedStatement stmt;
			stmt = con.prepareStatement("select * from question");
			ResultSet ss=stmt.executeQuery();
			while(ss.next())
			{
				//String sr=ss.getString(1)+" "+ss.getString(2)+"\n"+ss.getString(3)+"\n"+ss.getString(4)+"\n"+ss.getString(5)+"\n"+ss.getString(6);
				String sr="\t\t\t"+ss.getString(1)+" "+ss.getString(2)+"\n\t\t\t"+ss.getString(3)+"\n\t\t\t"+ss.getString(4)+"\n\t\t\t"+ss.getString(5)+"\n\t\t\t"+ss.getString(6);
				hr.add(sr);
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		MainMethod m1=new MainMethod();
		m1.mainExecution(hr,con);
		
	/*	Iterator<String> itr=hr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
	}
}
