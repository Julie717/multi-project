package com.buyalskaya.task1;

import java.util.stream.Stream;

import static com.buyalskaya.task1.StringUtils.isPositiveNumber;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        return Stream.of(str).allMatch(s -> isPositiveNumber(s));
    }
}