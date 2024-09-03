package day_1;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int c=0,i;
	if(n==0||n==1) 
		System.out.println("the given number not a prime");
	for(i=2;i<=n;i++)
	{
		if(n%i==0)
		{
			c=1;
			break;
		}
	}
	if(c==0)
	{
		System.out.println("the given number is prime");
	}
	else
		System.out.println("the given number not a prime");
	
}
}
