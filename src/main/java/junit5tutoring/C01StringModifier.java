package junit5tutoring;

public class C01StringModifier {
  /*
   
   AABc==>BC , ABC==>BC, BCDE ==>BCDE, BCAA==>BCAA , A==>"" B==>B
   Type code to remove A from first 2 position
   
   */
	
	
		
			
		
	public static String removeAFromFirstTwo(String str) {
		
		
		if(str.length()<3) {
			str= str.replace("A", "");
	       return str;
		}else {
		
		boolean contains= str.substring(0, 2).contains("A");
		
		if (contains==true) {
			String result = str.substring(0, 2).replaceAll("A", "").concat(str.substring(2));
		    return result;
			
		}
		else {
			return str;
		   }
		}
	}
	
	
}
