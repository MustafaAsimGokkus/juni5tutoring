package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class J07ParameterizedTest {

	@Test
	@DisplayName("Strings with length > 0")
	void test() {
		assertTrue("ABCD".length()>0);
		assertTrue("ABC".length()>0);
		assertTrue("ABCDEFG".length()>0);
		assertTrue("A".length()>0);
	}
    //Normal parameterized test
	@ParameterizedTest
	@ValueSource(strings = {"ABCD","ABC","ABCDEFG","A"})
	void lengthGreaterThanZero(String str) {
		assertTrue(str.length()>0);
	}
	
	//Advanced parameterized test
	@ParameterizedTest(name="the result for {1} to uppercase is {0}")
	@CsvSource(value= {"ABCD,abcd","ABC,abc","ABCDEFG,abcdEfg","A,A"})
	void uppercaseTest(String expected,String actual) {
		assertEquals(expected,actual.toUpperCase());
	}
	
	@ParameterizedTest(name="the length of String {1}  is {0}")
	@CsvSource(value= {"4,abcd","3,abc","7,abcdEfg","1,A"})
	
	void uppercaseTest(int x,String str) {
		assertEquals(x,str.length());
	
	}
	
	
	
}
