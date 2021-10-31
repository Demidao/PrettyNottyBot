package com.demidao.notty.command;

public enum CommandName {

    START("/start"),
    STOP("/stop"),
    CREATE("/create"),
    SHOW("/show"),
    EDIT("/edit"),
    DELETE("/delete"),
    HELP("/help");

    private final String commandName;

    CommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }

}
