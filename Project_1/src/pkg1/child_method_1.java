package pkg1;

public class child_method_1 extends parent_method_1
{
	public void cmethod1()
	{
		this.cmethod5(1, 2, 3, 4);
		System.out.println("Child Default Method");
	}
	public void cmethod2(int a)
	{
		this.cmethod1();
		System.out.println("Child 1 Parameterized Method");
	}
	public void cmethod3(int b, int c)
	{
		this.cmethod2(1);
		System.out.println("Child 2 Parameterized Method");
	}
	public void cmethod4(int a, int b, int c)
	{
		System.out.println("Child 3 Parameterized Method");
	}
	public void cmethod5(int a, int b, int c, int d)
	{
		super.pmethod4(1, 2, 3);
		super.pmethod1();
		super.pmethod2(1);
		super.pmethod3(1, 2);
		System.out.println("Child 4 Parameterized Method");
	}
	public static void main(String[] args) {
		child_method_1 cm=new child_method_1();
		cm.cmethod3(1, 2);
		//cm.cmethod4(1,2,3);
		
	}
}
