package com.cardinal.cardinal;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.restdocs.hypermedia.Link;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

@SpringBootTest
class CardinalApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testGenerateFibonacci() {
		List<Integer> ten = CardinalApplication.generateFibonacci(10);
		System.out.println(ten.toString());
		assertTrue("[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]".equals(ten.toString()));
	}

}
