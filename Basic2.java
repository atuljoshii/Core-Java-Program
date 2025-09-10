class Basic {
	
	
	static void show () 
	{
		System.out.println("Show from basic");
	}

}


class Basic2 extends Basic {
	
//Method Hiding = Whenever the parent class and child class both
//are having same static method then this concept is known as 
// Method Hiding.		
	
	static void show () 
	{
		System.out.println("Show from basic2 child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Basic2 c1 = new Basic2 ();
		c1.show();
		 
	}

}
