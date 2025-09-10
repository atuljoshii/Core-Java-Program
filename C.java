/*class A
{
	A()
	{
		System.out.println("A");
	}
	
	A(int A)
	{
		 
		System.out.println(A);
	}
}

class B extends A
{
	B()
	{
		
		System.out.println("B");
	}
	
	B(int B)
	{   super(5);
		System.out.println(B);
	}
}

class C extends B
{
	C()
	{
		
		System.out.println("C");
	}
	
	C(int x)
	{
		super(10);
		System.out.println(x);
	}
	
	
	public static void main(String[] args)
	{
		new C();
		new C(20);
	}
}*/

class A
{
	A()
	{
		System.out.println("A");
	}
	
	A(int A)
	{
		 
		System.out.println(A);
	}
}

class B extends A
{
	B()
	{
		super(5);
		System.out.println("B");
	}
	
	B(int B)
	{   
		System.out.println(B);
	}
}

class C extends B
{
	C()
	{
		super(10);
		System.out.println("C");
	}
	
	C(int x)
	{
		
		System.out.println(x);
	}
	
	
	public static void main(String[] args)
	{
		new C();
		new C(20);
	}
}


