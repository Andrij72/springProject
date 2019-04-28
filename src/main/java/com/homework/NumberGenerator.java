package com.homework;

import java.util.concurrent.atomic.AtomicInteger;

public class NumberGenerator {
    private static AtomicInteger unigueNumber = new AtomicInteger(100);

    public static int getUnigueNumber() {
        return unigueNumber.incrementAndGet();
    }
}

