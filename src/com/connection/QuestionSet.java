package com.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class QuestionSet {

	public static void main(String...a)
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
				String sr=ss.getString(1)+" "+ss.getString(2)+"\n"+ss.getString(3)+"\n"+ss.getString(4)+"\n"+ss.getString(5)+"\n"+ss.getString(6);
				hr.add(sr);
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		mainn(hr,con);
		
	/*	Iterator<String> itr=hr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
	}
	public static void mainn(HashSet<String> h1,Connection con) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter First Name =");
		String fn=sc.next();

		System.out.println("enter Last Name =");
	    String fl=sc.next();
		
		System.out.println("enter your Email =");
    	String em=sc.next();
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("insert into students(fisrt_name,last_name,email)values(?,?,?)");
			stmt.setString(1,fn);
			stmt.setString(1,fl);
			stmt.setString(1,em);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("now start to give the text...");
	
		Iterator<String> itr=h1.iterator();
		 int currect=0;
		while(itr.hasNext())
		{
			Scanner scan=new Scanner(System.in);
			String sss=itr.next();
			//String sss=itr.next();
			  System.out.println(sss);
				// System.out.println(itr.next());
			  System.out.println("choose any one");
			  String ans=scan.nextLine();
			  
			  
			try {
				PreparedStatement st=con.prepareStatement("select * from question");
				ResultSet ss=st.executeQuery();
				while(ss.next())
				{
					//System.out.println(sss.contains(ss.getString(2)));
				//	System.out.println(ans+"......"+ss.getString(7));
					if(sss.contains(ss.getString(2)))
					{
						if(ans.equals(ss.getString(7)))
						{
							currect++;
						//	System.out.println("your mark is"+currect);
						}
					}
				}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		//  System.out.println(sss.contains(so));
			//System.out.println("your mark is"+currect);
		}
		System.out.println("your mark is"+currect);

	}
	
	
		
	
}
