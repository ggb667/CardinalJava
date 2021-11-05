package com.cardinal.cardinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.List;
import java.util.stream.*;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
public class CardinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardinalApplication.class, args);
	}

	public static List<Integer> generateFibonacci(int series) {
		return Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]}) // lambda expression
					.limit(series)
	   .map(n -> n[0])
	   .collect(Collectors.toList());
	}
	
}
