package java_oops;
 
class child 
{
	 int salary1=10000;
	 String designation1="associate";
	 
	void demo()
	{
		
		System.out.println("employee salary:" +salary1);
		System.out.println("employee designation:" +designation1);
	}
}
class polymorphism extends child
{
	int salary2= 20000 ;
	String designation2 = "trainer";
	void demo()
	{
		super.demo();
		
		System.out.println("the value of salary:"+salary2);
		System.out.println("the value ofdesignation:"+designation2);
		
	}

	 public static void main(String[] args)
	 {
		 polymorphism obj = new polymorphism ();
		 obj.demo();
		
	 }
}
