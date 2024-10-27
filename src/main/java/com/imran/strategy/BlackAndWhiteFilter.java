package com.imran.strategy;

public class BlackAndWhiteFilter implements  Filter{

    @Override
    public void apply(String fileName) {
        System.out.println("filtering with black and white filter");
    }
}
