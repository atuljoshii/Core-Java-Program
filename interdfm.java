interface My 
{
	void show();
}

interface My1 
{
	void show();
}

class interdfm implements My,My1
{
	 public void show()
	{
		System.out.println(" show from interdfm defult method class ");
	}
	
	public static void main (String args[])
	{
		My m = new  interdfm();
		m.show();
		My1 n = new  interdfm();
		n.show();
	}
}