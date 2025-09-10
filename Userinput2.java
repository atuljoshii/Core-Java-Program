import java.util.*;

class Userinput2
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name");
		String name = sc.next();
		System.out.println("Your Name is "+name);
		
		System.out.println("Enter your Age");
		int Age = sc.nextInt();
		System.out.println("Your Age is "+Age);
		
	}
}