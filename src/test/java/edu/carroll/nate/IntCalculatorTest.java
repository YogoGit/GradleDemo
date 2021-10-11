package edu.carroll.nate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class IntCalculatorTest {
    // Run the random tests this many times to try and cover a bunch of potential failures.  Not totally conclusive,
    // but better than single runs.
    private static final int RANDOM_TEST_COUNT = 1000;

    @Test
    public void singletonTest() {
        assertNotNull("getInstance should always return a non-null instance", IntCalculator.getInstance());
    }

    @Test
    public void singletonIdentical() {
        IntCalculator instance1 = IntCalculator.getInstance();
        assertNotNull("getInstance should always return a non-null instance", instance1);
        assertEquals("Fetching the singleton twice should return the exact same instance", instance1, IntCalculator.getInstance());
    }

    @Test
    public void addPositiveIdentical() {
        IntCalculator calc = IntCalculator.getInstance();
        assertNotNull("getInstance should always return a non-null instance", calc);
        assertEquals("2 + 2 == 4", 4, calc.add(2, 2));
    }

    @Test
    public void addPositiveDifferent() {
        IntCalculator calc = IntCalculator.getInstance();
        assertNotNull("getInstance should always return a non-null instance", calc);
        assertEquals("1 + 2 == 3", 3, calc.add(1, 2));
    }

    @Test
    public void addPositiveAndZero() {
        IntCalculator calc = IntCalculator.getInstance();
        assertNotNull("getInstance should always return a non-null instance", calc);
        assertEquals("0 + 2 == 2", 2, calc.add(0, 2));
    }

    @Test
    public void addAllZero() {
        IntCalculator calc = IntCalculator.getInstance();
        assertNotNull("getInstance should always return a non-null instance", calc);
        assertEquals("Adding two zeros should always be zero", 0, calc.add(0, 0));
    }

    @Test
    public void addNegativeZero() {
        IntCalculator calc = IntCalculator.getInstance();
        assertNotNull("getInstance should always return a non-null instance", calc);
        assertEquals("Adding two zeros should always be zero", 0, calc.add(-0, 0));
    }

    @Test
    public void addTwoNegativeZero() {
        IntCalculator calc = IntCalculator.getInstance();
        assertNotNull("getInstance should always return a non-null instance", calc);
        assertEquals("Adding two zeros should always be zero", 0, calc.add(-0, -0));
    }

    @Test
    public void addSillyNotFailure() {
        IntCalculator calc = IntCalculator.getInstance();
        assertNotNull("getInstance should always return a non-null instance", calc);
        assertNotEquals("Adding 2 and 2 should never equal 3", 3, calc.add(2, 2));
    }

    @Test
    public void addRandomPositiveIdentical() {
        IntCalculator calc = IntCalculator.getInstance();
        assertNotNull("getInstance should always return a non-null instance", calc);
        for (int i = 0; i < 1000; i++) {
            final int result = calc.addRandom(2, 2);
            assertNotEquals("random addition to 4 should never equal 4", 4, result);
            assertTrue("Two positive numbers should always result in a positive result", result > 0);
        }
    }

    @Test
    public void addRandomPositiveDifferent() {
        IntCalculator calc = IntCalculator.getInstance();
        assertNotNull("getInstance should always return a non-null instance", calc);
        for (int i = 0; i < RANDOM_TEST_COUNT; i++) {
            final int result = calc.addRandom(2, 3);
            assertNotEquals("random addition to 5 should never equal 5", 5, result);
            assertTrue("Two positive numbers should always result in a positive result", result > 0);
        }
    }
}
