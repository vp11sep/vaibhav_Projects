package pkg1;

public class staticpolymorphism 
{
	public int vaibhav(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
		return c;		
	}
	public void vaibhav(int e, float f)
	{
		float d;
		d= e-f;
		System.out.println(d);
	}
	public static void main(String[] args) {
		staticpolymorphism ob= new staticpolymorphism();
		int abd=ob.vaibhav(100, 200);
		ob.vaibhav(abd, 55.3F);
	}

}
