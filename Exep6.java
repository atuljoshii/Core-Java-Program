import java.io.*;
class Exep6
{
	public static void main (String args [])throws Exception
	{
		int x = 10/0;
		System.out.println(x);
		int y [] = {10,20};
	    y [4] = 9;
	    System.out.println(y);
		FileOutputStream fos =new FileOutputStream("abc.txt");
	}
}