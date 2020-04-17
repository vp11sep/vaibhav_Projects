package pkg1;

public class polychild extends polyparent
{
	public void method1 (int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("child method "+ c);
	}
	public static void main(String[] args) {
		polychild ob= new polychild();
		//int abc=ob.method1(50, 20, 30);
		ob.method1(100, 200);
	}

}
