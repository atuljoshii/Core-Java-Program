import java.util.*; 
 
public class TestJavaCollection5{ 
 
public static void main(String args[])
{  
PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("shankar mani joshi");  
queue.add("Vijay shaw");  
queue.add("Atul-joshi");  
queue.add("Raj"); 
System.out.println(queue);  
System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek()); 
System.out.println(); 
  
System.out.println(" the queue elements with Iterator:");  
Iterator itr=queue.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
queue.remove();  
queue.poll();  
System.out.println(); 
System.out.println("after removing two elements:");  
Iterator<String> itr2=queue.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
}  
}  
}  