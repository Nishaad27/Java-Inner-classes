import java.lang.*;
import java.util.*;
class Outer
{
	int x = 10;
	class Inner
	{
		int y = 20;
		void innerDisplay()
		{
			System.out.println(x);
			System.out.println(y);
		}
		
	}
	void outerDisplay()
	{
		System.out.println(x);
		Inner i = new Inner();
		i.innerDisplay();
		System.out.println(i.y);
	}
	
}
class NestedInner
{
	public static void main(String args[])
	{
		Outer o = new Outer();
		o.outerDisplay();
		System.out.println("\n\n\n");
		Outer.Inner i = new Outer().new Inner();
		i.innerDisplay();
		/*
		  I can create object of inner class in the outer class
		  before the declaration of the inner class as well.
		  
		  And inside the inner class i can also access 
		  the static variables of the outer class.
		*/
	}
}