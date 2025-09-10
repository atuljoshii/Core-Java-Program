import java.util.*; 
 
public class StringTokenizer{  

 public static void main(String args[]) throws IOException{   
 
   StringTokenizer st = new StringTokenizer("my name is khan"," "); 
   
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     } 
	 
   }  
}