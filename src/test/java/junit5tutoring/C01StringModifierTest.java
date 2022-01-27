package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class C01StringModifierTest {
     
	C01StringModifier str = new C01StringModifier();
	
	
	@ParameterizedTest(name = "After this method {0} turn to {1}")
	@CsvSource(value= { "AABc,Bc" , "ABC,BC", "BCDE,BCDE", "BCAA,BCAA" , "A, ''  ", "B,B"})
	void testRemoveAFromFirstTwo(String actual ,String expected) {
	assertEquals(str.removeAFromFirstTwo(actual),expected );
	}

}
