package mx.tec.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	StringCalculator calculator = new StringCalculator();
	
	@Test
	void givenCalculatorWhenAddEmptyStringThenZero() {
		int expectedResult = 0;
		String numbers = "";
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void givenCalculatorWhenAdd1Then1() {
		int expectedResult = 1;
		String numbers = "1";
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void givenCalculatorWhenAdd1Comma2Then3() {
		int expectedResult = 3;
		String numbers = "1,2";
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void givenCalculatorWhenAdd1_3_5_7_9Then25() {
		int expectedResult = 25;
		String numbers = "1,3,5,7,9";
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}

}
