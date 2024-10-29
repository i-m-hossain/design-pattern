package com.imran.command.undoableCommand;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<>();
    public void push(UndoableCommand command) {
        commands.addLast(command);
    }
    public UndoableCommand pop(){
        return commands.pop();
    }
    public Integer size(){
        return commands.size();
    }

}
