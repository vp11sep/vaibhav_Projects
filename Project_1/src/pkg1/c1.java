package pkg1;

public class c1 {
	 static int a= 2; static int b=1; final static int c=2;
	public static void method1()
	{
		a=a+2;
		b=b+1;
	}
	public static void main(String[] args) {
		System.out.println("method calling by creating object"+c);
		c1 ob=new c1();
		System.out.println(c+" X "+c1.b+" = "+c1.a);
		ob.method1();
		System.out.println(c+" X "+c1.b+" = "+c1.a);
		ob.method1();
		System.out.println(c+" X "+c1.b+" = "+c1.a);
		ob.method1();
		System.out.println(c+" X "+c1.b+" = "+c1.a);
		ob.method1();
		System.out.println(c+" X "+c1.b+" = "+c1.a);
		ob.method1();
		System.out.println(c+" X "+c1.b+" = "+c1.a);
		ob.method1();
		System.out.println(c+" X "+c1.b+" = "+c1.a);
		ob.method1();
		System.out.println(c+" X "+c1.b+" = "+c1.a);
		ob.method1();
		System.out.println(c+" X "+c1.b+" = "+c1.a);
		ob.method1();
		System.out.println(c+" X "+c1.b+" = "+c1.a);
		
	}

}
