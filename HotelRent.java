package javaTask9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HotelRent{
	
	public static void main(String args[])
	{
		DecimalFormat df = new DecimalFormat("0.00");
		int rent =2000;
		int a = 0;
		System.out.println(" Enter the Month : ");
		Scanner m = new Scanner(System.in);
		int month = m.nextInt();
		//int rent = r.nextInt();
		System.out.println(" Enter the days : ");
        Scanner d=new Scanner(System.in);
		int days=d.nextInt();
		if (month==1||month==2 ||month==3||month==7||month==8||month==9||month==10) {
		   a=1;
		  
	    }
		else if (month==4 ||month==6||month==11||month==12||month==5)
		{
			a=2;
		}
		else 
	
		{
			System.out.println("Invaild month enter the month correctly please");
		}
			
		switch (a)
		{
		case 1:
		{
			System.out .println("===Welcome to our Hotel=====");
			System.out.println("Enter month is :" +month);
			System.out.println("Rent Amount is :" + rent);
			
			System .out.println("Number of Days Stay is:"+days);
			float total = rent*days;
			System.out.println("Total amount to be paid is :"+df.format(total));
			break;
		}
		case 2:
		{
			System.out .println("===Welcome to our Hotel=====");
			System.out.println("Enter month is :" +month);
			System.out.println("Rent Amount is :" + rent+". " +"20% high this month");
			System .out.println("Number of Days Stay is:"+days);
			System.out.println("oh it is pick season");
			float total =(rent+ (rent*20/100))*days;
			System.out.println("Total amount to be paid is :"+df.format(total));
			break;
		}
		}
	}

}
