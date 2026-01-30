package oops_programs;

 class parent {

 void demo2()
 {
	 System.out.println("car");
 }
void demo1()
{
	System.out.println("bike");
	
}}
class inheritance extends parent
{
	void demo3()
	{
		System.out.println("scooty");
	}
	void demo4()
	{
		System.out.println("bus");
	}

public static void main(String[] args)
{
inheritance o = new inheritance();

o.demo2();
o.demo1();
o.demo3();
o.demo4();
}}





