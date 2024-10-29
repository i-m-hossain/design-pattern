package com.imran.command.undoableCommand;

import com.imran.command.fx.Command;

public interface UndoableCommand extends Command {
    void unexecute();

}
