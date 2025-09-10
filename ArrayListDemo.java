 

import java.util.ArrayList.*;
import java.util.Iterator.*;

class ArrayListDemo {
	
	public static void main(String[] args)
	{
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Atul joshi");
		al.add("is");
		al.add("a");
		al.add("good boy");
		
		System.out.println(al);
		System.out.println();
		
		for(String name :al)
		{
			System.out.println(name);
		}
		
		System.out.println();
		
		Iterator<String> i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		if (al.contains("raw shit"))
		{
			System.out.println("it is thier");
		}
		else
		{
			System.out.println("it is not their");
		}
		
		
	}

}