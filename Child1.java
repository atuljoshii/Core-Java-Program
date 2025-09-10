 class Singal
{
	
       int x=20;

}


 class Child1 extends Singal
{
  int x = 30;
  
  void show()
  {
	  System.out.println(x);
	  System.out.println(this.x);
	  System.out.println(super.x);
  }

  public static void main (String args[])
  {
	  Child1 c1 = new Child1();
	  c1.show();
  }

}