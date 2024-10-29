package com.imran.command;

import com.imran.command.fx.Button;
import com.imran.command.fx.Command;

public class Main {
    public static void main(String[] args) {
        Command command = new AddCustomerCommand(new CustomerService());
        Button button = new Button(command);
        button.click();


        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.add(new ResizeCommand());
        compositeCommand.add(new BlackAndWhiteCommand());
        compositeCommand.execute();
    }
}
