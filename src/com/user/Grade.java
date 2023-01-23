package com.user;

public class Grade {

	public String giveGrade(Student s1,int currect)
	{
		String grade="Fail";
		System.out.println("\n\t\t\t***********************************************************************************************************************\n");
		if(currect>=8 && currect<=10)
		{
			grade="A";
			System.out.println("\n\t\t\t"+s1.first_Name +" your currect ans is "+currect+"wrong ans is "+(10-currect)+" , Class A");
		}
			else if(currect>=6 && currect<=8)
			{
				grade="B";
				System.out.println("\n\t\t\t"+s1.first_Name +" your currect ans is "+currect+"wrong ans is "+(10-currect)+" , Class B");
			}
			else if(currect== 5)
			{
				grade="C";
				System.out.println("\n\t\t\t"+s1.first_Name +" your currect ans is "+currect+" , Class C");
			}
				else
					System.out.println("\n\t\t\t"+s1.first_Name +" your mark is "+currect+" and your are fail ");
		System.out.println("\n\t\t\t***********************************************************************************************************************\n");
		return grade;
	}
}
