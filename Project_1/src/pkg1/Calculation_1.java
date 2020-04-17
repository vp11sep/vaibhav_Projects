package pkg1;

public class Calculation_1 
{

	public int abc(int a, int b)
	{
		int c;
		c= a+b;
		System.out.println("sum result is "+c);
		return c;
		
	}
	
	public int abc(int x, float y)
	{
		float z;
		z= (x-y);
		System.out.println("sub result is "+z);
		return (int) z;
		
	}
	public void abc(float p, int q)
	{
		float r;
		r= p*q;
		System.out.println("Final result is "+r);
	}
	public static void main(String[] args) {
		Calculation_1 ab= new Calculation_1();
		int result_sum=ab.abc (10, 2);
		float result_sub= ab.abc(result_sum ,  5.5F);
		ab.abc (result_sub, result_sum);
			}
}
