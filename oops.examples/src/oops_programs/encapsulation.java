package oops_programs;

public class encapsulation {

	private String name;
	public String getname()
	{
		return name;
	}
	public void setname(String newname)
	{
		this.name = newname;
	}
	public static void main(String[] args)
	{
		encapsulation hs = new encapsulation();
		hs.setname("venna");
		System.out.println(hs.getname());
	}

}
