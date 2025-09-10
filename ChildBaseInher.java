class base {
	
	int x;
	int y;
	
	void show (){
		System.out.println(x+y);
	}
	
}

class ChildBaseInher extends base{
	
	void get (int x,int y){
		
		this.x=x;
		this.y=y;
		
	}
	
	public static void main(String arg[])
	{
		ChildBaseInher cb1 = new ChildBaseInher();

        cb1.get(10,30);
        cb1.show();		
	}
	
}