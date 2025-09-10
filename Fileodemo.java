import java.io.*;

class Fileodemo
{
	public static void main (String args[]) throws Exception
	{
		FileOutputStream fos =  new FileOutputStream("cristal.txt");
		
		// the file cristal.txt is craeated in folder where java file saved
		
		String s1 = "You Know what thime is it " ;
		
		byte b [] = s1.getBytes();
		
		for(int i = 0; i<b.length; i++)
		{
			fos.write(b[i]);
		}
	}
}