package com.edication.telegram.bot.telegramboteducationlecture.command;

import com.edication.telegram.bot.telegramboteducationlecture.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Stop {@link Command}.
 */
public class NoCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    private final static String NO_MESSAGE = "Я в данный момент поддерживаю команды, которые начинаються со слеша(/).\n"
            + "Чтобы посмотреть список команд введите /help";


    public NoCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }


    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), NO_MESSAGE);
    }
}
