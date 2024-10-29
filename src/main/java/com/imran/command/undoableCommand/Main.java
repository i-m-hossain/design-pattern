package com.imran.command.undoableCommand;

public class Main {
    public static void main(String[] args) {
        History history = new History();
        HtmlDocument document = new HtmlDocument();
        document.setContent("Hello world");
        UndoableCommand boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent()); //<b>Hello world</b>
        Command undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent()); //Hello world
        boldCommand.execute();
        System.out.println(document.getContent()); //<b>Hello world</b>
        undoCommand.execute();
        System.out.println(document.getContent()); //Hello world
    }
}
