package Loop_condition;

import java.util.Scanner;

public class prime_no 
{
	public static void main(String[] args)
	{
		boolean abc=true;
		System.out.println("Please enter a number : ");
		Scanner s= new Scanner(System.in);
		{
			int a=s.nextInt();
			//s.close();
			//int i;
				for (int i=2; i<=a/2; i++)
				{
						if (a%i==0)
						{
							abc=false;
							break;
						}
				}		
							if(abc)
							
						
							System.out.println("Number is prime ");
						
						else
						
							System.out.println("Number is not prime ");
				
				}
				}
			
			}



