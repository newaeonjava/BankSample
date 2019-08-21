package com.newaeon.banking;

public class MathUtility {

    public static int factorial(int value) {
        if (value == 0 || value == 1)
            return 1;
        if (value < 0)
            return factorial(-1 * value);
        return value * factorial(value - 1);
    }
}
