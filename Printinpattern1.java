package javaTask9;

import java.util.Scanner;

public class Printinpattern1 {
	
	public static void main(String[] args) {
	int a =1;
	System.out.println(" Enter the number:");
	Scanner num = new Scanner (System.in);
	int n= num.nextInt();
	//int a[][]= new int[n][n];
	for (int i=1;i<=n;i++)
	{
		for (int j=1;j<=i;j++)
		
		{
		
			System.out.print(a+"");
			a++;
			
	}
		System.out.println();
	}
	
	}
}

