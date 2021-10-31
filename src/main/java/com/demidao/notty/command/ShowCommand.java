package com.demidao.notty.command;

import com.demidao.notty.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class ShowCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    public ShowCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {

    }
}
