package com.imran.statePattern;

public class TextBox implements  Tool {

    @Override
    public void mouseDown() {
        System.out.println("Text box icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("draw a text box");
    }

}
