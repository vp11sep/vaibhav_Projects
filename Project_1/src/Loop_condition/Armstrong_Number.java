package Loop_condition;

import java.util.Scanner;

public class Armstrong_Number {
	public static void main(String[] args) {
		System.out.println("PLease Enter a number");
		Scanner s=new Scanner(System.in);
		int a= s.nextInt();
		int b, c=0,t;
		t=a;
		while(a>0)
		{
			b=a%10;
			a=a/10;
			c=c+(b*b*b);	
		}
		if(t==c)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}

}
