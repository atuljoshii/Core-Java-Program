class Singal
{
	void show()
	{
		
		 System.out.println("This is from singal");  
	}
    

}


 class Child2 extends Singal
{
   
  
  void show()
  {
	  System.out.println( "This is from child2 which extends singal");
	  super.show(); // by the help of super method we can access parent class method
  }

  public static void main (String args[])
  {
	  Child2 c1 = new Child2();
	  c1.show();
  }

}