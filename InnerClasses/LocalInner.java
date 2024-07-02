import java.lang.*;
import java.util.*;
class Outer
{
	public void display()
	{
		class Inner
		{
			public void show()
			{
				System.out.println("Hello");
			}
		}
		Inner i = new Inner();
		i.show();
		/*
		  I can also create an anonymous object without a reference
		  
		  new Inner().show();
		  
		  like this
		*/
	}
}
class LocalInner
{
	public static void main(String args[])
	{
		Outer o = new Outer();
		o.display();
	}
}