class Basic2 {
	
	
	  void show () 
	{
		System.out.println("Show from basic");
	}

}

// Stronger to weaker = not allowed perents to child not allowed allowed
// weaker to stronger = allowed  child to parent allowed

// attempting to assign weaker access privileges; was public 1 error


class Basic3 extends Basic2 {
	
//Method Hiding = Whenever the parent class and child class both
//are having same static method then this concept is known as 
// Method Hiding.		
	
	 public void show () 
	{
		System.out.println("Show from basic2 child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Basic3 c1 = new Basic3 ();
		c1.show();
		 
	}

}
