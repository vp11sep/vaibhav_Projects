package pkg1;

public class child_1 extends parent
{
	public child_1()
	{
		this(2, 3, 4);
		System.out.println("Child_1 Default Consturctor");
	}
	public child_1(int a)
	{
		this();
		System.out.println("Child_1 One Parameterized Constructor");
	}
	public child_1 (int a, int b)
	{
		//super(2, 3);
		this (2);
		//super(2, 3);
		System.out.println("Child_1 Two Parameterized Constructor");
	}
	public child_1(int a, int b, int c)
	{
		super(2, 3);
		System.out.println("Child_1 Three Parameterized Constructor");
	}
	public static void main(String[] args) {
		//child_1 c1=new child_1(2, 3);
		//child_1 c2=new child_1(2, 3, 4);
	}

}
