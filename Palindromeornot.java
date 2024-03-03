package javaTask9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Palindromeornot {

	public static void main(String[] args) 
	{
	
		String s ;
		System.out.println("Enter the string:");
		Scanner str =new Scanner(System.in);
		s = str.next();
		char a[] =s.toCharArray();
		int  j=s.length()-1;
		int z =0;
	if (a[z]==a[j])//  Initial Testing the last and First Character is Same 
	{
	   for (int i=1;i<=s.length()-1;i++) // if it is same it check the remaining 
		{
				
				if (a[i]==a[j]-1)// If the condition fail it come exit  from the if loop 
				{
					j--;
				}
		}
			System.out.println("It is Palindrom");
			
		}
	else
	{
		System.out.println("It is not a palindrom");
	}
	}
}
	
