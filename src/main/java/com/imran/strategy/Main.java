package com.imran.strategy;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageStorage storage =  new ImageStorage();
        storage.store("file1", new JpegCompressor(), new BlackAndWhiteFilter());
        storage.store("file1", new PngCompressor(), new HighContrastFilter());
    }
}
