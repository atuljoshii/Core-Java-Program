class Down {
	 
	 void show () 
	 {
		 System.out.println("Show from upcasting");
	 }

}

 // downcasting you get back child refrance id in parent refrance variable

class  Downcasting extends  Down{
	
	 void show () 
	 {
		 System.out.println("Show from upcasting 2");
	 }
	
	 void  display () 
	 {
		 System.out.println("Display from upcasting");
	 }
	 
	    public static void main(String[] args)
	{
		 Down c1 = new  Downcasting();
		c1.show();
		Downcasting c2 = (Downcasting)c1;  //Downcasting
		c2.display();
		
	}
	 
}
 