package Loop_condition;

import java.util.Scanner;

public class swapping_twovariable 
{
	public static void main(String[] args)
	{
		System.out.println("Please Enter the value of X & Y");
		Scanner s= new Scanner(System.in);
		int x= s.nextInt();
		int y = s.nextInt();
		System.out.println("The value before swapping is X= "+x+" & Y= "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("The value after swapping is X= "+x+" & Y= "+y);
		
	}

}
