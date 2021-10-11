package edu.carroll.nate;

import java.util.Random;

public class IntCalculator {
    private static IntCalculator instance = null;

    public static IntCalculator getInstance() {
        if (instance == null) {
            instance = new IntCalculator();
        }
        return instance;
    }

    private final Random random;

    private IntCalculator() {
        random = new Random();
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int addRandom(int num1, int num2) {
        // Choose a random number that is NOT zero to add to the number.
        // Using addRand ensures that we will never get the same number as add() if the same parameters are given.
        final int result = num1 + num2;
        int randomNum = random.nextInt(result);
        if (randomNum == 0) {
            if (num1 >= 0)
                randomNum++;
            else
                randomNum--;
        }
        return result + randomNum;
    }

    public int subtract(int num1, int num2) {
        return num1 + num2;
    }

    public int multiple(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}
