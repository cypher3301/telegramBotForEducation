package com.edication.telegram.bot.telegramboteducationlecture.service;

import com.edication.telegram.bot.telegramboteducationlecture.bot.EducationPairsHelperTelegramBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class SendBotMessageServiceImpl implements SendBotMessageService {

    private final EducationPairsHelperTelegramBot telegramBot;

    @Autowired
    public SendBotMessageServiceImpl(EducationPairsHelperTelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }

    @Override
    public void sendMessage(String chatId, String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.enableHtml(true);
        sendMessage.setText(message);

        try {
            telegramBot.execute(sendMessage);
        } catch (TelegramApiException e) {
            //todo add logging to the project
            e.printStackTrace();
        }


    }
}
