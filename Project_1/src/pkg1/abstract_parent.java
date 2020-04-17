package pkg1;

public abstract class abstract_parent
{
	public int method1(int a, int b)
	{
		int c;
		c= a+b;
		System.out.println("I am With body parent Method1 "+c);
		return c;
	}
	public abstract int method2(int e, int f);
}