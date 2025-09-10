import java.io.*;

class Filebyodemo
{
	public static void main (String args []) throws Exception
	{
		ByteArrayOutputStream  baos = new ByteArrayOutputStream();
		
		String s2 = "I am atul joshi from khoda colony gaz";
		
		byte b [] = s2.getBytes();
		
		baos.write(b);
		
		baos.writeTo(new FileOutputStream ("D:/Notepad++/notpad++/p1/About1.txt"));
		baos.writeTo(new FileOutputStream ("D:/Notepad++/notpad++/p1/About2.txt"));
		baos.writeTo(new FileOutputStream ("D:/Notepad++/notpad++/p1/About3.txt"));
		baos.writeTo(new FileOutputStream ("D:/Notepad++/notpad++/p1/About4.txt"));
		baos.writeTo(new FileOutputStream ("D:/Notepad++/notpad++/p1/About5.txt"));
		 
	}
}