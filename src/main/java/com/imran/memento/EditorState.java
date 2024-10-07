package com.imran.memento;

public class EditorState {
    private final  String content;
    private final  String fontColor;
    private final int fontSize;

    public EditorState(String content,String fontColor, int fontSize) {
        this.content =content;
        this.fontColor = fontColor;
        this.fontSize =fontSize;
    }

    public String getContent() {
        return content;
    }
    public String getFontColor(){
        return fontColor;
    }
    public int getFontSize(){
        return fontSize;
    }
}
