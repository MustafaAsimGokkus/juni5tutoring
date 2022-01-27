package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class J09PerformanceTest {
 //write up to 1.000.000 on console
	@Test
	void performanceTest() {
		assertTimeout(Duration.ofSeconds(4),()->IntStream.range(0,1000000).forEach(System.out::println));
	}

}
