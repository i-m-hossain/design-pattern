package com.imran.statePattern;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
        
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new TextBox());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
