package Loop_condition;

import java.util.Scanner;

public class swapping_thirdvariable 
{
	public static void main(String[] args)
	{
		
		System.out.println("Enter value of X & Y");
		Scanner s= new Scanner(System.in);
		int x= s.nextInt();
		int y= s.nextInt();
		System.out.println("The value before swapping is: X= "+x+" & Y= "+y);
		int t;
		t=x;
		x=y;
		y=t;
		
		System.out.println("The value after swapping is: X= "+x+" & Y= "+y);
		
	}

}
