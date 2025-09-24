package lambda_ex;
import java.util.*;

public class parallel_stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>value=List.of(1,2,3,4,5,6,7,8,9);
		//value.parallelStream().forEach(System.out::println);
		
		//int sum=value.parallelStream().mapToInt(Integer::intValue).sum();
		//System.out.println("Sum of all numbers: " + sum);
		
		int sum=value.parallelStream().reduce(0,Integer::sum);
		System.out.println("Sum of all numbers: " + sum);
	}

}
