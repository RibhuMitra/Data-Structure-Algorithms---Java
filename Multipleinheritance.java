class Gp
{
	public void gpmethods()
	{
		System.out.println("Inside Gp");	
	}
}

class Pe extends Gp
{
	public void pemethods()
	{
		System.out.println("Inside Pe");	
	}
}

class Ch extends Pe
{
	public void chmethods()
	{
		System.out.println("Inside Ch");	
	}
}

public class Multipleinheritance
{
	public static void main(String[] args)
	{
		Ch obj = new Ch();
		obj.gpmethods();
		obj.pemethods();
		obj.chmethods();
	}
}
