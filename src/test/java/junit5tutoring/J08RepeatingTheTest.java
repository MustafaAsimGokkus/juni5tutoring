package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class J08RepeatingTheTest {

	
	@BeforeEach
	void beforeEach() {
		System.out.println("beforeEach() runs here");
	}
	
	
	@AfterEach
	void afterEach() {
		System.out.println("afterEach() runs here");
		System.out.println("======================");
	}
	
	
	
	@RepeatedTest(10)
	void containsTest() {
		System.out.println("exactAddTest() runs");
		assertFalse("asim".contains("xy"));
	}	
		
		
	@RepeatedTest(10)
	void exactAddTest() {
		System.out.println("exactAddTest() runs");
		assertEquals(5,Math.addExact(2, 3));
	}
	

}
