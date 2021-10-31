package com.demidao.notty.command;

import com.demidao.notty.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class HelpCommand implements Command {
    private final SendBotMessageService sendBotMessageService;

    public static final String HELP_MESSAGE = String.format("✨<b>Доcтупные команды</b>✨\n\n"

                    + "<b>Начать\\закончить работу с ботом</b>\n\n"
                    + "%s - начать работу со мной\n\n"
                    + "%s - приостановить работу со мной\n\n"
                    + "%s - доступные команды\n\n"
                    + "%s - создать напоминание\n\n"
                    + "%s - посмотреть все напоминания\n\n"
                    + "%s - редактировать\n\n"
                    + "%s - удалить напоминание\n\n",
            CommandName.START.getCommandName(),
            CommandName.STOP.getCommandName(),
            CommandName.HELP.getCommandName(),
            CommandName.CREATE.getCommandName(),
            CommandName.SHOW.getCommandName(),
            CommandName.EDIT.getCommandName(),
            CommandName.DELETE.getCommandName());

    public HelpCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), HELP_MESSAGE);
    }
}
