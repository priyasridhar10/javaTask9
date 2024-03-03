package javaTask9;

import java.util.Scanner;

public class LargestAmoungThree {

	public static void main(String args[])
	{
		System.out.println("Find the Larged number from the three number");
		System .out.println(" Enter the Any three number ");
		Scanner num = new Scanner(System.in);
		int num1 =num.nextInt();
		int num2 =num.nextInt();
		int num3= num.nextInt();
		if (num1 > num2)
		{
			if (num1>num3)
			{
				System.out.println(" Largest number is " + num1);
			}
			else
			{
				System.out.println(" largest number is" +num3);		
			}	
		}
		else if (num2>num3)
		{
			System.out.println(" Largest number is " + num2);
		}
		else
		{
			System.out.println(" largest number is" +num3);	
		
		}	
	}
}
