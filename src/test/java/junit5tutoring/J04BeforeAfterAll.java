package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class J04BeforeAfterAll {
	//@BeforeAll and @AfterAll must be static to run
	
	 @BeforeAll
	static void beforeAll(TestInfo info) {
		 System.out.println(info.getDisplayName()+" create a conn with db.");
	 }
	
	static @AfterAll
	 void tearDown(TestInfo info) {
		 System.out.println(info.getDisplayName()+" close conn with db");
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
	  
	  
	  @Test
		void setStringToArray() {
			
			String str = "Java is easy";
			String actualArr[] =str.split(" ");
			
			String expectedArr[] = {"Java","is","easy"};
			assertArrayEquals(actualArr,expectedArr);
			assertTrue(Arrays.equals(expectedArr, actualArr));
			 System.out.println("setStringToArray() runs here.");
		}

}
