package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.connection.Connections;

public class RetrieveRecord {

	public static void retrieveRecord()
	{
		for(int i=0;i<=3;i++)
		{
		System.out.print("\t\t\tenter the your first name and the email\n\t\t\t");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.print("\t\t\t");
		String email=sc.nextLine();
		System.out.println("\n");
		Connections connect=new Connections();
		Connection con=connect.getConnection();
		try {
			PreparedStatement stmt=con.prepareStatement("select * from students where fisrt_name=? and email=?");
			stmt.setString(1, name);
			stmt.setString(2, email);
			ResultSet res=stmt.executeQuery();
			int flag=0;
			while(res.next())
			{
			//	System.out.println("Id= "+res.getString(1)+"Name= "+res.getString(2)+" "+res.getString(3)+" "+res.getString(4)+" "+res.getInt(5));
				System.out.print("\t\t\tId= "+res.getString(1)+"  |  ");
				System.out.print("Name= "+res.getString(2)+" "+res.getString(3)+"  |  ");
				System.out.print("Email= "+res.getString(4)+"  |  ");
				System.out.print("Score= "+res.getInt(5)+"  |  ");
				System.out.print("Grade= "+res.getString(6)+"\n\n");
				System.out.println("\t\t\t***********************************************************************************************************************\n");
				flag++;
			}
			if(flag==1)
			{
				
				break;
			}
				
			else
				System.out.println("not found try again");
		
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println("\t\t\tGo to the home page, Enter yes or no");
		Scanner scan=new Scanner(System.in);
		System.out.print("\t\t\t");
		String y=scan.nextLine();
		if("yes".equals(y))
			MainOne.mainn();
		else
		{
			System.out.println("\n\t\t\t***********************************************************************************************************************\n");
			System.exit(0);
		}
	}
	
}
