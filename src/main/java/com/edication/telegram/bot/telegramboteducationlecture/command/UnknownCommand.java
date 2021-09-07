package com.edication.telegram.bot.telegramboteducationlecture.command;

import com.edication.telegram.bot.telegramboteducationlecture.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Stop {@link Command}.
 */
public class UnknownCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    private final static String UNKNOWN_MESSAGE = "Я маленький и многого ещё не понимаю, напиши /help что бы узнать что я умею.";


    public UnknownCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }


    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), UNKNOWN_MESSAGE);
    }
}
