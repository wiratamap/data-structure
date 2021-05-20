package com.personal.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PowerTest {
    @Test
    void process_shouldReturn2_when2PowerWith1() {
        Power power = new Power();
        int expectedResult = 2;

        int result = power.process(2, 1);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void process_shouldReturn4_when2PowerWith2() {
        Power power = new Power();
        int expectedResult = 4;

        int result = power.process(2, 2);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void process_shouldReturn1_when10PowerWith0() {
        Power power = new Power();
        int expectedResult = 1;

        int result = power.process(10, 0);

        Assertions.assertEquals(expectedResult, result);
    }
}
