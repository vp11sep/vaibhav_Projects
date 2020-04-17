package pkg1;

public class student {
	
	int roll_no;
	int age;
		
	public void vaibhav()
	{
		
		System.out.println("Welcome to my 2nd project");
	}
	public void prashant()
	{
		System.out.println("Project Completed");
	}
	public static void main(String[] args) {
		
		student vp= new student();
		vp.vaibhav();
		vp.roll_no= 1;
		//System.out.println("Roll_No= "+ vp.roll_no);
		vp.age= 20;
		System.out.println("Roll_No= "+ vp.roll_no);
		System.out.println("Age= "+vp.age);
		vp.roll_no=2;
		//System.out.println("Roll_no= "+ vp.roll_no);
		vp.age= 21;
		System.out.println("Roll_no= "+ vp.roll_no);
		System.out.println("Age= "+ vp.age);
		vp.prashant();
	}
}
