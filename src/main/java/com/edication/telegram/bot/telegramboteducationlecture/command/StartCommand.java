package com.edication.telegram.bot.telegramboteducationlecture.command;

import com.edication.telegram.bot.telegramboteducationlecture.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StartCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    private final static String START_MESSAGE = "Привет. Я образовательный телеграм бот помощник. Я помогу тебе и буду напоминать о начале пар, что это за пары и где они будут проводиться. "+
            "Я ещё маленький и только учусь)";


    public StartCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }


    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), START_MESSAGE);
    }
}
