package pkg1;

public class Constructor_2 {
	//int a,b,c,d;

	public Constructor_2()
	{
		this(21,22,23,24);
		System.out.println("default consturctor");
	}
	public Constructor_2(int a)
	{
		this(21,22);
		System.out.println("one parameterized constructor- "+a);
	}
	public Constructor_2(int a, int b)
	{
		this();
		System.out.println("two parameterized constructor- "+a+", "+b);
	}
	public Constructor_2(int a, int b, int c)
	{
		this(21);
		System.out.println("three parameterized constructor- "+a+", "+b+", "+c);
	}
	public Constructor_2(int a, int b, int c, int d)
	{
		
		System.out.println("Four parameterized constructor- "+a+", "+b+", "+c+", "+d);
	
	}
	public static void main(String[] args) {
		Constructor_2 vp= new Constructor_2(21,22,23);
		
	}
}
