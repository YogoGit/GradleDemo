package edu.carroll.nate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class IntCalculatorTest {
    // Run the random tests this many times to try and cover a bunch of potential failures.  Not totally conclusive,
    // but better than single runs.
    private static final int RANDOM_TEST_COUNT = 1000;

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

    @Test
    public void addSillyNotFailure() {
        IntCalculator calc = IntCalculator.getInstance();
        assertNotNull(calc);
        assertNotEquals(3, calc.add(2, 2));
    }

    @Test
    public void addRandomPositiveIdentical() {
        IntCalculator calc = IntCalculator.getInstance();
        assertNotNull(calc);
        for (int i = 0; i < 1000; i++) {
            assertNotEquals(4, calc.addRandom(2, 2));
        }
    }

    @Test
    public void addRandomPositiveDifferent() {
        IntCalculator calc = IntCalculator.getInstance();
        assertNotNull(calc);
        for (int i = 0; i < RANDOM_TEST_COUNT; i++) {
            assertNotEquals(4, calc.addRandom(2, 3));
        }
    }
}
