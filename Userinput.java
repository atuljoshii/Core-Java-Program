import java.util.*;

class Userinput
{
	public static void main (String args[])
	{
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter your name ");
	String name = sc.next();
	System.out.println("your name is "+ name);
	
	System.out.println("Enter your age ");
	int age = sc.nextInt();
	System.out.println("your age is "+ age);
	
	System.out.println("Enter your salary ");
	float salary = sc.nextFloat();
	System.out.println("your salary is "+ salary);
	
	}
}