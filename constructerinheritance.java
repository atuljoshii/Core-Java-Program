//Constructor inheritance 

class a 
{
	a()
	{
		System.out.println("a");
	}
}
class b extends a
{
	b()
	{
		super();
		System.out.println("b");
	}
}
class constructerinheritance extends b
{
	constructerinheritance()
	{
		
		System.out.println("c");
	}
	constructerinheritance(int x)
	{
		
		System.out.println(x);
	}
	
	public static void main (String args [])
	{
		new constructerinheritance();
		new constructerinheritance(10);
	}
}
 