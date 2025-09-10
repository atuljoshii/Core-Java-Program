class Upcasting {
	 
	 void show () 
	 {
		 System.out.println("Show from upcasting");
	 }

}

class Upcasting2 extends Upcasting{
	
	 void show () 
	 {
		 System.out.println("Show from upcasting 2");
	 }
	
	 void  display () 
	 {
		 System.out.println(" Display from upcasting");
	 }
	 
	    public static void main(String[] args)
	{
		Upcasting c1 = new Upcasting2(); //upcasting hori hai 
		c1.show();
		Upcasting2 c2 = (Upcasting2)c1; // Downcasting hori hai 
		c2.display();
		
		
		
	}
	 
}
 