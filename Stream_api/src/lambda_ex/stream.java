package lambda_ex;
import java.util.*;
import java.util.stream.*;

public class stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//without stream
	    List<Integer>list1 = List.of(1,32,45,21,33,88,45);
	       List<Integer> listEven = new ArrayList<>();
	    
	    for (Integer i : list1) {
	    	if(i%2==0) {
	    		listEven.add(i);
	    	}
	    }
 System.out.println("Even numbers without stream: " + listEven);
	    
	
   //with stream	
 /*	Stream<Integer> stream = list1.stream();
   List<Integer>newList= stream.filter(i ->i % 2 == 0).collect(Collectors.toList());
   System.out.println(newList);*/
 
   List<Integer> newList=list1.stream().filter(i -> i %2==0).collect(Collectors.toList());
   System.out.println("Even numbers with stream: " + newList);
   
   
   List<Integer> newList1=list1.stream().filter(i->i>35).collect(Collectors.toList());
   System.out.println(newList1);
    
   //sum
   int sum = list1.stream().mapToInt(Integer::intValue).sum();
   System.out.println("Sum of all numbers: " + sum);
    //average	
   double average = list1.stream().mapToInt(Integer::intValue).average().orElse(0.0);
   	
   System.out.println("Average of all numbers: " + average);
   
   //sum
   List<Integer> list2 = List.of(1,2,3,4,5,6,7,8,9,10);
   int sum2= list2.stream().mapToInt(Integer::intValue).sum();
   System.out.println("Sum of numbers in list2: " + sum2);
		  
   
  

	}

}
