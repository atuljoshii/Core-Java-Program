class Stringdemo2
{
	public static void main (String args [])
	{
		 char ch[] = {'h','e','l','l','o'};
		 
		 System.out.println("With char array");
		 String s1 = new String (ch);
		 System.out.println(s1);
		 System.out.println(s1.length());
		 
		 System.out.println();
		 System.out.println("With char index ");
		 String s2 = new String(ch,1,3);
		 System.out.println(s2);
		 
		 byte b [] = {97,98,99,100,101,102,103};
		 System.out.println();
		 System.out.println("With byte arry");
		 String s3 = new String (b);
		 System.out.println(s3);
		 
		 System.out.println("byte with index");
		 
		 String s4 = new String(b, 0,3);
		 System.out.println(s4);
		
	}
}