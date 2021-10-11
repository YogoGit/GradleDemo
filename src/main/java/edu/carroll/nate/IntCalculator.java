package edu.carroll.nate;

public class IntCalculator {
    private static IntCalculator instance = null;

    public static IntCalculator getInstance() {
        if (instance != null) {
            instance = new IntCalculator();
	}
	return instance;
    }

    private IntCalculator() {
    }

    public int add(int num1, int num2) {
	return num1 + num2;
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
