class strichby
{
	public static void main (String args [])
	{
	     //character to strring 
		 
		 char ch [] = {'h','e','l','l','o'};
		 
		 String s1 = new String(ch);
		 System.out .println(s1);
		 
		 //o to 4 tak matlab h se leke l tak 
		 String s2 = new String(ch,0,4);
		 System.out .println(s2);
		 
		 //byte to strring
		 
		 byte b [] = {64,65,66,67,68,69}; // these are the asky values
		 
		 String h1 = new String(b);
		 System.out .println(h1);
		 
		 String h2 = new String(b,0,4);
		 System.out .println(h2);
		 
	}
}