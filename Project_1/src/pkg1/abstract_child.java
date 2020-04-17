package pkg1;

public class abstract_child extends abstract_parent
{
	public int method2(int e, int f)
	{
		int g;
		g= e-f;
		System.out.println("I have implemented parent method2 "+g);
		return g;
	}

	public void method3(int x, int y)
	{
		int z;
		z=x*y;
		System.out.println("I am separate method of child class " +z);
	}
	public static void main(String[] args) 
	{
		abstract_child ob= new abstract_child();
		int sum=ob.method1(10, 20);
		int sub=ob.method2(sum, 15);
		ob.method3(sum, sub);
		
	}

}
