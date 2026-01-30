package oops_programs;

public class this_sample {
	int a,b;
	this_sample(int a, int b)
	{
		this.a = a;
		this.b = b;
		System.out.println("the value of a:" +a);
		System.out.println("the value of b:" +b);
	}
	void show()
	{
		int a=2;
		int b=3;
		System.out.println("the value of a:" +a);
		System.out.println("the value of b:"+b);
		
	}
	public static void main(String[] args)
	{
		this_sample o = new this_sample(5,6);
		o.show();
	}
	
}

