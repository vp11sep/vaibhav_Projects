package pkg1;

public class calulation_2 {

	public void Task() {
		System.out.println("----Task is to solve ((((10+2)-2)+2)*)/2-----");

	}
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		//System.out.println("First calculation of (10+2) will be "+c);
		return c;
	}
	public int sub(int d, int e)
	{
		int f;
		f=d-e;
		//System.out.println("Second calculation of (10+2)-2) will be "+f);
		return f;
	}
	public int mul(int p, int q)
	{
		int r;
		r=p*q;
		//System.out.println(r);
		return r;
	}
	public void div(int x, int y)
	{
		int z;
		z=x/y;
		System.out.println("Final result is "+z);
	}
	public static void main(String[] args) {
		calulation_2 ob=new calulation_2();
		ob.Task();
		int r_sum =ob.sum(10, 2);
		System.out.println("First calculation of (10+2) will be "+r_sum);
		int r_sub =ob.sub(r_sum, 2);
		System.out.println("Second calculation of (10+2)-2) will be "+r_sub);
		int r_sum2= ob.sum(r_sub, 2);
		System.out.println("Third calculation of (10+2)-2)+2) will be "+r_sum2);
		int r_mul= ob.mul(r_sum2, 2);
		System.out.println("Forth calculation of (10+2)-2)+2)*2) will be "+r_mul);
		ob.div(r_mul, 2);
	}
}
