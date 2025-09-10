import java.net.*;
import java.io.*;

class Myclient
{
	public static void main (String args []) throws Exception
	{
		Socket s = new Socket("localhost",4545);
		
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		
		dos.writeUTF(" Hello server kya hal hai bhai hame tho tu bhul gyaa hai yrr");
		dos.writeUTF(" kya hal hai bhai hame tho tu bhul gyaa hai yrr");
		//dos.flush();
		dos.close();
		s.close();
	}
}