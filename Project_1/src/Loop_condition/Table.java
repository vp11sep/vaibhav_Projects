package Loop_condition;

import java.util.Scanner;

public class Table 
{
	public static void main(String[] args) {
		System.out.println("Please enter the Number ");
		Scanner s=new Scanner(System.in);
		int x= s.nextInt();
		for (int i=1; i<=10; i++)
		{
			int t;
			t= x*i;
			System.out.println(x+" X "+i+" = "+t);
		}
	}

}
