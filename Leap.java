package day_2;

import java.util.Scanner;

public class Leap {
	public static void main(String[] args)
	{
		int number, digit, sum = 0;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		number = sc.nextInt(); 
		if((number%4==0&&number%100!=0)||number%400==0) {
			System.out.println(number +"is a leap year ");	
					}
		else
		{
			System.out.println(number +"is not a leap year ");	
		}
	}
}

