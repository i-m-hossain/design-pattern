package com.imran.memento;

public class Editor {
    private  String content;
    private int fontSize;
    private String fontColor;
    

    public String getContent() {
        return content;
    }
    public int getFontSize() {
        return fontSize;
    }
    public String getFontColor() {
        return fontColor;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setFontSize(int size){
        this.fontSize = size;
    }
    public void setFontColor(String fontColor){
        this.fontColor = fontColor;
    }

    public EditorState createState(){
        return new EditorState(content, fontColor, fontSize);
    }

    public void restore(EditorState state){
        this.content = state.getContent();
        this.fontColor = state.getFontColor();
        this.fontSize=state.getFontSize();
    }
    
}
