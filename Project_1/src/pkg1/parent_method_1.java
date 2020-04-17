package pkg1;

public class parent_method_1
{
	public void pmethod1()
	{
		//this.pmethod4(1, 2, 3);
		System.out.println("parent Default Method");
	}
	public void pmethod2(int a)
	{
		//this.pmethod1();
		System.out.println("Parent 1 Parameterized Method");
	}
	public void pmethod3(int a, int b)
	{
		//this.pmethod2(1);
		System.out.println("Parent 2 Parameterized Method");
	}
	public void pmethod4(int a, int b, int c)
	{
		System.out.println("Parent 3 Parameterized Method");
	}
	public void pmethod5(int a, int b, int c, int d)
	{
		System.out.println("Parent 4 Parameterized Method");
	}
	

}
