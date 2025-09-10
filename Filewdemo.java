import java.io.*;

class Filewdemo
{
	public static void main (String args[]) throws Exception
	{
		 FileWriter fos =  new FileWriter("atul.txt");
		
		// the file cristal.txt is craeated in folder where java file saved
		
		String s1 = "You Know what thime is it " ;
		
		for(int i =0; i<s1.length(); i++)
		{
			fos.write(s1.CharAt(i));
		}	
		 fos.close();
	}
}
