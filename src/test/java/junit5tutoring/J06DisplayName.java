package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class J06DisplayName {

	@Test
	@DisplayName("it is catching Null Pointer Exception")
	void testException01() {
		String str = null;
		assertThrows(Exception.class,()->{
			System.out.println("exc. runs here");
			str.length();
		});
	}

}
