package org.example;

import java.util.InputMismatchException;

public class SumCalculator {
    public int sum(int n) {
        int result = 0;
        if (n == 0) {
            throw new IllegalArgumentException("value should be greater than zero");
        }
        try {
            for (int x = 0; x < n + 1; x++) {
                result = result + x;
            }
        }
        catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println("value should be in integer interval and greater than zero " + e.getMessage());
        }
        return result;
    }
}
