package com.user;

import java.util.Scanner;

public class MainOne {

	public static void mainn()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t\tEnter your choice.\n ");
		System.out.println("\t\t\t1. See your record");
		System.out.println("\t\t\t2. Login");
		System.out.println("\t\t\t3. All Records");
		System.out.print("\t\t\t4. Exit\n\t\t\t");
		int choice =sc.nextInt();
		System.out.println("\n\t\t\t****************************************************************************************************************************\n");
		switch(choice)
		{
		case 1 :RetrieveRecord.retrieveRecord();
		        
		        break;
		case 2 :QuestionSet m=new QuestionSet();
		        m.covertDB();
		        break;
		case 3 :StudentRecord.allRecordOfStudent();
		        break;
		case 4 :System.exit(0);        
		        
		}
		

	}
	public static void mainn1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t\tEnter your choice.\n ");
		System.out.println("\t\t\t1. See your record");
		System.out.println("\t\t\t2. All Records");
		System.out.print("\t\t\t3. Exit\n\t\t\t");
		int choice =sc.nextInt();
		System.out.println("\n\t\t\t***********************************************************************************************************************\n");
		switch(choice)
		{
		case 1 :RetrieveRecord.retrieveRecord();
		        
		        break;
		case 2 :StudentRecord.allRecordOfStudent();
		        break;
		case 3 : System.exit(0);   
	}
	}
	public static void main(String...a)
	{
		mainn();
	}
}
