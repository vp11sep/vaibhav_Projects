package pkg1;

public class child_static_method extends parent_static_method
{
	public void method2()
	{
		System.out.println("I am child static method");
	}
	public static void main(String[] args) 
	{
		parent_static_method ob= new parent_static_method();
		child_static_method cb= new child_static_method();
		ob.Method1();
		cb.method2();
		
		
	}

}
