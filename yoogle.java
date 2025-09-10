class yoogle
{
int id ;
String name ;
int salary;
static String cname = "Google";

void store (int id1, String name1, int salary1)
{
id=id1;
name=name1;
salary=salary1;
}

void display()
{
System.out.println(id);
System.out.println(name);
System.out.println(salary);
System.out.println(cname);
}

public static void main (String args[])
{
     yoogle emp1 = new yoogle ();
     emp1.store(101,"atul",76543);
	 emp1.display();
	 
	 System.out.println();
	 
	 yoogle emp2 = new yoogle ();
     emp2.store(102,"nuel",76643);
	 emp2.display();
	 
	  System.out.println();
	 
	 yoogle emp3 = new yoogle ();
     emp3.store(101,"atul",76543);
	 emp3.display();
	 
	 int num = 2;
	 int i = 1;
	 
	 do
	 {
		  System.out.println(num*i);
		  i++;
	 }
	 while (i <=10);
	 
	 
	 for (int y=1 ; y<=5; y++)
	 {
		for (int j=1 ; j<=5; j++)
		{
       System.out.println(j+" *");
		}
      System.out.println();
	 }	  
}

}
