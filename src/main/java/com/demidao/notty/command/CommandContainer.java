package com.demidao.notty.command;

import com.demidao.notty.service.SendBotMessageService;
import com.google.common.collect.ImmutableMap;

public class CommandContainer {

    private final ImmutableMap<String, Command> commandMap;

    public CommandContainer(SendBotMessageService sendBotMessageService) {

        commandMap = ImmutableMap.<String, Command> builder()
                .put(CommandName.START.getCommandName(), new StartCommand(sendBotMessageService))
                .put(CommandName.STOP.getCommandName(), new StopCommand(sendBotMessageService))
                .put(CommandName.HELP.getCommandName(), new HelpCommand(sendBotMessageService))
                .put(CommandName.CREATE.getCommandName(), new CreateCommand(sendBotMessageService))
                .put(CommandName.DELETE.getCommandName(), new DeleteCommand(sendBotMessageService))
                .put(CommandName.SHOW.getCommandName(), new ShowCommand(sendBotMessageService))
                .put(CommandName.EDIT.getCommandName(), new EditCommand(sendBotMessageService))
                .build();
    }

    public Command retrieveCommand(String commandIdentifier) {
        return commandMap.getOrDefault(commandIdentifier, commandMap.get(CommandName.HELP));
    }
}
