package javaTask9;

import java.util.Scanner;

public class ReverseString {

	
	public static void main(String[] args)
	{
		ReverseString obj = new ReverseString();
		obj.data();
	}

public static void data()
{
	String name;
	System.out .println(" Enter the String to be reveresed");
	Scanner str = new Scanner(System.in);
	name =str.nextLine();
	int j= name.length()-1;
	char a[] = name.toCharArray();
	char b[] = new char[name.length()];
	for (int i=0;i<=name.length()-1;i++)
	{
		b[j]=a[i];
		j--;
	}
	System.out.println(b);	
}
}
