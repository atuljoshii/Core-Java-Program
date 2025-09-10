class Nest2
{
	int x = 10;
	static int i = 20;
	
	//this is the exampal  of static nested class with inner main method
	
	static class inner
  {
		int b = 40;
	     void you()
		{
			System.out.println(i);
			System.out.println(b);
		}
	//we can use non static data member and method in static inner class
	public static void main (String args[])
	{
		System.out.println("This is the main method from inner class");
		//this main method will run with ( Nest2$inner )
	}
	
  }
	public static void main (String args [])
	{
		System.out.println("From main  class method ");
		inner in = new inner();
		in.you();
		//inner.you();
	}
}

/* we can use non static data member and method in static inner class (static class ke andar
 non static data member and method dono ko use kar sakte hai par jo khali inner class me bana hua ho
outer class ka non static data member and method ko hum inner class me use nahi kar sakte */ 
// but we cannot use non static data member and method of outer class in inner class