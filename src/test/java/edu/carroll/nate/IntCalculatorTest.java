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
    
    @Test
    public void addPositiveIdentical() {
        IntCalculator calc = IntCalculator.getInstance();
	assertNotNull(calc);
	assertEquals(4, calc.add(2, 2));
    }

    @Test
    public void addPositiveDifferent() {
        IntCalculator calc = IntCalculator.getInstance();
	assertNotNull(calc);
	assertEquals(3, calc.add(1, 2));
    }

    @Test
    public void addPositiveAndZero() {
        IntCalculator calc = IntCalculator.getInstance();
	assertNotNull(calc);
	assertEquals(2, calc.add(0, 2));
    }

    @Test
    public void addAllZero() {
        IntCalculator calc = IntCalculator.getInstance();
	assertNotNull(calc);
	assertEquals(0, calc.add(0, 0));
    }

    @Test
    public void addNegativeZero() {
        IntCalculator calc = IntCalculator.getInstance();
	assertNotNull(calc);
	assertEquals(0, calc.add(-0, 0));
    }

    @Test
    public void addTwoNegativeZero() {
        IntCalculator calc = IntCalculator.getInstance();
	assertNotNull(calc);
	assertEquals(0, calc.add(-0, -0));
    }
}
