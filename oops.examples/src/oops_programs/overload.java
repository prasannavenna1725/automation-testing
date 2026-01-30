package oops_programs;

public class overload {
	void dis(String name)
	{
		System.out.println("river");
	}
void dis(int a)

{
	System.out.println("a="+a);
}
void dis(float b)
{
	System.out.printf("b="+b);
}

public static void main(String[] args)
{
	overload o =new overload();
	o.dis("river");
	o.dis(4);
	o.dis(10);
}
}