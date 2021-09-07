package com.edication.telegram.bot.telegramboteducationlecture.command;

import com.edication.telegram.bot.telegramboteducationlecture.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Stop {@link Command}.
 */
public class StopCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    private final static String STOP_MESSAGE = "До встречи. И помни что я ещё маленький)";


    public StopCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }


    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), STOP_MESSAGE);
    }
}
