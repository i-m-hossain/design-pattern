package com.imran.command;

import com.imran.command.fx.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Resize command");
    }
}
