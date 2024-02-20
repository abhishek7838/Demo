package april13Abstraction;

public abstract class ClassA 
{
	public abstract void meth1();
	static
	{
		System.out.println("static block");
		
	}
	{
		System.out.println("not static block");
	}
	ClassA()
	{
	}

	public static void main(String[] args) 
	{
		
		

	}

}
