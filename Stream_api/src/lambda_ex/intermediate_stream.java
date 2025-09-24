package lambda_ex;

import java.util.*;
import java.util.stream.Collectors;

public class intermediate_stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reduce
		List<Integer> numbers = List.of(10, 20, 30);

		int total = numbers.stream().reduce(0,Integer::sum); 

		System.out.println(total); 

		
		//filter
		List<String> names = List.of("Niharika", "Aru", "nidhi");

		List<String> longNames = names.stream() .filter(name -> name.length() > 5).collect(Collectors.toList());

		System.out.println(longNames); 
		
		//optional
		Optional<String> name = Optional.of("Niru");

		name.ifPresent(System.out::println); 

		//map
		List<String> names1 = List.of("Niharika", "Amita", "Raavi");

		List<Integer> nameLengths = names1.stream()
		    .map(String::length) 
		    .collect(Collectors.toList());

		System.out.println(nameLengths); 
	}

}
