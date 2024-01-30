package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator sumCalculator;
    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void testThatSumTestIsCorrect() {
        Map<Integer, Integer> testVariant = new LinkedHashMap<>();
        testVariant.put(1,1);
        testVariant.put(2,3);
        testVariant.put(3,6);
        testVariant.put(4,10);
        testVariant.put(99999,704982704);

        testVariant.forEach((value, expectedSum) -> {
            assertEquals(expectedSum
                    ,sumCalculator.sum(value)
                    ,String.format("Error in %s value: %d, expected: %d", this.getClass().getName(), value, expectedSum)
            );
        });
    }
    @Test
    void testThatSumTestIsNotCorrect() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
//        Map<Integer, Integer> testVariant = new LinkedHashMap<>();
//        testVariant.put(0,0);
//
//        testVariant.forEach((value, expectedSum) -> {
//            assertEquals(expectedSum
//                    ,sumCalculator.sum(value)
//                    ,String.format("Error in %s value: %d, expected: %d", this.getClass().getName(), value, expectedSum)
//            );
//        });
    }

}