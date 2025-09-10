import java.io.*;

class Fileidemo
{
	public static void main (String args[]) throws Exception
	{
		FileInputStream fis =  new FileInputStream("D:\\Notepad++\\notpad++\\p1\\cristal2.txt");
		
		// by the FileInputStream we can read the data of the file 
		
		int i = 0;
		
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}
