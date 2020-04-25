package Loop_condition;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) {
		int t=1;
		System.out.println("Pease enter a Number ");
		Scanner s= new Scanner(System.in);
		int x= s.nextInt();
		for(int i=1; i<=x; i++)
		{
			//int t=1;
			//t= 1;
			t=t*i;
		}
			System.out.println("Factorial of "+x+" is: "+t);
		//}
		
	}

}
