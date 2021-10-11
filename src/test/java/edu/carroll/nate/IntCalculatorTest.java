package edu.carroll.nate;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class IntCalculatorTest {
    @Test
    public void firstTest() {
	assertNotNull(IntCalculator.getInstance());
    }
}
