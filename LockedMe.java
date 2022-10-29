package com.company.lockers;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class LockedMe 
{
	static final String
projectPath="C:\\JavaPhase1FinalProject\\CompanyLockersProject\\LockedMe.Java";
	public static void main(String[]args)
	{
	 	Scanner obj=new Scanner (System.in);
		int ch;
		
		displayMenu();
		System.out.println("Enter your choice:");
		ch=Integer.parseInt(obj.nextLine());
		switch(ch)
		{
			case 1:getAllFiles();
			break;
			case 2:createFiles();
			break;
			case 3:deleteFiles();
			break;
			case 4:searchFiles1();
			break;
			case 5:System.exit(0);
			break;
			default:System.out.println("Invalid option");
			break;
		}
		obj.next();
	
	
			while(ch>0);
		
	}
		private static void searchFiles() {
		// TODO Auto-generated method stub
		
	}
		public static void displayMenu()
		{
		System.out.println("*****************************************");
		System.out.println("\tWelcome to Company Lockers- LockedMe.com");
		System.out.println("Developer Name: Pradhap Anandan A");
		System.out.println("(*****************************************");
		System.out.println("\t\t1.Display all the Files");
		System.out.println("\t\t2.Add the files to the directory");
		System.out.println("\t\t3.Delete a File");
		System.out.println("\t\t4.Search a File");
		System.out.println("\t\t5.Exit");
		System.out.println("*****************************************");
		}
		public static void getAllFiles()
		{
			File[] listofFiles =new File(projectPath).listFiles();
			//if folder is empty
			if(listofFiles.length==0)
				System.out.println("No files exist in the directory");
			else
			{
				for(File l:listofFiles)
				{
					System.out.println(l.getName());
				}
			}
		
		
}		
		public static void createFiles() 
		{
			try
			{
				Scanner obj=new Scanner(System.in);
				String fileName;
				int linesCount;
				System.out.println("enter file name");
				fileName =obj.nextLine();
				System.out.println("enter how many lines you want to add in file");
				linesCount=Integer.parseInt(obj.nextLine());
				FileWriter fw=new FileWriter(projectPath+"fileName");
				for(int i=1;i<=linesCount;i++);
				{
					System.out.println("Enter file content line");
					fw.write(obj.nextLine()+"\n");
				}
					System.out.println("file created successfully");
					fw.close();
			}
			catch(Exception ex)
			{
				System.out.println("some error occured");
			}
		}
	
		public static void deleteFiles() 
		{
			Scanner obj=new Scanner(System.in);
			try
			{
				String fileName;
				System.out.println("Enter the file name to be deleted");
				fileName=obj.nextLine();
				File fl=new File(projectPath+"\\"+fileName);
				if(fl.exists())
				{
					fl.delete();
					System.out.println("file deleted successfully");
				}
				else
				{
					System.out.println("file do not exist");
				}
			}
			catch(Exception ex)
			{
			}
		}
	
		public static void searchFiles1()
		{
			Scanner obj=new Scanner(System.in);
			try
			{
				String fileName;
				System.out.println("Enter file name to be searched:");
				fileName=obj.nextLine();
				File fl=new File(projectPath+"\\+fileName");
				if(fl.exists())
				{
					System.out.println("file is available");
				}
				else
				{
					System.out.println("file is not available");
				}
			}
				catch (Exception ex)
				{
				}
				
		}
}
	
