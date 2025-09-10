interface My 
{
	int x = 20;
}

class fin implements My
{
	public static void main (String args[])
	{
		 System.out.println(x);
		 x=x+10;
	}
}



 //error: cannot assign a value to final variable x
                // x=x+10;
                // ^
//interface me  data member or veriable final ban	jate hai			
				