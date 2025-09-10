class initblock
{
	int x ;
	{
		x=10;
		System.out.println("initblock");
	}
	initblock()
	{
		System.out.println("Defult constructor");
	}
	initblock(int x)
	{
		System.out.println(x);
	}
	
	{
		System.out.println("Second initblock");
	}
	public static void main (String args[])
	{
		new initblock();
		new initblock(20);
	}
}


//initblock is always executed before the any constructor whenever that constructor is used 
//for creating a new object
/* the complet code of initblock is inserted into the first line of any constructor whenever that 
constructor is used to create a new object.

if you want to do a particular task in each constructor  then rather them putting the code of that task
inneach constructor make an initblock and put the code of that task into initblock.*/