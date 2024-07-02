import java.lang.*;
import java.util.*;
class Outer
{
	int x = 10;
	static int y = 20;
	static class Inner
	{
		public void show()
		{
			System.out.println(y);
			
			/*
			static inner class can access only static members
			of an outer class
			*/
		}
	}
}
class StaticInner
{
	public static void main(String args[])
	{
		Outer.Inner obj = new Outer.Inner();
		obj.show();
		
	}
}