package javaTask9;

import java.util.Scanner;

public class GradeSystem {
	
	static String name;
	static int mark;
	public static void main(String args[])
	{
		System.out.println("======Anna Unviersity Grade Sheet=======");
		GradeSystem gs= new GradeSystem();
		gs.studentDetail();
		if (mark>100)
		{
			System.out.println(" Student Name :" +name);
			System.out.println("Student mark is:"+mark);
			System.out.println("Student grade is:Invalid input");
		}
		else if( mark ==100)
		{
			System.out.println(" Student Name :" +name);
			System.out.println("Student mark is:"+mark);
			System.out.println("Student grade is:S");
		}
		
		else if( mark >=90&& mark<=99)
		{
			System.out.println(" Student Name :" +name);
			System.out.println("Student mark is:"+mark);
			System.out.println("Student grade is:A");
		}		
		else if( mark >=80&& mark<=89)
		{
			System.out.println(" Student Name :" +name);
			System.out.println("Student mark is:"+mark);
			System.out.println("Student grade is:B");
		}
		else if( mark >=70&& mark<=79)
		{
			System.out.println(" Student Name :" +name);
			System.out.println("Student mark is:"+mark);
			System.out.println("Student grade is:C");
		}
		else if( mark >=60&& mark<=69)
		{
			System.out.println(" Student Name :" +name);
			System.out.println("Student mark is:"+mark);
			System.out.println("Student grade is:D");
		}
		else if( mark >=50&& mark<=59)
		{
			System.out.println(" Student Name :" +name);
			System.out.println("Student mark is:"+mark);
			System.out.println("Student grade is:E");
		}
		else if( mark<=50)
		{
			System.out.println(" Student Name :" +name);
			System.out.println("Student mark is:"+mark);
			System.out.println("Student grade is:F");
		}
		
	}
	public void studentDetail()
	{
		System.out.println("Enter the Name of the Student");
		Scanner Stu = new Scanner(System.in);
	    name =Stu.nextLine();
		System.out.println("Enter the Mark");
		Scanner Sm =new Scanner(System.in);
	    mark=Sm.nextInt();
		
	}

}
