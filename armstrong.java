 package day_2;

import java.util.Scanner;
public class armstrong {
public static void main(String[] args)
{
	int number, digit, sum = 0;  
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter the number: ");  
	number = sc.nextInt(); 
	int n=number;
	int c=0;
	while(number >0)  {
		number=number/10;
		c++;
	}
	while(number>0)
	{
		digit=number%10;
		sum+=(int)Math.pow(digit,c);
		number=number/10;
	}
	


if(n==sum) {
	        System.out.println("Armstrong");
           }
	else {
		System.out.println(" Not a Armstrong");
	    }

		
	
	
}
}
