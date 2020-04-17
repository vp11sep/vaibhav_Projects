package pkg1;

public class parent {
	public parent()
	{
		this(2,3,4);
		System.out.println("Parent Default Constructor");
	}
	public parent(int a)
	{
		this();
		System.out.println("Parent One Parameterized Constructor");
	}
	public parent (int a, int b)
	{
		this(2);
		System.out.println("Parent Two parameterized Constructor");
	}
	public parent(int a, int b, int c)
	{
		System.out.println("Parent Three Parameterized Constructor");
	}
	public static void main(String[] args) {
		parent pr=new parent(2, 3);
	}

}
