package com.imran.command.undoableCommand;

public class HtmlDocument {
    private String content;

    public void makeBold(){
        content = "<b>" + content + "</b>";
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
