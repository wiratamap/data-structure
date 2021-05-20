package com.personal.algorithm;

class Power {
    int process(int base, int power) {
        if (power == 0) {
            return 1;
        }
        if (power == 1) {
            return base;
        }
        int result = base;
        for (int i = 0; i < power - 1; i++) {
            result *= base;
        }
        return result;
    }
}
