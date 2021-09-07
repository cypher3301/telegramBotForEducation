package com.edication.telegram.bot.telegramboteducationlecture.service;

/**
 * Service for sending messages via telegram-bot.
 */
public interface SendBotMessageService {

    /**
     * Send message via telegram-bot
     *
     * @param chatId provided id of concrete chat in witch massage would be sent.
     * @param message provided massage to be sent.
     */
    void sendMessage(String chatId, String message);
}
