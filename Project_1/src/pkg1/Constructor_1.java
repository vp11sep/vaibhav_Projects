package pkg1;

public class Constructor_1 {
	int a,b,c,d;

	public Constructor_1()
	{
		System.out.println("default consturctor");
	}
	public Constructor_1(int a)
	{
		System.out.println("one parameterized constructor");
	}
	public Constructor_1(int a, int b)
	{
		System.out.println("two parameterized constructor");
	}
	public Constructor_1(int a, int b, int c)
	{
		System.out.println("three parameterized constructor");
	}
	public Constructor_1(int a, int b, int c, int d)
	{
		System.out.println("Four parameterized constructor");
	
	}
	public static void main(String[] args) {
		Constructor_1 vp= new Constructor_1(21,22,23,24);
		Constructor_1 vp_d= new Constructor_1();
		Constructor_1 vp_2= new Constructor_1(21,22);
		Constructor_1 vp_1= new Constructor_1(21);
		Constructor_1 vp_3= new Constructor_1(21,22,23);
	}
}
