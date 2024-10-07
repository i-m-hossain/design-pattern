package com.imran;

import com.imran.memento.Editor;
import com.imran.memento.History;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();
        // Set and save state 1
        editor.setContent("Hello, World!");
        editor.setFontSize(12);
        editor.setFontColor("Black");
        history.push(editor.createState());

        // Set and save state 2
        editor.setContent("Hello, Design Patterns!");
        editor.setFontSize(14);
        editor.setFontColor("Blue");
        history.push(editor.createState());

        // Set and save state 3
        editor.setContent("Learning Memento Pattern");
        editor.setFontSize(16);
        editor.setFontColor("Red");

        System.out.println("current: " + editor.getContent() + ", Font Size: " + editor.getFontSize()
        + ", Font Color: " + editor.getFontColor());

        // Restore to previous state (state 2)
        editor.restore(history.pop());
        System.out.println("Restored to: " + editor.getContent() + ", Font Size: " + editor.getFontSize()
                + ", Font Color: " + editor.getFontColor());

        // Restore to previous state (state 1)
        editor.restore(history.pop());
        System.out.println("Restored to: " + editor.getContent() + ", Font Size: " + editor.getFontSize()
                + ", Font Color: " + editor.getFontColor());
    }
}
