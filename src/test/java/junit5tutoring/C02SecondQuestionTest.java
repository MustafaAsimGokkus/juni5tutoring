package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class C02SecondQuestionTest extends C02SecondQuestion {

	@ParameterizedTest
	@CsvSource(value = {"false,ABCD","true,ABAB","true,AB","false,A","'',false"})
	void testFirstTwoSameLastTwoChars(boolean rs,String str) {
		assertEquals(rs,firstTwoSameLastTwoChars(str));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"ABAB","AB"})
	void testFirstTwoSameLastTwoChars_positive(String str) {
		assertTrue(firstTwoSameLastTwoChars(str));
	}
    
    @ParameterizedTest
	@ValueSource(strings = {"A","ABCD",""})
	void testFirstTwoSameLastTwoChars_negative(String str) {
		assertFalse(firstTwoSameLastTwoChars(str));
	}
	
	
}
