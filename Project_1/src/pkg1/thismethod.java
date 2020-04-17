package pkg1;

public class thismethod 
{
	public void p1()
	{
		System.out.println("This is default parameter Method: ");
	}
	public void p2(int a)
	{
		System.out.println("This is one parameter Method: "+a);
	}
	public void p3(int a, int b)
	{
		System.out.println("This is  two parameter Method:"+a+", "+b);
	}
	public void p4(int a, int b, int c)
	{
		System.out.println("This is three parameter Method: "+a+", "+b+", "+c);
	}
	public void p5(int a, int b, int c, int d)
	{		
		System.out.println("This is four parameter Method: "+a+", "+b+", "+c+", "+d);
		this.p1();
		this.p2(2);
		this.p4(2, 3, 4);
		this.p3(2, 3);
	}
public static void main(String[] args) 
{
	thismethod ob= new thismethod();
	ob.p5(2, 3, 4, 5);
	
	
}
}
