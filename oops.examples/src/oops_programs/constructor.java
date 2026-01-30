package oops_programs;

public class constructor {
int a ,  b;
constructor(int a,int b)

{
	this.a = a;
	this.b = b;
	System.out.println("the value of a:" +a);
	System.out.println("the value of b:" +b);
}
void dis()
{
	int a =9;
	int b=8;
	System.out.println("the value of a:"+a);
	System.out.println("the calue of b:" +b);
}
public static void main(String[] args)
{
	constructor o = new constructor(4,5);
	o.dis();
	
}
}
