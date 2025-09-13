public class Swap{
	public static void main(String[]agrs){
		System.out.println("Swap Two Number Without Using third veriable");

		int a = 20;
		int b = 10;

		System.out.println("Before Swaping Veriable A is = "+a);
		System.out.println("Before Swaping Veriable B  is = "+b);


		 a = a+b;  
		 b = a-b;  
		 a = a-b; 

		System.out.println("After Swaping Veriable a = "+a);
		System.out.println("After Swaping Veriable b = "+b);
                  
	}
}