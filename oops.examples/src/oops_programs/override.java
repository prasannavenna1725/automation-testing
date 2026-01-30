package oops_programs;

 class child {
 void dis()
 {
	 System.out.println("ola");
 }
 void demo()
 {
	 System.out.println("uber");
 }}
 class override extends child
 {
	 void dis()
	 {
		 System.out.println("rapido");
	 }
	 void show()
	 {
		 System.out.println("swiggy");
	 }
 
 public static void main(String[] args)
 {
	 override o=new  override();
	 o.dis();
	 o.show();
	 child n=new child();
	 n.dis();
	 n.demo();
 }
}
