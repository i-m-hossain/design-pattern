package com.imran.strategy;

public class HighContrastFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Filtering with High Contrast Filter");
    }
}
