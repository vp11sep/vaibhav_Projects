package Loop_condition;

import java.util.Scanner;

public class palindrome 
{
	public static void main(String[] args) {
		int  y,z=0, temp;
		System.out.println("Please enter a Number");
		Scanner s=new Scanner(System.in);
		int x= s.nextInt();
		temp=x;
		while(x>0)
		{
			y= x%10;
			z= (z*10)+y;
			x=x/10;
		}
		
		if(temp==z)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");
	}

}
