package com.personal.algorithm;

class Power {
    int process(int base, int power) {
        if (power == 0) {
            return 1;
        }
        if (power == 1) {
            return base;
        }
        if (power % 2 == 0) {
            return process(base, power / 2) * process(base, power / 2);
        }
        return base * process(base, power / 2) * process(base, power / 2);
    }
}
