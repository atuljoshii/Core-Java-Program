import java.io.*;

class Fileodemo1
{
	public static void main (String args[]) throws Exception
	{
		FileOutputStream fos =  new FileOutputStream("D:/Notepad++/notpad++/p1/cristal2.txt");
		
		// the file cristal.txt is craeated in folder where java file saved
		
		String s1 = "You Know what thime is it this is a file by the path " ;
		
		byte b [] = s1.getBytes();
		
		for(int i = 0; i<b.length; i++)
		{
			fos.write(b[i]);
		}
	}
}
