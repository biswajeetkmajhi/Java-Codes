/*3.Write a program in java to input and display the details of n number of 	students having roll, name and cgpa as data members. Also display the name of the student having lowest cgpa.*/

import java.util.*;
class Student
{
	long roll;
	String name;
	double cgpa;

	Student(long r,String n,double c)
	{
		roll=r;
		name=n;
		cgpa=c;
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);

		System.out.println("Enter the no. of students : ");
		int n=x.nextInt();

		Student[] students=new Student[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter details of student "+(i+1)+":");
			System.out.println("Enter Roll number :");
			long roll=x.nextInt();
			x.nextLine();
			 
			System.out.println("Enter Name :");
			String name=x.nextLine();

			System.out.println("Enter cgpa :");
			double cgpa=x.nextDouble();
			x.nextLine();
			
			students[i] = new Student(roll,name,cgpa);
		}
		
		//display n student details
		System.out.println("Student details:");
		for(int i=0;i<n;i++)
		{
			System.out.print((i+1)+". Roll No.:"+students[i].roll+"\tName: "+students[i].name+"\tcgpa :"+students[i].cgpa);
			System.out.println();
		}
		
		//lowest cgpa
		System.out.println();
		Student lcgpa=students[0];
		for(int i=0;i<n;i++)
		{
			if(students[i].cgpa<lcgpa.cgpa)
				lcgpa=students[i];
		}

		//display lowest cgpa
		System.out.println("Student with lowest cgpa");
		System.out.print("Roll No.:"+lcgpa.roll+"\tName: "+lcgpa.name+"\tcgpa :"+lcgpa.cgpa);

	}
}
	