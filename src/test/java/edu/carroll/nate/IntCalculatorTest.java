package edu.carroll.nate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class IntCalculatorTest {
    @Test
    public void singletonTest() {
	assertNotNull(IntCalculator.getInstance());
    }

    @Test
    public void singletonIdentical() {
        IntCalculator instance1 = IntCalculator.getInstance();
	assertNotNull(instance1);
	assertEquals(instance1, IntCalculator.getInstance());
    }
}
