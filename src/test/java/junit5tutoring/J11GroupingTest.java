package junit5tutoring;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class J11GroupingTest {

	//test exactMultiply() with non-zero int
	
	@ParameterizedTest
	@CsvSource(value= {"15,3,5","15,5,3","-15,-3,5","-15,3,-5","15,-5,-3"})

    void multiply (int result,int x,int y) {
		
		assertEquals(result,Math.multiplyExact(x, y));
	   
	   }
     
	 @Nested
	 class OperationWithZero{
		 
		 @ParameterizedTest
		 @CsvSource(value= {"4,4,0","4,0,4","-4,0,-4","-4,-4,0"})
		 
		 void add(int rs, int x,int y) {
			 assertEquals(rs,Math.addExact(x, y));
		 }
		 
		 @ParameterizedTest
		 @CsvSource(value= {"0,4,0","0,0,4","0,0,-4","0,-4,0","0,0,0"})
		 
		 void multiply(int rs, int x,int y) {
			 assertEquals(rs,Math.multiplyExact(x, y));
		 }
		 
		 @ParameterizedTest
		 @CsvSource(value= {"0,4,0","0,0,4","0,0,-4","0,0,15","0,0,75"})
			void divideByZero(int rs,int x, int y) {
			    if(y==0) {
				assertThrows(ArithmeticException.class,()->{
					
					divide(4,0);
				});
			}else {
				assertEquals(rs,divide(x, y));
			}
		 }
			private int divide(int i, int j) {
				return i/j;
				
		}
		 
		 
	 }
	
	
    }
