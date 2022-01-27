package junit5tutoring;

public class C02SecondQuestion {

	   /*ABCD false,ABAB true AB true
	   Type code if first 2 letters are same with last 2 letters*/
	 	
	public boolean firstTwoSameLastTwoChars(String str) {
		
		if(str.length()==2) {
			
			return true;
		
		}else if (str.length()> 2){
			
			boolean isTrue02 = str.substring(0,2).equals(str.substring(str.length()-2));
			return isTrue02;
		}else {
			return false;
		}
	  }
    }
