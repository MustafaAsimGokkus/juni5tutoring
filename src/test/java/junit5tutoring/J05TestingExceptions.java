package junit5tutoring;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class J05TestingExceptions {
   
	//failing situation: if our method not throws exception or throwing exception is different than our exception class
	@Test
	void testException01() {
		String str = null;
		assertThrows(NullPointerException.class,()->{System.out.println("Exception runs here");
		str.length();
		});
	}
    
	@Test
	void testException02() {
		String str = "123g";
		assertThrows(NumberFormatException.class,()->{
			Integer.parseInt(str);
		});
	}
	
	
	@Test
	void testException03() {
		assertThrows(ArithmeticException.class,()->{
			divide(4,0);
		});
	}

	private int divide(int i, int j) {
		return i/j;
		
	}
	
	@Test
	void testException04() {
		assertThrows(IllegalArgumentException.class,()->{
			printAge(-3);
		});
	}

	private void printAge(int a) {
		if(a<0) {
			
			throw new IllegalArgumentException();}
			else {
				System.out.println(a);
			}
		
	}
	
	
	
	
	
	
	
	
	
	
}
