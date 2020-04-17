package pkg1;

public class Child_2 extends child_1
{
	public Child_2()
	{
		this(2, 3, 4);
		System.out.println("Child_2 Default Parameterized Constructor");
	}

	public Child_2(int a)
	{
		this();
		System.out.println("Child_2 One Parameterized Constructor");
	}
	public Child_2(int a, int b)
	{
		this (2);
		System.out.println("Child_2 Two Parameterized Constructor");
	}
	public Child_2(int a, int b, int c)
	{
		super(2, 3);
		System.out.println("Child_2 Three Parameterized Constructor");
	}
	public static void main(String[] args) {
		Child_2 c1=new Child_2(2, 3);
		
	}


}
