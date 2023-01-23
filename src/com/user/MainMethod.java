package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.exceptions.RepeatExamException;

public class MainMethod {

	public void mainExecution(HashSet<String> h1,Connection con) 
	{
		//calling gefInformation of student
		Student s1=new Student();
		s1.getStudentInformation();
		//check whether student given the exam allready
	    RepeatExam r1=new RepeatExam();
	 
	    r1.check(s1);
	    System.out.println("\t\t\t Login succesfull");
	    
		System.out.println("\t\t\tnow start to give the text.....\n");
	
		Iterator<String> itr=h1.iterator();
		 int currect=0;
		while(itr.hasNext())
		{
			Scanner scan=new Scanner(System.in);
			String sss=itr.next();
			  System.out.println(sss);
		
			  System.out.print("\t\t\tchoose any one\n\t\t\t");
			  String ans=scan.nextLine();
			  
			  
			try {
				PreparedStatement st=con.prepareStatement("select * from question");
				ResultSet ss=st.executeQuery();
				while(ss.next())
				{
					
					if(sss.contains(ss.getString(2)))
					{
						String a=ans.toLowerCase();
						String b=ss.getString(7).toLowerCase();
						if(ans.equals(ss.getString(7)) || a.equals(b))
						{
							currect++;
						}
					}
				}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	//giving Grade to the student
		Grade g1=new Grade();
			String grade=g1.giveGrade(s1,currect);
	//store mark into db
		ScoreStore e1=new ScoreStore();	
          e1.storeScore(currect, s1,grade);
          MainOne.mainn1();
          /*
           //becoz we create mainone in it String
          StudentRecord.allRecordOfStudent();
         
          Scanner sc=new Scanner(System.in);
          System.out.println("if someone find their record then say yes otherwise no");
          String ss=sc.next();
          if(ss.equals("yes"))
          RetrieveRecord.retrieveRecord();
          else
        	  System.out.println("not intrested");*/
	}
	
	
		
	
}


