import java.util.*;

public class Scannerscbh {

     public static void main(String[] args) {
		
    	 Scanner sc = new Scanner (System.in);
    	 
    	 System.out.println("Enter your name ");
    	 String Name = sc.next();
    	 System.out.println("Your name is "+Name);
    	 System.out.println();
    	 System.out.println("Enter your age "+Name);
    	 System.out.println();
    	 int age = sc.nextInt();
    	 System.out.println("Your age is "+ age +Name+"  ji");
    	 if(age>=18)
    	 {
    	     System.out.println(Name+" your are eligable to vote in 2024 election");
    	 }
    	 else
    	 {
    		 System.out.println(Name+" your age is not vaild for voiting");
    	 }
    	 
    	 if(Name.contains(Name))
    	 {
    		 System.out.println(Name+"ji");
    	 }
    	 
	}
	
}
