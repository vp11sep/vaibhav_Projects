package pkg1;

import java.util.Scanner;

public class scanner_1 {

	public void Task() {
		System.out.println("----Task is to solve ((((X1+X2)-X3)+X4)*X5)/X5-----");

	}
	public float sum(float a, float b)
	{
		float c;
		c=a+b;
		//System.out.println("First calculation of (10+2) will be "+c);
		return c;
	}
	public float sub(float d, float e)
	{
		float f;
		f=d-e;
		//System.out.println("Second calculation of (10+2)-2) will be "+f);
		return f;
	}
	public float mul(float p, float q)
	{
		float r;
		r=p*q;
		//System.out.println(r);
		return r;
	}
	public void div(float x, float y)
	{
		float z;
		z=x/y;
		System.out.println("Final result is "+z);
	}
	public static void main(String[] args) 
	{
		scanner_1 ob=new scanner_1();
		ob.Task();
		
		System.out.println("Please enter the value of X1");
		Scanner s= new Scanner(System.in);
		float xa= s.nextFloat();
		System.out.println("Please enter the value of X2");
		float xb= s.nextFloat();
		System.out.println("Please enter the value of X3");
		float xc= s.nextFloat();
		System.out.println("Please enter the value of X4");
		float xd= s.nextFloat();
		System.out.println("Please enter the value of X5");
		float xe = s.nextFloat();		
		
		float r_sum =ob.sum(xa, xb);
		System.out.println("First calculation of (X1 + X2) will be "+r_sum);
		float r_sub =ob.sub(r_sum, xc);
		System.out.println("Second calculation of (X1+X2)-X3) will be "+r_sub);
		float r_sum2= ob.sum(r_sub, xd);
		System.out.println("Third calculation of (X1+X2)-X3)+X4) will be "+r_sum2);
		float r_mul= ob.mul(r_sum2, xe);
		System.out.println("Forth calculation of (X1+X2)-X3)+X4)*X5) will be "+r_mul);
		ob.div(r_mul, xe);
	}
}
