package Loop_condition;

import java.util.Scanner;

public class Fibonacci_series
{
	public static void main(String[] args) 
	{
		int z,i;
		System.out.println("Enter first and second number");
		Scanner s= new Scanner(System.in);
		int x= s.nextInt();
		int y= s.nextInt();
		System.out.println("Fibonacci series for "+x+" & "+y);
		for(i=0; i<10; i++)
		{
			z= x+y;
			System.out.println(z);
			x=y;
			y=z;
		}
		
	}
	

}
