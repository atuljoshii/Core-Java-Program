import java.net.*;
import java.io.*;

class Myserver
{
	public static void main (String args[]) throws Exception
	{
		ServerSocket ss = new ServerSocket(4545);
		System.out.println("server started.........");
		Socket s=ss.accept();
		
		DataInputStream dis = new DataInputStream(s.getInputStream());
		
		String msg = (String)dis.readUTF();
		String bbs = (String)dis.readUTF();
		
		System.out.println("Client send a message :"+msg);
		System.out.println("Client send 2nd message :"+bbs);
		
		dis.close();
		s.close();
		ss.close();
	}
}