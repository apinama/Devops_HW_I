package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetSumTest {

	@Test
	public void sumTest() {
		Sum junit = new Sum();
		int result = junit.getSum(5, 7);
		assertEquals(12, result);

	}

}
