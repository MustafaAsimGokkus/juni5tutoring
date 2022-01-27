package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class J01Assertions {

	@Test
	void test() {
	//	fail("Not yet implemented");
	}
   @Test
      void testToLength() {
	   
	   int actLength = "abcd".length();
	   int expLength = 4;
	   
	   /*
	    1. assertEquals();
	    2.assertTrue();
	    3.assertFalse();
	  
	    */
	   
	   assertEquals(expLength,actLength);
	   assertEquals(expLength,actLength,"data does not match");
	   
	   assertTrue(expLength==actLength);
	   assertTrue(expLength==actLength,"data does not match");
	   
	   assertFalse(expLength != actLength);
	   assertFalse(expLength != actLength,"data does not match");
	   
   }
   
   void testToConvertUpper() {
	   String actualString = "abcd".toUpperCase();
	   String expectedString ="ABCD";
	   String str= null;
	   
	   assertEquals(actualString,expectedString);
	   assertEquals(actualString,expectedString,"data does not match");
	   
	   assertTrue(actualString.equals(expectedString));
	   assertTrue(actualString.equals(expectedString),"data does not match");
	   
	   assertFalse(!actualString.equals(expectedString));
	   assertFalse(!actualString.equals(expectedString),"data does not match");
	   
	   assertNull(str,"string should be null");  // ???????????????????????????
	   assertNotNull(str,"string should not return null");// ??????????????????
	   
   }
   
   @Test
   void testToContain() {
	   assertEquals (false,"abcd".contains("fa"));
	   assertEquals (false,"abcd".contains("fa"),"data does not match");
	   
	   assertTrue(false=="abcd".contains("fa"));
	   assertTrue(false=="abcd".contains("fa"),"data does not match");
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

}
