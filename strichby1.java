class strichby1
{
	public static void main (String args [])
	{	
	    //String to char		
		String a1 = new String("Hello5");
		char ch [] = a1.toCharArray();
		for (int i = 0; i<ch.length; i++)
		{
			System.out.println(ch[i]);
		}
		
		System.out.println();
        //String to byte 		
		String a2 = new String("Good");
		byte b [] = a2.getBytes();
		for (int i = 0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		
	}
}