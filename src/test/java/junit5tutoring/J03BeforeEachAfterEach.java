package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class J03BeforeEachAfterEach {

	@Test
	void startingTest(TestInfo info) {
		//fail("Not yet implemented");
		System.out.println("startingTest() runs here.");
	}
   @BeforeEach
   void setUp(TestInfo info) {
	   String str = "Java is easy";
	   System.out.println(info.getDisplayName()+" runs here.");
   }
   
   @AfterEach
   void afterEach(TestInfo info) {
	 String str="";
	 System.out.println(info.getDisplayName()+" runs here.");
   }
   
   @Test
	void testWithArray() {
		
		String str = "Java is easy";
		String actualArr[] =str.split(" ");
		
		String expectedArr[] = {"Java","is","easy"};
		assertArrayEquals(actualArr,expectedArr);
		assertTrue(Arrays.equals(expectedArr, actualArr));
		 System.out.println("testWithArray() runs here.");
	}
   
}
