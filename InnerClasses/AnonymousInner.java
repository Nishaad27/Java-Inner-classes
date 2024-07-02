import java.lang.*;
import java.util.*;
abstract class My
{
	abstract public void show();
}
class Outer
{
	public void display()
	{
		My m = new My()
		{
			public void show()
			{
				System.out.println("Hello");
			}
		};
		m.show();
		/*
		  Here also i can use an anonymous object without a reference
		  
		  like 
		  
		  new My()
		  {
			  public void show()
			  {
				  System.out.println("Hello");
			  }
		  }.show();
		*/
	}
}
class AnonymousInner
{
	public static void main(String args[])
	{
		Outer o = new Outer();
		o.display();
		
	}
}