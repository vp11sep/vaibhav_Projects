package pkg1;

public class calculation_3 {

	public void Task() {
		System.out.println("----Task is to solve ((((((10/2)-2)+2)-2)+2)*2)-----");

	}
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub(int d, int e)
	{
		int f;
		f=d-e;
		return f;
	}
	public void mul(int p, int q)
	{
		int r;
		r=p*q;
		System.out.println(r);
	}
	public int div(int x, int y)
	{
		int z;
		z=x/y;
		return z;
	}
	public static void main(String[] args) {
		calculation_3 ob=new calculation_3();
		ob.Task();
		int r_div =ob.div(10, 2);
		System.out.println("First calculation of (10/2) will be "+r_div);
		int r_sub =ob.sub(r_div, 2);
		System.out.println("Second calculation of (10/2)-2) will be "+r_sub);
		int r_sum= ob.sum(r_sub, 2);
		System.out.println("Third calculation of (10/2)-2)+2) will be "+r_sum);
		int r_sub2= ob.sub(r_sum, 2);
		System.out.println("Forth calculation of (10/2)-2)+2)-2) will be "+r_sub2);
		int r_sum2= ob.sum(r_sub2, 2);
		System.out.println("Fifth calculation of (10/2)-2)+2)-2)+2) will be "+r_sum2);
		ob.mul(r_sum2, 2);
	}
}