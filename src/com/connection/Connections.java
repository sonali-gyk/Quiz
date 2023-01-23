package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashSet;
import java.util.Iterator;

public class Connections {

	Connection connection=null;
	public  Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","sonali");
	 	}
		 catch (Exception e) {
			
			e.printStackTrace();
		}
		return connection;
	}
	
	public void main(HashSet<String> h1)
	{
		Iterator<String> itr=h1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	/*public static void main(String...a)
	{
		Connections a1=new Connections();
		Connection con=a1.getConnection();
		if(con== null)
		System.out.println("null");
		else
			System.out.println("not null");
			
	}*/
}
